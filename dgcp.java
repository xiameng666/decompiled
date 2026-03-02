import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.nearby.sharing.AppAttachment;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import dagger.Lazy;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dgcp implements dftm {
    public final Context a;
    public final dfsk b;
    public final dcqh c;
    public final dgaf d;
    public final dhtl e;
    public final dgah f;
    public final cuvm g;
    public final fgvt h;
    public final ExecutorService i;
    public final dgwm j;
    public final dghz k;
    public final dghz l;
    public final dgeg m;
    public final dgdt n;
    public final dftp o;
    private final dhdi p;
    private final ibty q;
    private final dgrv r;
    private final dgre s;
    private final ibtx t;
    private final dgkd u;
    private final dgyw v;
    private final dhbg w;
    private final dgzj x;
    private final dhbn y;

    public dgcp(Context context0, dfsk dfsk0, dcqh dcqh0, dgaf dgaf0, dhtl dhtl0, dcpn dcpn0, gful_cronetEngineProvider gful0, lps lps0, Lazy lazy0, dhdi dhdi0) {
        ibuq.f(context0, "context");
        dhbn dhbn0;
        dgzj dgzj0;
        ibuq.f(dfsk0, "accountManager");
        ibuq.f(dcqh0, "constellationClient");
        ibuq.f(dgaf0, "senderCertificateManager");
        ibuq.f(dhtl0, "grpcClient");
        ibuq.f(dcpn0, "analyticsLogger");
        ibuq.f(gful0, "quickShareRoomDatabase");
        ibuq.f(lazy0, "facetEventLogger");
        ibuq.f(dhdi0, "qrCodeManager");
        dgao dgao0 = new dgao(context0, dfsk0, dhtl0);
        ibuq.f(context0, "context");
        ibuq.f(dfsk0, "accountManager");
        ibuq.f(dcqh0, "constellationClient");
        ibuq.f(dgaf0, "senderCertificateManager");
        ibuq.f(dhtl0, "grpcClient");
        ibuq.f(dcpn0, "analyticsLogger");
        ibuq.f(gful0, "quickShareRoomDatabase");
        ibuq.f(lazy0, "facetEventLogger");
        ibuq.f(dhdi0, "qrCodeManager");
        dftp dftp0 = dftp.f(context0, dfsk0, dgao0, dgaf0, dhtl0, dcpn0);
        dgeu dgeu0 = new dgeu(context0, new dges(context0));
        fgvy fgvy0 = new fgvy();
        icck icck0 = iccl.d(lpt.a(lps0), cclw.a);
        ScheduledExecutorService scheduledExecutorService0 = cuui.f();
        ibuq.f(context0, "context");
        ibuq.f(dfsk0, "accountManager");
        ibuq.f(dcqh0, "constellationClient");
        ibuq.f(dgaf0, "senderCertificateManager");
        ibuq.f(dhtl0, "grpcClient");
        ibuq.f(dcpn0, "analyticsLogger");
        ibuq.f(gful0, "quickShareRoomDatabase");
        ibuq.f(lazy0, "facetEventLogger");
        ibuq.f(dhdi0, "qrCodeManager");
        super();
        this.a = context0;
        this.b = dfsk0;
        this.c = dcqh0;
        this.d = dgaf0;
        this.e = dhtl0;
        this.f = dgao0;
        this.o = dftp0;
        this.g = dgeu0;
        this.h = fgvy0;
        this.i = scheduledExecutorService0;
        this.p = dhdi0;
        dgwm dgwm0 = new dgwm(context0, icck0, new clht(Looper.getMainLooper()), (context0.getPackageManager().hasSystemFeature("android.hardware.uwb") ? null : cumi.h(context0)));
        dgwm0.b();
        this.j = dgwm0;
        dghz dghz0 = new dghz(context0, dghp.a, dgao0, fgvy0, icck0);
        this.k = dghz0;
        dghz dghz1 = new dghz(context0, dghp.b, dgao0, fgvy0, icck0);
        this.l = dghz1;
        dgbo dgbo0 = new dgbo(this);
        this.q = dgbo0;
        dgrv dgrv0 = new dgrv(0L, dgsb.a, null);
        this.r = dgrv0;
        dgre dgre0 = new dgre(new dgrm(new dgsh(dgrv0, dgeu0, icck0), dghz0), dgbo0, dghz0, dgwm0, dgge.a, icck0, dhdi0);
        this.s = dgre0;
        dgbp dgbp0 = new dgbp(this);
        this.t = dgbp0;
        dgkd dgkd0 = new dgkd(new dgkm(context0, new dgkw(dgeu0, icck0), dghz1, dgwm0, dgeu0), dgbp0, dgge.a, dcpn0);
        this.u = dgkd0;
        this.m = new dgeg(context0, dgre0, icck0, dcpn0);
        this.n = new dgdt(context0, dgkd0, dgwm0, icck0, dcpn0, new dcqq(context0));
        dgcl dgcl0 = new dgcl(dgym.a().a);
        int v = dgao0.a();
        ibuq.e(glxu.a, "system(...)");
        dgyw dgyw0 = new dgyw(dgcl0, dcpn0, v, icck0, gful0, glxu.a, lazy0);
        dgyv dgyv0 = new dgyv(dgyw0, null);
        dgyw0.g = icir.d(new iclv(dgyw0.a, dgyv0), dgyw0.d);
        this.v = dgyw0;
        dhbg dhbg0 = new dhbg(context0, new dgco(dgym.a().a), dcpn0, dgao0.a(), icck0, gful0, dgwm0, lazy0);
        dhbf dhbf0 = new dhbf(dhbg0, null);
        dhbg0.e = icir.d(new iclv(dhbg0.a, dhbf0), dhbg0.c);
        this.w = dhbg0;
        if(hvqs.bi()) {
            dgzj0 = new dgzj(icck0);
            dgzj0.d = icir.d(new iclv(dgzj0.b.b(), new dgzi(dgzj0, null)), dgzj0.a);
        }
        else {
            dgzj0 = null;
        }
        this.x = dgzj0;
        if(hvqs.bi()) {
            dhbn0 = new dhbn(icck0);
            dhbn0.d = icir.d(new iclv(dhbn0.b.b(), new dhbm(dhbn0, null)), dhbn0.a);
        }
        else {
            dhbn0 = null;
        }
        this.y = dhbn0;
        dhtl0.k(new dgbr(this));
    }

    @Override  // dftm
    public final void A() {
    }

    @Override  // dftm
    public final void B(byte[] arr_b) {
        this.m.i(arr_b);
    }

    @Override  // dftm
    public final void C() {
        this.n.j();
    }

    @Override  // dftm
    public final void D() {
        this.m.j();
    }

    @Override  // dftm
    public final void E(dcpv dcpv0) {
        dgcb dgcb0 = new dgcb(this, dcpv0);
        this.i.execute(dgcb0);
    }

    @Override  // dftm
    public final void F(String s, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        dgfy dgfy0 = qrCodeMetadata0 == null ? null : dgcp.J(qrCodeMetadata0);
        this.n.k(s, dgfy0, dfso0);
    }

    @Override  // dftm
    public final void G(dfsq dfsq0) {
        this.m.l(dfsq0);
    }

    @Override  // dftm
    public final void H(String s, ShareTarget shareTarget0, dcnp dcnp0, boolean z) {
        ibuq.f(s, "localDeviceName");
        if(shareTarget0.f().isEmpty() && shareTarget0.i().isEmpty() && shareTarget0.j().isEmpty() && shareTarget0.d().isEmpty()) {
            dcvz.a.e().p("No attachment to be sent (stream attachment is deprecated).", new Object[0]);
            return;
        }
        dgce dgce0 = new dgce(this, dcnp0);
        this.m.n(s, shareTarget0, z, dgce0);
    }

    private final List I(Account account0, dcpv dcpv0) {
        cunk cunk0;
        gmcd gmcd0 = icpu.a(icbb.a(iccl.b(cclv.a(this.i)), null, null, new dgcg(this, account0, dcpv0, null), 3));
        try {
            cunk0 = (cunk)gmcd0.get(hvqs.r(), TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException unused_ex) {
            dcvz.a.e().p("Timed out trying to get my device info.", new Object[0]);
            return null;
        }
        if(!cunk0.d()) {
            String s = String.format(Locale.US, "[%d]%s", Arrays.copyOf(new Object[]{((int)cunk0.a().i), cunk0.a().j}, 2));
            ibuq.e(s, "format(...)");
            dcvz.a.e().h("Failed to get my device info with status %s.", s);
            return ibps.a;
        }
        return (List)cunk0.c();
    }

    private static final dgfy J(QrCodeMetadata qrCodeMetadata0) {
        byte[] arr_b = qrCodeMetadata0.a;
        ibuq.e(arr_b, "getSharedKey(...)");
        switch(qrCodeMetadata0.b) {
            case 1: {
                return new dgfy(arr_b, dgfx.a);
            }
            case 2: {
                return new dgfy(arr_b, dgfx.b);
            }
            default: {
                throw new IllegalArgumentException("Illegal QR code key type.");
            }
        }
    }

    @Override  // dftm
    public final int a(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.n.a(shareTarget0) : this.m.a(shareTarget0);
    }

    @Override  // dftm
    public final int b(ShareTarget shareTarget0) {
        ibuq.f(shareTarget0, "shareTarget");
        return shareTarget0.f ? this.n.b(shareTarget0) : this.m.b(shareTarget0);
    }

    @Override  // dftm
    public final int c(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.n.c(shareTarget0) : this.m.c(shareTarget0);
    }

    @Override  // dftm
    public final int d(ContactFilter contactFilter0) {
        return this.o.a(contactFilter0);
    }

    @Override  // dftm
    public final int e(Account account0) {
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 6;
        dcpu0.b = 1;
        List list0 = this.I(account0, new dcpv(dcpu0));
        if(list0 == null) {
            return -1;
        }
        cunf cunf0 = dcvz.a;
        cunf0.d().h("The user has %s devices", list0);
        hfuf hfuf0 = hvqs.aQ().b;
        ibuq.e(hfuf0, "getElementList(...)");
        hfuf hfuf1 = hvqs.aP().b;
        ibuq.e(hfuf1, "getElementList(...)");
        int v = 0;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                gzcj gzcj0 = (gzcj)object0;
                if(hfuf0.contains(Integer.valueOf((vyp.b(gzcj0.c) == null ? vyp.a : vyp.b(gzcj0.c)).B)) && hfuf1.contains(Integer.valueOf((vyn.b(gzcj0.b) == null ? vyn.a : vyn.b(gzcj0.b)).w))) {
                    ++v;
                    if(v < 0) {
                        ibpo.l();
                    }
                }
            }
        }
        cunf0.b().h("The user has %s devices that support Nearby Share", Integer.valueOf(v));
        return v;
    }

    @Override  // dftm
    public final int f(ShareTarget shareTarget0, long v, dbzg dbzg0) {
        dgdi dgdi0;
        Object object0;
        List list0;
        ibuq.f(shareTarget0, "shareTarget");
        long v1 = shareTarget0.a;
        dgdt dgdt0 = this.n;
        synchronized(dgdt0) {
            dgdi0 = (dgdi)dgdt0.b.get(Long.valueOf(v1));
            if(dgdi0 == null) {
                return 0x8AB7;
            }
        }
        dgiy dgiy0 = ((dgdf)dgdi0.c).b;
        dgcw dgcw0 = new dgcw(dgdi0, v1, dbzg0, v);
        dggc dggc0 = dgiy0.c;
        Iterator iterator0 = dggc0.j.iterator();
        do {
            list0 = null;
            if(!iterator0.hasNext()) {
                goto label_21;
            }
            object0 = iterator0.next();
        }
        while(((Attachment)object0).b() != v);
        goto label_22;
    label_21:
        object0 = null;
    label_22:
        if(((Attachment)object0) == null) {
            dcvz.a.e().p("Not found install attachment.", new Object[0]);
            return 13;
        }
        if((((Attachment)object0) instanceof AppAttachment)) {
            String[] arr_s = ((AppAttachment)(((Attachment)object0))).c;
            if(arr_s != null) {
                list0 = ibpg.N(arr_s);
            }
        }
        else if((((Attachment)object0) instanceof FileAttachment)) {
            String s = (String)dggc0.i.get(Long.valueOf(((FileAttachment)(((Attachment)object0))).g));
            if(s != null) {
                list0 = ibpo.b(s);
            }
        }
        if(list0 == null) {
            dcvz.a.e().h("%s\'s paths are null.", ((Attachment)object0));
            return 13;
        }
        dgiw dgiw0 = new dgiw(dgcw0, ((Attachment)object0), list0);
        dgiy0.e.c(list0, dgiw0);
        return 0;
    }

    @Override  // dftm
    public final int g(ShareTarget shareTarget0) {
        ibuq.f(shareTarget0, "shareTarget");
        gmcd gmcd0 = icpu.a(icbb.a(iccl.b(cclv.a(this.i)), null, null, new dgci(this, shareTarget0, null), 3));
        try {
            Object object0 = gmcd0.get(hvqs.r(), TimeUnit.MILLISECONDS);
            ibuq.c(object0);
            return ((Number)object0).intValue();
        }
        catch(TimeoutException unused_ex) {
            return 15;
        }
    }

    @Override  // dftm
    public final int h() {
        this.m.k();
        return 0;
    }

    @Override  // dftm
    public final int i(UpdateSelectedContactsParams updateSelectedContactsParams0) {
        ibuq.f(updateSelectedContactsParams0, "params");
        return 0x8ABC;
    }

    @Override  // dftm
    public final QrCodeMetadata j() {
        return dckf.a(new dgca(this));
    }

    @Override  // dftm
    public final List k(ShareTarget shareTarget0) {
        ibuq.f(shareTarget0, "shareTarget");
        gmcd gmcd0 = icpu.a(icbb.a(iccl.b(cclv.a(this.i)), null, null, new dgcf(this, shareTarget0, null), 3));
        try {
            Object object0 = gmcd0.get(hvqs.r(), TimeUnit.MILLISECONDS);
            ibuq.c(object0);
            return (List)object0;
        }
        catch(TimeoutException unused_ex) {
            return ibps.a;
        }
    }

    @Override  // dftm
    public final List l(int v, int v1, ContactFilter contactFilter0) {
        Object object0 = this.o.c(v, v1, contactFilter0, this.i).get(hvqs.E(), TimeUnit.MILLISECONDS);
        ibuq.e(object0, "get(...)");
        return (List)object0;
    }

    @Override  // dftm
    public final List m(Account account0) {
        ibuq.f(account0, "account");
        gmcd gmcd0 = icpu.a(icbb.a(iccl.b(cclv.a(this.i)), null, null, new dgch(this, account0, null), 3));
        try {
            List list0 = (List)gmcd0.get(hvqs.r(), TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException unused_ex) {
            dcvz.a.b().p("No reachable phone number is retrieved. Return empty list.", new Object[0]);
            return ibps.a;
        }
        List list1 = this.c.a();
        if(list1 == null) {
            dcvz.a.b().p("No verified phone number is retrieved. Return null.", new Object[0]);
            return null;
        }
        List list2 = new ArrayList();
        for(Object object0: list1) {
            if(list0.contains(((String)object0))) {
                list2.add(object0);
            }
        }
        return list2;
    }

    @Override  // dftm
    @ibni
    public final Map n(int v) {
        return v == 1 ? this.m.e() : ibpt.a;
    }

    @Override  // dftm
    public final void o(PrintWriter printWriter0) {
        ibuq.f(printWriter0, "writer");
        dhbn dhbn0 = this.y;
        if(dhbn0 != null) {
            ibuq.f(printWriter0, "writer");
            printWriter0.println("---------Send-side events----------");
            for(Object object0: dhbn0.c) {
                dgxk dgxk0 = (dgxk)object0;
                if((dgxk0 instanceof dhci)) {
                    dhbn0.a(printWriter0, ((dhci)dgxk0));
                    continue;
                }
                if(!(dgxk0 instanceof dhcx)) {
                    throw new ibnq();
                }
                Date date0 = new Date(((dhcx)dgxk0).a);
                printWriter0.println("[" + new ibuk(((dhcx)dgxk0).getClass()).c() + "] " + date0 + " " + ((dhcx)dgxk0).b);
                continue;
            }
            dhci dhci0 = dhbn0.b.a();
            if(dhci0 != null) {
                dhbn0.a(printWriter0, dhci0);
            }
            printWriter0.write("--------------------------------------\n");
        }
        dgzj dgzj0 = this.x;
        if(dgzj0 != null) {
            ibuq.f(printWriter0, "writer");
            printWriter0.println("---------Receive-side events----------");
            for(Object object1: dgzj0.c) {
                dgxk dgxk1 = (dgxk)object1;
                if((dgxk1 instanceof dhci)) {
                    dgzj0.a(printWriter0, ((dhci)dgxk1));
                    continue;
                }
                if(!(dgxk1 instanceof dhcx)) {
                    throw new ibnq();
                }
                Date date1 = new Date(((dhcx)dgxk1).a);
                printWriter0.println("[" + new ibuk(((dhcx)dgxk1).getClass()).c() + "] " + date1 + " " + ((dhcx)dgxk1).b);
                continue;
            }
            dhci dhci1 = dgzj0.b.a();
            if(dhci1 != null) {
                dgzj0.a(printWriter0, dhci1);
            }
            printWriter0.write("--------------------------------------\n");
        }
    }

    @Override  // dftm
    @ibni
    public final void p(dcpv dcpv0) {
        this.d.f(true, dcpv0);
        this.o.g(dcpv0);
    }

    @Override  // dftm
    @ibni
    public final void q(Intent intent0) {
        ibuq.f(intent0, "intent");
    }

    @Override  // dftm
    @ibni
    public final void r() {
        dcvz.a.b().p("[NS_CMD]: listenForContactBookChangedEvents", new Object[0]);
        this.o.d();
    }

    @Override  // dftm
    public final void s() {
    }

    @Override  // dftm
    public final void t(String s) {
    }

    @Override  // dftm
    public final void u(int v) {
        this.f.g(v);
    }

    @Override  // dftm
    public final void v(int v) {
        dgah dgah0 = this.f;
        if(((dgao)dgah0).n().e != v) {
            dgah0.h(v);
            dgym.a().a(new dhae(v));
        }
    }

    @Override  // dftm
    public final void w() {
        this.j.c();
        this.m.g();
        this.n.h();
        this.o.e();
        this.f.i();
        this.c.c();
        this.e.m();
        dgyw dgyw0 = this.v;
        iced iced0 = dgyw0.g;
        if(iced0 != null) {
            iceb.a(iced0);
        }
        dgyw0.k = null;
        dgzj dgzj0 = this.x;
        if(dgzj0 != null) {
            iced iced1 = dgzj0.d;
            if(iced1 != null) {
                iceb.a(iced1);
            }
        }
        iced iced2 = this.w.e;
        if(iced2 != null) {
            iceb.a(iced2);
        }
        dhbn dhbn0 = this.y;
        if(dhbn0 != null) {
            iced iced3 = dhbn0.d;
            if(iced3 != null) {
                iceb.a(iced3);
            }
        }
    }

    @Override  // dftm
    public final void x(String s, dcnp dcnp0, dfso dfso0) {
        throw null;
    }

    @Override  // dftm
    public final void y(String s, dcnp dcnp0, dfso dfso0, QrCodeMetadata qrCodeMetadata0) {
        dgfy dgfy0 = qrCodeMetadata0 == null ? null : dgcp.J(qrCodeMetadata0);
        dgbu dgbu0 = new dgbu(this, dcnp0);
        this.n.i(s, dgfy0, dfso0, dgbu0);
    }

    @Override  // dftm
    public final void z(dclv dclv0, dfsq dfsq0) {
        dgbw dgbw0 = new dgbw(this, dclv0);
        dgbx dgbx0 = new dgbx(this, dclv0);
        dgby dgby0 = new dgby(this, dclv0);
        dgbz dgbz0 = new dgbz(this, dclv0);
        this.m.h(dfsq0, dgbw0, dgbx0, dgby0, dgbz0);
    }
}

