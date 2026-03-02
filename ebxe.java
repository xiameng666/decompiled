import android.accounts.Account;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings.Global;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.EmoneyCardFinishSetupStatusData;
import com.google.android.gms.pay.ProvisionSePrepaidCardRequest;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collection;

public final class ebxe implements dnqb {
    public static final bboh a;
    public Context b;
    public bbng c;
    public String d;
    public ebwn e;
    public dxyx f;
    public ibrt g;
    public gmcg h;
    public ebst i;
    public easd j;
    public azts k;
    private dmqb l;

    static {
        ebxe.a = bboh.b("Pay", bbcu.cZ);
    }

    private static final boolean A(dymw dymw0) {
        return dymw0.b == 1 || dymw0.b == 2;
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        this.x();
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebxe.a.j()).B("%s: Active account not found!", "PendingSeProvisioningTaskOperation");
            return 2;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        ibuq.e(accountInfo0.a, "getAccountId(...)");
        String s = this.g();
        dycl dycl0 = new dycl(accountInfo0.a, s);
        Object object0 = dycl0.b().get();
        ibuq.e(object0, "get(...)");
        if(ebxe.A(((dymw)object0))) {
            Bundle bundle0 = cllr0.b;
            if(bundle0 != null && bundle0.getBoolean("KEY_READINESS_CHECK_DONE")) {
                int v = ((dymw)object0).b;
                if(v == 1) {
                    this.n(accountInfo0, ((dymw)object0), dycl0);
                    return 0;
                }
                if(v == 2) {
                    this.m(accountInfo0, ((dymw)object0), dycl0);
                    return 0;
                }
            }
            else {
                if(bundle0 != null && bundle0.getBoolean("KEY_PACKAGES_ADDED")) {
                    this.z(accountInfo0, dycl0);
                    return 0;
                }
                if(!ebss.d(context0)) {
                    Context context1 = this.c();
                    ibuq.f(context1, "context");
                    long v1 = hwsd.a.E().L() / 1000L;
                    clkn clkn0 = new clkn();
                    clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
                    clkn0.q("felica.emoney.provision.dependency.timeout");
                    clkn0.g(2);
                    clkn0.e(v1, 1L + v1);
                    clkn0.v(1);
                    clko clko0 = clkn0.a();
                    cljp.a(context1).f(clko0);
                }
                if(Settings.Global.getInt(context0.getContentResolver(), "device_provisioned", 0) == 0) {
                    ebxc ebxc0 = new ebxc(this, accountInfo0, dycl0);
                    this.c().getContentResolver().registerContentObserver(Settings.Global.getUriFor("device_provisioned"), false, ebxc0);
                    return 0;
                }
                this.o(accountInfo0, dycl0);
            }
        }
        return 0;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        ibuq.f(context0, "context");
        this.x();
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebxe.a.h()).B("%s: Active account not found!", "PendingSeProvisioningTaskOperation");
            return;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        if(fhcd.g(context0)) {
            ((ggtj)ebxe.a.h()).B("%s: onInitializeTasks invoked from direct boot", "PendingSeProvisioningTaskOperation");
            ebst ebst0 = this.d();
            ibuq.e(accountInfo0.b, "getAccountName(...)");
            ebst0.a(accountInfo0.b, 0x35117);
            return;
        }
        ibuq.e(accountInfo0.a, "getAccountId(...)");
        String s = this.g();
        dycl dycl0 = new dycl(accountInfo0.a, s);
        Object object0 = dycl0.b().get();
        ibuq.e(object0, "get(...)");
        if(ebxe.A(((dymw)object0))) {
            if(((dymw)object0).d > 0L) {
                this.v();
                if(System.currentTimeMillis() - ((dymw)object0).d > hwsd.f()) {
                    ((glyq)dycl0.a()).u();
                    ebwn ebwn0 = this.e();
                    ibuq.e("Your transit card could not be added", "getString(...)");
                    ebwn.e(ebwn0, "Your transit card could not be added");
                    ebst ebst1 = this.d();
                    ibuq.e(accountInfo0.b, "getAccountName(...)");
                    ebst1.a(accountInfo0.b, 0x319FE);
                    return;
                }
            }
            ebwx.a(context0, 0L, false, false, 14);
        }
    }

    public final Context c() {
        Context context0 = this.b;
        if(context0 != null) {
            return context0;
        }
        ibuq.j("appContext");
        return null;
    }

    public final ebst d() {
        ebst ebst0 = this.i;
        if(ebst0 != null) {
            return ebst0;
        }
        ibuq.j("emoneyOperationUtils");
        return null;
    }

    public final ebwn e() {
        ebwn ebwn0 = this.e;
        if(ebwn0 != null) {
            return ebwn0;
        }
        ibuq.j("notificationManager");
        return null;
    }

    public final gmcg f() {
        gmcg gmcg0 = this.h;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("defaultExecutor");
        return null;
    }

    public final String g() {
        String s = this.d;
        if(s != null) {
            return s;
        }
        ibuq.j("environment");
        return null;
    }

    // Detected as a lambda impl.
    public final void h(dycl dycl0) {
        ((glyq)dycl0.a()).u();
        Context context0 = this.c();
        ibuq.f(context0, "context");
        cljp.a(context0).d("felica.emoney.provision.operation.timeout", "com.google.android.gms.pay.gcmtask.PayGcmTaskService");
        if(hwsd.N()) {
            ((ggtj)ebyx.a.h()).x("ProvisionTimeout: Canceled provision timeout task");
        }
    }

    public final void i(String s, String s1) {
        this.e().c(s, s1);
        if(s1 == null) {
            s1 = "Something went wrong, please try again";
        }
        this.y(4, s, s1);
    }

    public final void j(String s, String s1, Integer integer0) {
        Notification notification1;
        ebwn ebwn0 = this.e();
        ibuq.f(s, "title");
        juo juo0 = ebwn0.a();
        juo0.D(s);
        juo0.K(true);
        juo0.S = true;
        juo0.p(true);
        if(s1 != null) {
            juo0.k(s1);
        }
        if(integer0 != null) {
            juo0.L(100, integer0.intValue(), false);
        }
        if(hwnj.r()) {
            Notification notification0 = juo0.a();
            ibuq.e(notification0, "build(...)");
            notification1 = fsdy.a(ebwn0.a, notification0);
        }
        else {
            notification1 = juo0.a();
            ibuq.c(notification1);
        }
        ebwn0.b(notification1, hkoy.g);
        ebxe.r(this, 2, s, 4);
    }

    public final void k() {
        this.e().d();
        ebxe.r(this, 3, null, 6);
    }

    public final void l(AccountInfo accountInfo0, dymw dymw0, dycl dycl0) {
        this.h(dycl0);
        ibuq.e("Your transit card could not be added", "getString(...)");
        ebxe.s(this, "Your transit card could not be added");
        if(dymw0.b == 1) {
            ebst ebst0 = this.d();
            ibuq.e(accountInfo0.b, "getAccountName(...)");
            this.v();
            ebst.e(ebst0, accountInfo0.b, 203260, System.currentTimeMillis() - dymw0.d, 0, 24);
            return;
        }
        ebst ebst1 = this.d();
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        this.v();
        ebst.e(ebst1, accountInfo0.b, 0x319FD, System.currentTimeMillis() - dymw0.d, 1, 16);
    }

    public final void m(AccountInfo accountInfo0, dymw dymw0, dycl dycl0) {
        ((ggtj)ebxe.a.h()).B("%s: performDownloadCards", "PendingSeProvisioningTaskOperation");
        dyly dyly0 = dymw0.b == 2 ? ((dyly)dymw0.c) : dyly.a;
        ibuq.e(dyly0, "getDownloadCardData(...)");
        dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
        String s = accountInfo0.b;
        ibuq.e(s, "getAccountName(...)");
        dyfx0.b(s);
        dyfh dyfh0 = dyfg.a(((ProtoLiteMessage)dyff.a).v_newBuilder());
        String s1 = dyly0.c;
        ibuq.e(s1, "getDefaultTransitCardCid(...)");
        dyfh0.b(s1);
        dyfh0.f();
        hfuo hfuo0 = dyly0.b;
        ibuq.e(hfuo0, "getCardsList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object0: hfuo0) {
            dyfa dyfa0 = dyez.a(((ProtoLiteMessage)dyey.a).v_newBuilder());
            hjwx hjwx0 = ((hkjm)object0).c;
            if(hjwx0 == null) {
                hjwx0 = hjwx.a;
            }
            dyna dyna0 = dypl.c((hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b)));
            ibuq.e(dyna0, "googlePayToPaySeProto(...)");
            dyfa0.c(dyna0);
            hjwx hjwx1 = ((hkjm)object0).c;
            if(hjwx1 == null) {
                hjwx1 = hjwx.a;
            }
            String s2 = hjwx1.d;
            ibuq.e(s2, "getCid(...)");
            dyfa0.b(s2);
            arrayList0.add(dyfa0.a());
        }
        dyfh0.e(arrayList0);
        dyfh0.d(dyfe.c);
        gurm gurm0 = gurm.b(dyly0.d) == null ? gurm.n : gurm.b(dyly0.d);
        ibuq.e(gurm0, "getOrigin(...)");
        dyfh0.c(gurm0);
        dyfx0.c(dyfh0.a());
        dyfv dyfv0 = dyfx0.a();
        ibuq.e("Adding your transit card", "getString(...)");
        dxyx dxyx0 = null;
        ebxe.t(this, "Adding your transit card", (dyly0.b.size() <= 1 ? null : ((int)15)), 2);
        Account account0 = new Account(s, "com.google");
        dxyx dxyx1 = this.f;
        if(dxyx1 == null) {
            ibuq.j("cardTransferStatusDataStoreProvider");
        }
        else {
            dxyx0 = dxyx1;
        }
        frli frli0 = dxyx0.a(account0, this.g());
        ibuq.c(frli0);
        this.l = new ebxb(frli0, this, account0, dymw0);
        azts azts0 = this.u();
        dmqb dmqb0 = this.l;
        if(dmqb0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        azts0.bC(account0, 13, dmqb0);
        evql evql0 = this.u().ba(dyfv0.toBytesArray());
        evql0.v(this.f(), new ebwv(this, frli0, accountInfo0, dymw0));
        evql0.s(this.f(), (/* MISSING LAMBDA PARAMETER */) -> {
            ((glyq)dycl0.a()).u();
            Context context0 = this.c();
            ibuq.f(context0, "context");
            cljp.a(context0).d("felica.emoney.provision.operation.timeout", "com.google.android.gms.pay.gcmtask.PayGcmTaskService");
            if(hwsd.N()) {
                ((ggtj)ebyx.a.h()).x("ProvisionTimeout: Canceled provision timeout task");
            }
        });
    }

    public final void n(AccountInfo accountInfo0, dymw dymw0, dycl dycl0) {
        int v;
        ((ggtj)ebxe.a.h()).B("%s: performNewCardCreation", "PendingSeProvisioningTaskOperation");
        dymu dymu0 = dymw0.b == 1 ? ((dymu)dymw0.c) : dymu.a;
        ibuq.e(dymu0, "getNewCardData(...)");
        ProvisionSePrepaidCardRequest provisionSePrepaidCardRequest0 = new ProvisionSePrepaidCardRequest();
        provisionSePrepaidCardRequest0.a = new Account(accountInfo0.b, "com.google");
        switch((dyna.b(dymu0.c) == null ? dyna.k : dyna.b(dymu0.c)).ordinal()) {
            case 4: {
                v = 1;
                break;
            }
            case 7: {
                v = 2;
                break;
            }
            default: {
                v = 0;
            }
        }
        provisionSePrepaidCardRequest0.c = v;
        provisionSePrepaidCardRequest0.g = 2;
        provisionSePrepaidCardRequest0.b = dypl.a((dyna.b(dymu0.c) == null ? dyna.k : dyna.b(dymu0.c)));
        if((1 & dymu0.b) != 0) {
            provisionSePrepaidCardRequest0.d = (dymu0.d == null ? dyem.a : dymu0.d).toBytesArray();
        }
        if((dymu0.b & 2) != 0) {
            provisionSePrepaidCardRequest0.f = (dymu0.e == null ? dylg.a : dymu0.e).toBytesArray();
        }
        ibuq.e("Adding your transit card", "getString(...)");
        ebxe.t(this, "Adding your transit card", null, 6);
        evql evql0 = this.u().bg(provisionSePrepaidCardRequest0);
        evql0.y(this.f(), new ebwp(new ebwo(this, accountInfo0, dymw0)));
        evql0.v(this.f(), new ebwq(this, accountInfo0, dymw0));
        evql0.s(this.f(), (/* MISSING LAMBDA PARAMETER */) -> {
            ((glyq)dycl0.a()).u();
            Context context0 = this.c();
            ibuq.f(context0, "context");
            cljp.a(context0).d("felica.emoney.provision.operation.timeout", "com.google.android.gms.pay.gcmtask.PayGcmTaskService");
            if(hwsd.N()) {
                ((ggtj)ebyx.a.h()).x("ProvisionTimeout: Canceled provision timeout task");
            }
        });
    }

    public final void o(AccountInfo accountInfo0, dycl dycl0) {
        Notification notification1;
        ebst ebst0 = this.d();
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        ebst0.a(accountInfo0.b, 0x319FF);
        this.v();
        ((glyq)dycl0.a.b(new dyci(new dych(System.currentTimeMillis())), gmap.a)).u();
        Context context0 = this.c();
        ibuq.f(context0, "context");
        long v = hwsd.f() / 1000L;
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.q("felica.emoney.provision.operation.timeout");
        clkn0.g(2);
        clkn0.e(v, 1L + v);
        clkn0.v(1);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
        if(hwsd.N()) {
            ((ggtj)ebyx.a.h()).x("ProvisionTimeout: Scheduled provision timeout task");
        }
        ebwn ebwn0 = this.e();
        juo juo0 = ebwn0.a();
        Context context1 = ebwn0.a;
        juo0.D("Setting up Wallet");
        juo0.K(true);
        juo0.S = true;
        juo0.p(true);
        if(hwnj.r()) {
            Notification notification0 = juo0.a();
            ibuq.e(notification0, "build(...)");
            notification1 = fsdy.a(context1, notification0);
        }
        else {
            notification1 = juo0.a();
            ibuq.c(notification1);
        }
        ebwn0.b(notification1, hkoy.f);
        if(ebss.d(this.c())) {
            this.z(accountInfo0, dycl0);
        }
    }

    public final void p(AccountInfo accountInfo0, dymw dymw0, dycl dycl0, long v, ebxd ebxd0) {
        dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        dyfx0.b(accountInfo0.b);
        dyfx0.e(hfsx.a(((ProtoLiteMessage)hfsw.a).v_newBuilder()).a());
        dyfv dyfv0 = dyfx0.a();
        evql evql0 = this.u().ba(dyfv0.toBytesArray());
        evql0.v(this.f(), new ebws(v, this, accountInfo0, dymw0, dycl0, ebxd0));
        evql0.y(this.f(), new ebwu(new ebwt(ebxd0, this, accountInfo0, dymw0, dycl0, v)));
    }

    public final void q(frli frli0) {
        dmqb dmqb0 = this.l;
        if(dmqb0 != null) {
            this.u().bE(13, dmqb0);
        }
        this.l = null;
        ibrt ibrt0 = this.g;
        if(ibrt0 == null) {
            ibuq.j("defaultContext");
            ibrt0 = null;
        }
        icbb.b(iccl.b(ibrt0), null, null, new ebwy(frli0, this, null), 3);
    }

    static void r(ebxe ebxe0, int v, String s, int v1) {
        if((v1 & 2) != 0) {
            s = "";
        }
        ebxe0.y(v, s, "");
    }

    static void s(ebxe ebxe0, String s) {
        ebxe0.i(s, null);
    }

    static void t(ebxe ebxe0, String s, Integer integer0, int v) {
        if((v & 4) != 0) {
            integer0 = null;
        }
        ebxe0.j(s, null, integer0);
    }

    public final azts u() {
        azts azts0 = this.k;
        if(azts0 != null) {
            return azts0;
        }
        ibuq.j("firstPartyPayClient");
        return null;
    }

    public final void v() {
        if(this.c != null) {
            return;
        }
        ibuq.j("clock");
    }

    public static final Integer w(dyfl dyfl0) {
        ibuq.f(dyfl0, "<this>");
        int v = dyfl0.b.size();
        if(v == 1) {
            return null;
        }
        hfuo hfuo0 = dyfl0.b;
        ibuq.e(hfuo0, "getCardDownloadResultsList(...)");
        int v1 = 0;
        if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
            for(Object object0: hfuo0) {
                dyfj dyfj0 = dyfj.b(((dyfk)object0).e);
                if(dyfj0 == null) {
                    dyfj0 = dyfj.j;
                }
                if(dyfj0 == dyfj.b) {
                    ++v1;
                    if(v1 < 0) {
                        ibpo.l();
                    }
                }
            }
        }
        Integer integer0 = (int)(v1 * 100 / v);
        return integer0 == null ? null : ((int)(((int)integer0) + 15));
    }

    private final void x() {
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebog(domv0).inject(this);
    }

    private final void y(int v, String s, String s1) {
        easd easd0 = this.j;
        if(easd0 == null) {
            ibuq.j("finishSetupListenerManager");
            easd0 = null;
        }
        EmoneyCardFinishSetupStatusData emoneyCardFinishSetupStatusData0 = new EmoneyCardFinishSetupStatusData();
        emoneyCardFinishSetupStatusData0.a = v;
        emoneyCardFinishSetupStatusData0.b = s;
        emoneyCardFinishSetupStatusData0.c = s1;
        easd0.a(emoneyCardFinishSetupStatusData0);
    }

    private final void z(AccountInfo accountInfo0, dycl dycl0) {
        Context context0 = this.c();
        ibuq.f(context0, "context");
        cljp.a(context0).d("felica.emoney.provision.dependency.timeout", "com.google.android.gms.pay.gcmtask.PayGcmTaskService");
        Object object0 = dycl0.b().get();
        ibuq.e(object0, "get(...)");
        if(!ebxe.A(((dymw)object0))) {
            return;
        }
        ebst ebst0 = this.d();
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        this.v();
        ebst.e(ebst0, accountInfo0.b, 0x31A00, System.currentTimeMillis() - ((dymw)object0).d, 0, 24);
        ((glyq)dycl0.c(dymv.b)).u();
        this.p(accountInfo0, ((dymw)object0), dycl0, 0L, new ebxd(((dymw)object0), this, accountInfo0, dycl0));
    }
}

