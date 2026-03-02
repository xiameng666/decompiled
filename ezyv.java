import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.ServiceSpecificException;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.telephony.TelephonyManager;
import android.util.StatsEvent.Builder;
import android.util.StatsEvent;
import android.util.StatsLog;
import android.view.WindowManager;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class ezyv extends ezyn implements faaq {
    public static final baun g;
    public static final fagu h;
    public static final fagu i;
    public final Context j;
    public final ezxl k;
    public final ezxs l;
    private static final fagu m;
    private static final fagu n;
    private static final fagp o;
    private static final fagf p;
    private static final fagp q;
    private final fagt r;
    private final ezyd s;

    static {
        ezyv.g = fabk.e("AbRebootAction");
        ezyv.h = new fagu("file_path", "");
        ezyv.i = new fagu("payload_metadata_file_path", "");
        ezyv.m = new fagu("installation_success_message", "");
        ezyv.n = new fagu("installation_failure_message", "");
        Long long0 = (long)-1L;
        ezyv.o = new fagp("boot_token", long0);
        ezyv.p = new fagf("reboot_prepared", Boolean.valueOf(false));
        ezyv.q = new fagp("last_switch_slot_failed_time", long0);
    }

    public ezyv(Context context0, fagj fagj0) {
        super("ab-reboot", fagj0);
        this.j = context0;
        this.r = (fagt)fagt.a.b();
        this.k = (ezxl)ezxl.h.b();
        this.l = (ezxs)ezxs.l.b();
        this.s = (ezyd)ezyd.b.b();
    }

    @Override  // ezyj
    public final ezyi a() {
        int v12;
        int v14;
        boolean z1;
        ezxs ezxs1;
        gfsx gfsx0;
        hlnn hlnn0 = faaa.c();
        if(ezwj.a().booleanValue() && ezwr.h(hlnn0) && !this.i()) {
            ezyv.g.h("Bypassing the self-update check.", new Object[0]);
        }
        else if(ezwr.h(hlnn0)) {
            fagu fagu0 = ezyv.m;
            if(!((String)this.c(fagu0)).isEmpty()) {
                Intent intent0 = ezxa.b(((String)this.c(fagu0)));
                this.j.startActivity(intent0);
            }
            this.l.u(5, -1.0);
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        boolean z = true;
        if(this.i() && !ezwr.h(hlnn0)) {
            if(hwar.a.b().a()) {
                StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
                statsEvent$Builder0.setAtomId(202000);
                statsEvent$Builder0.writeBoolean(true);
                statsEvent$Builder0.usePooledBuffer();
                StatsLog.write(statsEvent$Builder0.build());
            }
            this.l.u(0x512, -1.0);
            fagu fagu1 = ezyv.n;
            if(!((String)this.c(fagu1)).isEmpty()) {
                Intent intent1 = ezxa.b(((String)this.c(fagu1)));
                this.j.startActivity(intent1);
            }
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        if(ezwr.g(hlnn0)) {
            this.l.u(0x310, -1.0);
            return new ezyi("ab-reboot", this.g(false), true, new ezyr(this));
        }
        ezxs ezxs0 = this.l;
        SystemUpdateStatus systemUpdateStatus0 = ezxs0.b();
        if(gfta.c(systemUpdateStatus0.a)) {
            ezxs0.u(0, -1.0);
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        ggdy ggdy0 = new ggdy();
        try {
            if(hvzq.d() && ((long)ezwi.c()) > 0L) {
                goto label_35;
            }
            goto label_57;
        }
        catch(ezyu ezyu0) {
            goto label_123;
        }
        try {
        label_35:
            if(ezwc.b(this.j, "/data", true) < ((long)ezwi.c())) {
                goto label_51;
            }
            goto label_57;
        }
        catch(IOException iOException0) {
        }
        catch(Throwable unused_ex) {
            goto label_45;
        }
        try {
            ezyv.g.g("Unable to determine post-reboot free space.", iOException0, new Object[0]);
        }
        catch(Throwable unused_ex) {
            goto label_45;
        }
        try {
            this.l.u(0x810, -1.0);
            this.h(false);
            ezze ezze0 = new ezze();
            ezze0.f(hvzq.b());
            ezze0.d("ab-reboot", this.g(false));
            return ezze0.a();
        label_45:
            this.l.u(0x810, -1.0);
            this.h(false);
            ezze ezze1 = new ezze();
            ezze1.f(hvzq.b());
            ezze1.d("ab-reboot", this.g(false));
            return ezze1.a();
        label_51:
            this.l.u(0x810, -1.0);
            this.h(false);
            ezze ezze2 = new ezze();
            ezze2.f(hvzq.b());
            ezze2.d("ab-reboot", this.g(false));
            return ezze2.a();
        label_57:
            long v = System.currentTimeMillis();
            long v1 = (long)(((Long)this.c(ezyv.q)));
            long v2 = hvxw.c();
            double f = hvxw.b();
            long v3 = hvxw.d();
            long v4 = v1 + Math.min(((long)(((int)Math.pow(f, systemUpdateStatus0.G - 1)))) * v2, v3);
            if(systemUpdateStatus0.c == 0x910 && v < v4) {
                ezze ezze3 = new ezze();
                ezze3.f(v4 - v);
                ezze3.d("ab-reboot", this.b());
                return ezze3.a();
            }
            if(!systemUpdateStatus0.j) {
                Context context0 = this.j;
                if(ezwy.f(context0, systemUpdateStatus0, true)) {
                    this.l.u(0x210, -1.0);
                    this.h(true);
                    SystemUpdateStatus systemUpdateStatus1 = this.l.b();
                    this.s.b(systemUpdateStatus1);
                    return new ezyi("ab-reboot", this.g(true), null);
                }
                if(ezwy.e(context0, systemUpdateStatus0, true)) {
                    this.l.u(0x110, -1.0);
                    this.h(false);
                    SystemUpdateStatus systemUpdateStatus2 = this.l.b();
                    this.s.b(systemUpdateStatus2);
                    return new ezyi("ab-reboot", this.g(false), null);
                }
                if(ezwq.e()) {
                    ezxl ezxl0 = this.k;
                    long v5 = ezxl0.c();
                    long v6 = System.currentTimeMillis();
                    long v7 = SystemClock.elapsedRealtime();
                    ezwv ezwv0 = ezwv.a(context0, systemUpdateStatus0.n);
                    if(ezwu.c(systemUpdateStatus0)) {
                        gfsx0 = gfqx.a;
                    }
                    else if(ezwv0.a != 0) {
                        gfsx0 = gfqx.a;
                    }
                    else if(!ezwq.d(context0, systemUpdateStatus0, v6, v7, v5)) {
                        gfsx0 = gfsx.m(new ezwb(0x710, ezwq.b(context0, systemUpdateStatus0, v6, v7, v5)));
                    }
                    else {
                        gfsx0 = gfqx.a;
                    }
                    if(gfsx0.i()) {
                        if(((ezwb)gfsx0.d()).a == 0x710) {
                            ezxl0.n(context0);
                            ezxl0.j();
                        }
                        int v8 = ((ezwb)gfsx0.d()).a;
                        this.l.u(v8, -1.0);
                        this.h(true);
                        fagj fagj0 = this.g(true);
                        ezze ezze4 = new ezze();
                        ezze4.f(((ezwb)gfsx0.d()).b);
                        ezze4.d("ab-reboot", fagj0);
                        ezze4.g(((ezwb)gfsx0.d()).c);
                        return ezze4.a();
                    }
                }
            }
            if(((Boolean)ezwo.d(hvzy.k, Boolean.class)).booleanValue()) {
                WindowManager windowManager0 = (WindowManager)this.j.getSystemService("window");
                if(windowManager0 == null) {
                    ezyv.g.m("Couldn\'t get WindowManager to determine whether to use quiescent mode.", new Object[0]);
                }
                else if(windowManager0.getDefaultDisplay().getState() != 2) {
                    ggdy0.i(hwcf.a.b().a());
                }
            }
            ezxs1 = this.l;
            ezxs1.u(0x310, -1.0);
            this.h(true);
        }
        catch(ezyu ezyu0) {
        label_123:
            ezyv.g.n("Failed to switch boot slot.", ezyu0, new Object[0]);
            ezxs ezxs2 = (ezxs)ezxs.l.b();
            int v9 = ((int)(((Integer)ezxs2.n.b(ezxs.j)))) + 1;
            fagh[] arr_fagh = new fagh[1];
            Integer integer0 = v9;
            arr_fagh[0] = new fagh(ezxs.j, integer0);
            ezxs2.n.e(arr_fagh);
            ezxs2.p();
            ezxs2.o();
            baun baun0 = ezxs.a;
            baun0.d("Switch slot failed %d times.", new Object[]{integer0});
            if(((long)v9) >= hvxw.e()) {
                baun0.h("Reached switch slot failure threshold (%d). Resetting update", new Object[]{hvxw.e()});
                ezxs2.n();
            }
            else {
                z = false;
            }
            ezxs2.u(0x910, -1.0);
            if(z) {
                return new ezyi("finished-execution", fagj.b(new fagh[0]));
            }
            int v10 = ezxs2.b().G;
            ezzb ezzb0 = new ezzb();
            ezzb0.f(hvxw.c(), hvxw.d());
            ezzb0.g(hvxw.b());
            ezzb0.h(v10);
            fagi fagi0 = this.g(false).a();
            fagi0.e(ezyv.q, Long.valueOf(System.currentTimeMillis()));
            ezzb0.d("ab-reboot", fagi0.a());
            return ezzb0.a();
        }
        Context context1 = this.j;
        if(!ezwq.f(context1, systemUpdateStatus0)) {
            if(!ezxs1.D(context1)) {
                ezyv.g.m("Should not resume on reboot: feature is unavailable.", new Object[0]);
                z1 = false;
            }
            else if(ezwc.n(context1) && this.k.o()) {
                z1 = true;
            }
            else {
                ezyv.g.m("Should not resume on reboot: preparation required but LSKF not yet captured.", new Object[0]);
                z1 = false;
            }
            if(!z1) {
                Object[] arr_object = {Boolean.valueOf(hwbm.d())};
                ezyv.g.h("Resume on reboot feature enabled: %s.", arr_object);
            }
            int v11 = z1 ? ezxl.q(context1) ^ 1 : 0;
            if(!systemUpdateStatus0.C) {
                if(ezwc.d(context1).isEmpty() || !ezxs1.B(context1)) {
                    v12 = 0;
                }
                else if(!ezwc.n(context1)) {
                label_181:
                    baun baun1 = ezxl.a;
                    baun1.h("Preparing auto-sim-unlocking for unattended reboot.", new Object[0]);
                    TelephonyManager telephonyManager0 = (TelephonyManager)this.k.i.getSystemService("phone");
                    if(telephonyManager0 == null) {
                        v14 = 0;
                    }
                    else {
                        int v13 = telephonyManager0.prepareForUnattendedReboot();
                        baun1.h("Telephony unattended reboot preparation result code: %d", new Object[]{v13});
                        v14 = v13 == 0 ? 1 : 0;
                    }
                    v12 = v14 ^ 1;
                    if(v14 == 0) {
                        Long long0 = (long)(((long)(((Long)ezxs1.n.b(ezxs.h)))) + 1L);
                        ezxs.a.f("Failed to prepare for auto sim unlocking %d times.", new Object[]{long0});
                        fagh[] arr_fagh1 = {new fagh(ezxs.h, long0)};
                        ezxs1.n.e(arr_fagh1);
                    }
                }
                else if(!ezxs1.E(context1)) {
                    v12 = 0;
                    ezxs.a.m("RoR feature disabled. Skip auto SIM unlock preparation.", new Object[0]);
                }
                else {
                    v12 = 0;
                    ezxl ezxl1 = ezxs1.p;
                    if(ezxl1.p()) {
                        if(!ezxl1.o()) {
                            ezxs.a.m("RoR lock screen knowledge factor not captured. Skip auto SIM unlock preparation.", new Object[0]);
                            goto label_201;
                        }
                        goto label_181;
                    }
                    else {
                        ezxs.a.m("RoR not prepared. Skip auto SIM unlock preparation.", new Object[0]);
                    }
                }
            label_201:
                if(v11 == 0 && v12 == 0) {
                    return z1 ? new ezyi("ab-reboot", this.g(true), true, new ezys(this, ggdy0, systemUpdateStatus0)) : new ezyi("ab-reboot", this.g(true), true, new ezyt(this, ggdy0, systemUpdateStatus0));
                }
                ezyv.g.h("Failed to prepare for resume-on-reboot.", new Object[0]);
                if(hwbm.a.c().c()) {
                    ezxs1.p();
                }
                ezxs1.o();
                ezxs1.u(0x210, -1.0);
                return new ezyi("ab-reboot", this.g(true), null);
            }
            return !z1 || v11 != 0 ? new ezyi("ab-reboot", this.g(true), true, new ezyt(this, ggdy0, systemUpdateStatus0)) : new ezyi("ab-reboot", this.g(true), true, new ezys(this, ggdy0, systemUpdateStatus0));
        }
        ezxs1.u(1041, -1.0);
        ezxs1.p();
        ezyv.g.f("Delaying reboot due to phone call in progress / ringing.", new Object[0]);
        ezze ezze5 = new ezze();
        ezze5.f(hvzz.c());
        ezze5.d("ab-reboot", this.g(true));
        return ezze5.a();
    }

    @Override  // faaq
    public final void f(int v, int v1, float f) {
        if(v == 4) {
            int v2 = this.l.b().c;
            this.l.u(v2, ((double)f));
        }
    }

    private final fagj g(boolean z) {
        fagi fagi0 = this.b().a();
        Long long0 = this.k.b();
        fagi0.e(ezyv.o, long0);
        if(z) {
            String s = ezwj.m();
            fagi0.e(ezyv.m, s);
            String s1 = ezwj.l();
            fagi0.e(ezyv.n, s1);
            fagi0.e(ezyv.p, Boolean.valueOf(true));
            return fagi0.a();
        }
        fagi0.e(ezyv.p, Boolean.valueOf(false));
        return fagi0.a();
    }

    private final void h(boolean z) {
        gfsx gfsx1;
        fafn fafn2;
        gfsx gfsx0 = (gfsx)this.r.b(ezyq.i);
        if(!gfsx0.i()) {
            if(!hvxw.g()) {
                return;
            }
            throw new ezyu("AB payload spec is not present.");
        }
        String s = (String)this.c(ezyv.i);
        boolean z1 = hwaf.a.b().a() && bbqa.c() && !gfta.c(s);
        faar faar0 = new faar();
        faar0.e(this);
        try {
            faar0.c();
            if(z1) {
                batl.c(faar0.e.get(), "bind() must be called before setSwitchSlotOnReboot()");
                if(!bbqa.c()) {
                    throw new UnsupportedOperationException("New slot switch API only available in T+");
                }
                if(faar0.d.get()) {
                    gfsx1 = gfsx.m(Integer.valueOf(faar0.c.get()));
                }
                else {
                    fabh fabh0 = faar0.g;
                    Integer integer0 = fabh0.b();
                    if(!faar.b.contains(integer0)) {
                        throw new IllegalStateException(String.format("Cannot change slot switch state while update engine status is %d", fabh0.b()));
                    }
                    if(!faar0.j(z)) {
                        baun baun0 = faar.a;
                        baun0.h("Setting slot switch to: " + z, new Object[0]);
                        if(z) {
                            AtomicInteger atomicInteger0 = faar0.c;
                            atomicInteger0.set(-1);
                            fabh.a.h("setShouldSwitchSlotOnReboot()", new Object[0]);
                            fabh0.d(new faba(fabh0, s), true);
                            faar0.i(new faan());
                            if(atomicInteger0.get() == 0) {
                                faar0.h(true);
                            }
                            else {
                                baun0.h("Slot switch operation completed with non-success code: " + atomicInteger0.get(), new Object[0]);
                                faar0.f.e(new fagh[]{new fagh(ezyq.n, ((int)0))});
                            }
                            gfsx1 = gfsx.m(Integer.valueOf(atomicInteger0.get()));
                        }
                        else {
                            fabh.a.h("resetShouldSwitchSlotOnReboot()", new Object[0]);
                            fabh0.d(new faau(fabh0), true);
                            faar0.h(false);
                            gfsx1 = gfqx.a;
                        }
                    }
                    else if(z) {
                        gfsx1 = gfsx.m(Integer.valueOf(0));
                    }
                    else {
                        gfsx1 = gfqx.a;
                    }
                }
            }
            else {
                if(gfta.c(s)) {
                    fafn2 = (fafn)gfsx0.d();
                }
                else {
                    fafn fafn0 = (fafn)gfsx0.d();
                    File file0 = hrnt.i() ? new File(ccsb.a.a(s)) : new File(s);
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fafn0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)fafn0));
                    String s1 = "file://" + file0.getAbsolutePath();
                    if(!((fafm)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((fafm)hftp0))).ensureMutable();
                    }
                    ((fafn)((fafm)hftp0).b_message).c = s1;
                    fafo fafo0 = fafn0.e == null ? fafo.a : fafn0.e;
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fafo0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)fafo0));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((fafo)hftp1.b_message).b = 0L;
                    if(!((fafm)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((fafm)hftp0))).ensureMutable();
                    }
                    fafn fafn1 = (fafn)((fafm)hftp0).b_message;
                    fafo fafo1 = (fafo)hftp1.N_build();
                    fafo1.getClass();
                    fafn1.e = fafo1;
                    fafn1.b |= 1;
                    fafn2 = (fafn)((ProtoLiteBuilder)(((fafm)hftp0))).N_build();
                }
                ArrayList arrayList0 = new ArrayList();
                ggqk ggqk0 = faaa.b(this.j).E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    arrayList0.add(((String)((kau)object0).a) + "=" + ((String)((kau)object0).b));
                }
                if(faar0.j(z)) {
                    gfsx1 = z ? gfsx.m(Integer.valueOf(0)) : gfqx.a;
                }
                else if(!((Boolean)ezwo.a(hwcl.a, Boolean.class)).booleanValue() || bbqa.c() || !SystemProperties.getBoolean("ro.virtual_ab.enabled", false)) {
                    if(z) {
                    label_53:
                        ggdy ggdy0 = new ggdy();
                        ggdy0.i("RUN_POST_INSTALL=0");
                        ggdy0.k(arrayList0);
                        gfsx1 = gfsx.m(Integer.valueOf(faar0.b(fafn2, ggdy0.h())));
                    }
                    else {
                        faar0.d();
                        gfsx1 = gfqx.a;
                    }
                }
                else if(!z) {
                    faar.a.m("Ignoring slot unset on device using virtual A/B on platform R or S.", new Object[0]);
                    gfsx1 = gfqx.a;
                }
                else {
                    goto label_53;
                }
            }
            if(hvxw.g() && gfsx1.i() && ((int)(((Integer)gfsx1.d()))) != 0) {
                throw new ezyu("Failed to set slot switch to: " + z + " Update engine error code: " + gfsx1.d().toString());
            }
        }
        catch(fabe | InterruptedException | RemoteException | ServiceSpecificException | IllegalStateException throwable0) {
            if(hvxw.g()) {
                throw new ezyu("Failed to set slot switch to: " + z, throwable0);
            }
            ezyv.g.n("Error when calling SynchronizedUpdateEngine.setSwitchSlotOnReboot().", throwable0, new Object[0]);
        }
        finally {
            faar0.g();
        }
    }

    private final boolean i() {
        return ((Boolean)this.c(ezyv.p)).booleanValue() && ((long)(((Long)this.c(ezyv.o)))) != this.k.b();
    }
}

