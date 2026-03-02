import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class bpnn implements bpnm {
    private static final bboh a;
    private final bnro b;
    private final bpnh c;
    private final bpvx d;
    private final fqxe e;
    private final bpde f;

    static {
        bpnn.a = bboh.b("SpotInitializer", bbcu.eD);
    }

    public bpnn() {
        bpde bpde0 = null;
        bopm bopm0 = bpsr.b() || bopl.Y() ? bopl.X() : null;
        bopm bopm1 = !bpsr.b() && !bopl.Y() || !hsxd.g() ? null : bopl.X();
        if(!bpsr.b()) {
            boolean z = !bopl.Y();
        }
        super();
        this.b = bopm0 == null ? null : ((boox)bopm0).f();
        this.c = bopm0 == null ? null : bopm0.w();
        this.d = bopm1 == null ? null : ((boox)bopm1).M();
        this.e = bopm0 == null ? null : ((boox)bopm0).h();
        if((hsww.r() || hsww.q()) && bopm0 != null) {
            bpde0 = ((boox)bopm0).J();
        }
        this.f = bpde0;
    }

    @Override  // bpnm
    public final void a(Context context0) {
        bnro bnro0 = this.b;
        if(bnro0 == null) {
            ((ggtj)bpnn.a.h()).x("All Finder use cases are disabled.");
            return;
        }
        fqxe fqxe0 = this.e;
        if(fqxe0 != null) {
            fquh.a("Maybe set first startup time", ((boul)fqxe0).i(gfqx.a));
        }
        bpde bpde0 = this.f;
        if(bpde0 != null) {
            fquh.a("Maybe re-issue LKL auto-enrollment notification", gdta.g(((bpik)bpde0).e.f()).i(new bpho(((bpik)bpde0)), ((bpik)bpde0).m));
        }
        List list0 = hsww.a.b().k() ? bpsq.g(context0) : bbmn.h(context0, "com.google.android.gms");
        cljp cljp0 = cljp.a(context0);
        bopm bopm0 = bopl.X();
        if(hsww.k()) {
            if(!list0.isEmpty()) {
                bprs.q(cljp0);
            }
            if(hrwa.j()) {
                clks clks0 = new clks();
                clks0.w("com.google.android.gms.findmydevice.spot.sync.AccountChangesSyncService");
                clks0.q("FMD_SPOT_P_ACS");
                clks0.l(false);
                clks0.m(((int)hsxv.w()));
                clks0.v(2);
                bprs.s("periodic SPOT account changes sync", cljp0, clks0.a());
            }
            else {
                clkq clkq0 = bprs.c();
                clkq0.w("com.google.android.gms.findmydevice.spot.sync.AccountChangesSyncService");
                clkq0.q("FMD_SPOT_P_ACS");
                clkq0.y(2, 2);
                bprs.s("Periodic SPOT account changes sync", cljp0, clkq0.a());
            }
        }
        if(!hsww.k() || list0.isEmpty()) {
            hsww.k();
            bprs.i(cljp0);
            cljp0.c("com.google.android.gms.findmydevice.spot.sync.AccountChangesSyncService");
        }
        if(!bpsr.a() || list0.isEmpty()) {
            bpsr.a();
            cljp0.c("com.google.android.gms.findmydevice.spot.sync.EidCachingService");
            cljp0.c("com.google.android.gms.findmydevice.spot.sync.DeviceSyncService");
        }
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                booz booz0 = bopm0.R().a(((Account)object0));
                gdta gdta0 = gdta.g(booz0.c().d());
                bprn bprn0 = new bprn();
                gdta gdta1 = gdta0.e(Throwable.class, bprn0, gmap.a).i(new bpro(cljp0, ((Account)object0)), booz0.e());
                bprp bprp0 = new bprp();
                arrayList0.add(gdta1.e(Throwable.class, bprp0, gmap.a));
            }
            fquh.a("Scheduling SPOT daily sync tasks", gdta.g(gmbu.o(arrayList0)).h(new bprq(cljp0), gmap.a));
        }
        if(hrwa.j()) {
            clks clks1 = new clks();
            clks1.w("com.google.android.gms.findmydevice.spot.service.FindMyDeviceModuleSettingsLoggerService");
            clks1.q("FMD_SPOT_P_LFS");
            clks1.a = clkz.l;
            clks1.l(false);
            clks1.v(2);
            clla clla0 = clks1.a();
            cljp.a(context0).f(clla0);
        }
        else {
            clkq clkq1 = new clkq();
            clkq1.q("FMD_SPOT_P_LFS");
            clkq1.w("com.google.android.gms.findmydevice.spot.service.FindMyDeviceModuleSettingsLoggerService");
            clkq1.j(clkm.l);
            clkq1.v(2);
            clkr clkr0 = clkq1.a();
            cljp.a(context0).f(clkr0);
        }
        bpnh bpnh0 = this.c;
        if(bpnh0 != null) {
            if(!hsww.k() && !hsww.i()) {
                ((ggtj)bpnn.a.h()).x("Self location reporting and offline beacon are disabled.");
                Intent intent0 = new Intent().setClassName(bpnh0.a, "com.google.android.gms.findmydevice.spot.bleadvertising.OfflineBeaconService_Persistent");
                bpnh0.a.stopService(intent0);
            }
            else {
                bpnh0.a();
            }
        }
        if(bpsr.a()) {
            fquh.a("EID cache loader", bnro0.a());
        }
        else {
            synchronized(((bnrt)bnro0).d) {
                ((gmcd)((bnrt)bnro0).e.f(gmbu.g())).cancel(false);
                ((bnrt)bnro0).e = gfqx.a;
            }
            ((bnrt)bnro0).b.d();
            fquh.a("Clear EID cache", ((bnrt)bnro0).c.d());
        }
        if(hsxd.g()) {
            bpvx bpvx0 = this.d;
            if(bpvx0 != null) {
                fquh.a("announceFinderWearableDeviceCompanionCapability", bpvx0.a());
            }
        }
    }
}

