import android.content.Context;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class dgeg {
    public final Map a;
    public dgec b;
    private final Context c;
    private final dcpn d;
    private dfsq e;
    private final iced f;
    private final dgre g;

    public dgeg(Context context0, dgre dgre0, icck icck0, dcpn dcpn0) {
        ibuq.f(context0, "context");
        ibuq.f(dgre0, "sendManager");
        ibuq.f(dcpn0, "analyticsLogger");
        super();
        this.c = context0;
        this.g = dgre0;
        this.d = dcpn0;
        this.a = new LinkedHashMap();
        dgee dgee0 = new dgee(this, null);
        this.f = icir.d(new icjm(new iclv(dgre0.g, dgee0), new dgef(this, null)), icck0);
    }

    public final int a(ShareTarget shareTarget0) {
        boolean z;
        synchronized(this) {
            z = this.g.h(shareTarget0.a);
        }
        return z ? 0 : 0x8AB7;
    }

    public final int b(ShareTarget shareTarget0) {
        boolean z;
        synchronized(this) {
            ibuq.f(shareTarget0, "shareTarget");
            z = this.g.i(shareTarget0.a);
        }
        return z ? 0 : 0x8AB7;
    }

    public final int c(ShareTarget shareTarget0) {
        boolean z;
        synchronized(this) {
            z = this.g.j(shareTarget0.a);
        }
        return z ? 0 : 0x8AB7;
    }

    public final dgfy d() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        dcvz.a.b().p("[NS_PROVIDER_API]: startQrCodeSession called.", new Object[0]);
        this.g.d();
        dgfy dgfy0 = this.g.a();
        if(dgfy0 != null) {
            FIN.finallyCodeBegin$NT(v);
            return dgfy0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Map e() {
        Map map0;
        synchronized(this) {
            Set set0 = this.a.entrySet();
            map0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
            for(Object object0: set0) {
                long v1 = ((Number)((Map.Entry)object0).getKey()).longValue();
                dged dged0 = (dged)((Map.Entry)object0).getValue();
                ibns ibns0 = new ibns(dged0.a(v1), (dged0.d == null ? new dcnn(1000).a() : dged0.d));
                map0.put(ibns0.a, ibns0.b);
            }
        }
        return map0;
    }

    public final void f(dgqm dgqm0, dgec dgec0) {
        int v6;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        cunf cunf0 = dcvz.a;
        cunf0.b().h("SendManager event %s", dgqm0);
        if((dgqm0 instanceof dgqa)) {
            dfsq dfsq0 = this.e;
            if(dfsq0 == null) {
                cunf0.e().p("SendManager discovered event called while options are not set. Skipping.", new Object[0]);
                FIN.finallyExec$NT(v);
                return;
            }
            dged dged0 = new dged(dfsq0.i, ((dgqa)dgqm0).b, false, null, null, null, 0);
            long v1 = ((dgqa)dgqm0).a;
            this.a.put(Long.valueOf(v1), dged0);
            if(dgec0 == null) {
                goto label_108;
            }
            ShareTarget shareTarget0 = dged0.a(v1);
            dgec0.a.a(shareTarget0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqb)) {
            long v2 = ((dgqb)dgqm0).a;
            dged dged1 = (dged)this.a.get(Long.valueOf(v2));
            if(dged1 == null || dgec0 == null) {
                goto label_108;
            }
            ShareTarget shareTarget1 = dged1.a(v2);
            dgec0.d.a(shareTarget1, Integer.valueOf(((dgqb)dgqm0).b), ((dgqb)dgqm0).c);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqd)) {
            long v3 = ((dgqd)dgqm0).a;
            dged dged2 = (dged)this.a.remove(Long.valueOf(v3));
            if(dged2 == null || dgec0 == null) {
                goto label_108;
            }
            ShareTarget shareTarget2 = dged2.a(v3);
            dgec0.c.a(shareTarget2);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqk)) {
            Map map0 = this.a;
            long v4 = ((dgqk)dgqm0).a;
            Long long0 = v4;
            dged dged3 = (dged)map0.get(long0);
            if(dged3 == null) {
                goto label_108;
            }
            dged dged4 = dged.b(dged3, ((dgqk)dgqm0).b);
            map0.put(long0, dged4);
            if(dgec0 == null) {
                goto label_108;
            }
            ShareTarget shareTarget3 = dged4.a(v4);
            dgec0.b.a(shareTarget3);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqc)) {
            long v5 = ((dgqc)dgqm0).a;
            switch(((dgqc)dgqm0).b.ordinal()) {
                case 0: {
                    v6 = 0x3F3;
                    break;
                }
                case 3: {
                    v6 = 0x3F0;
                    break;
                }
                case 4: {
                    v6 = 0x3F5;
                    break;
                }
                case 5: {
                    v6 = 1004;
                    break;
                }
                case 6: {
                    v6 = 0x3F6;
                    break;
                }
                case 7: {
                    v6 = 0x3FA;
                    break;
                }
                default: {
                    v6 = 1007;
                }
            }
            dgeg.m(this, v5, v6);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqg)) {
            dgdv dgdv0 = new dgdv(dgqm0);
            this.o(((dgqg)dgqm0).a, 1002, dgdv0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgql)) {
            dgdw dgdw0 = new dgdw(dgqm0);
            this.o(((dgql)dgqm0).a, 1003, dgdw0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqe)) {
            if(hvqz.ag() && ((dgqe)dgqm0).d == 2) {
                int v7 = 0x402;
                switch(((dgqe)dgqm0).c) {
                    case 9: 
                    case 12: {
                        break;
                    }
                    default: {
                        v7 = 0x3FF;
                    }
                }
                dgdx dgdx0 = new dgdx(this, dgqm0);
                this.o(((dgqe)dgqm0).a, v7, dgdx0);
                FIN.finallyExec$NT(v);
                return;
            }
            long v8 = ((dgqe)dgqm0).a;
            this.o(v8, 0x3FE, new dgdy(dgqm0));
            if(!hvqz.ag()) {
                goto label_108;
            }
            dged dged5 = (dged)this.a.get(Long.valueOf(v8));
            if(dged5 == null) {
                goto label_108;
            }
            dged5.f = ((dgqe)dgqm0).c;
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqh)) {
            dgdz dgdz0 = new dgdz();
            this.o(((dgqh)dgqm0).a, 1006, dgdz0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqj)) {
            dgea dgea0 = new dgea(dgqm0, this);
            this.o(((dgqj)dgqm0).a, 1005, dgea0);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgpz)) {
            if(!hvrc.m()) {
                dgeg.m(this, ((dgpz)dgqm0).a, 1001);
                FIN.finallyExec$NT(v);
                return;
            }
        label_108:
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgqf)) {
            dgeg.m(this, ((dgqf)dgqm0).a, 0x3F8);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgpx)) {
            dgeg.m(this, ((dgpx)dgqm0).a, 1009);
            FIN.finallyExec$NT(v);
            return;
        }
        if((dgqm0 instanceof dgpy)) {
            dgeg.m(this, ((dgpy)dgqm0).a, 0x3FD);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new ibnq();
    }

    public final void g() {
        synchronized(this) {
            iceb.a(this.f);
        }
    }

    public final void h(dfsq dfsq0, ibts ibts0, ibts ibts1, ibts ibts2, ibtx ibtx0) {
        synchronized(this) {
            this.b = new dgec(ibts0, ibts1, ibts2, ibtx0);
            long v1 = this.d.c();
            dfsp dfsp0 = dfsq0.a();
            dfsp0.e = v1;
            dfsq dfsq1 = dfsp0.a();
            this.e = dfsq1;
            dgrf dgrf0 = dgeb.a(this.c, dfsq1);
            dcvz.a.b().h("[NS_PROVIDER_API]: startDiscovery called with %s.", dgrf0);
            this.g.c(dgrf0);
            dgyp dgyp0 = dgym.a();
            ibuq.e(dfsq0.f, "getMode(...)");
            boolean z = this.g.a() != null;
            dgyp0.a(new dhcd(dfsq0.f, dfsq0.i, dfsq0.b.a, dfsq0.b.b, z));
        }
    }

    public final void i(byte[] arr_b) {
        synchronized(this) {
            dcvz.a.b().p("[NS_PROVIDER_API]: startQrCodeSessionWithKey called.", new Object[0]);
            dgre dgre0 = this.g;
            dgfy dgfy0 = dgre0.a();
            if(dgfy0 != null && (dgfy0.b != null && dgfy0.b.equals(dgfx.a))) {
                throw new IllegalStateException("A QR code session with public key is already started.");
            }
            if(dgre0.d != null) {
                dgfy dgfy1 = dgre0.a();
                byte[] arr_b1 = null;
                if(dgfy1 != null) {
                    List list0 = dgfy1.a;
                    if(list0 != null) {
                        arr_b1 = ibpo.aC(list0);
                    }
                }
                if(Arrays.equals(arr_b1, arr_b)) {
                    return;
                }
            }
            dgre0.d = new dgil(arr_b);
            dgrf dgrf0 = dgre0.e;
            if(dgrf0 != null) {
                dgre0.g(dgrf0);
            }
            dgym.a().a(dhcn.a);
        }
    }

    public final void j() {
        synchronized(this) {
            dcvz.a.b().p("[NS_PROVIDER_API]: stopDiscovery called.", new Object[0]);
            if(hvrc.m()) {
                this.b = null;
            }
            this.g.e();
            this.e = null;
        }
    }

    public final void k() {
        synchronized(this) {
            dcvz.a.b().p("[NS_PROVIDER_API]: stopQrCodeSession called.", new Object[0]);
            this.g.f();
            Map map0 = this.a;
            for(Object object0: map0.entrySet()) {
                long v1 = ((Number)((Map.Entry)object0).getKey()).longValue();
                dged dged0 = (dged)((Map.Entry)object0).getValue();
                dgfh dgfh0 = dged0.a;
                if(dgfh0.f) {
                    dged dged1 = dged.b(dged0, dgfh.b(dgfh0));
                    map0.put(Long.valueOf(v1), dged1);
                    dgec dgec0 = this.b;
                    if(dgec0 != null) {
                        ShareTarget shareTarget0 = dged1.a(v1);
                        dgec0.b.a(shareTarget0);
                    }
                }
            }
        }
    }

    public final void l(dfsq dfsq0) {
        synchronized(this) {
            dcvz.a.b().h("[NS_PROVIDER_API]: update called with %s.", dfsq0);
            long v1 = this.d.c();
            dfsp dfsp0 = dfsq0.a();
            dfsp0.e = v1;
            dfsq dfsq1 = dfsp0.a();
            this.e = dfsq1;
            dgrf dgrf0 = dgeb.a(this.c, dfsq1);
            this.g.g(dgrf0);
            dgyp dgyp0 = dgym.a();
            ibuq.e(dfsq0.f, "getMode(...)");
            boolean z = this.g.a() != null;
            dgyp0.a(new dhcf(dfsq0.f, dfsq0.i, dfsq0.b.a, dfsq0.b.b, z));
        }
    }

    static void m(dgeg dgeg0, long v, int v1) {
        dgeg0.o(v, v1, new dgdu());
    }

    public final void n(String s, ShareTarget shareTarget0, boolean z, ibtw ibtw0) {
        boolean z1;
        synchronized(this) {
            ibuq.f(s, "localDeviceName");
            cunf cunf0 = dcvz.a;
            cunf cunf1 = cunf0.b();
            long v1 = shareTarget0.a;
            Long long0 = v1;
            cunf1.i("[NS_PROVIDER_API]: send to shareTarget %s qrCodeHandshakeRequired=%s.", long0, Boolean.valueOf(z));
            dfsq dfsq0 = this.e;
            if(dfsq0 != null) {
                dged dged0 = (dged)this.a.get(long0);
                if(dged0 != null) {
                    Context context0 = this.c;
                    String s1 = shareTarget0.e.getString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
                    if(!hvqz.p()) {
                        z1 = false;
                    }
                    else if(hvqz.a.b().z()) {
                        dcuv dcuv0 = dcuu.a(context0);
                        z1 = shareTarget0.h && !dcuv0.a();
                    }
                    else {
                        z1 = shareTarget0.h;
                    }
                    cunf0.b().h("shouldGeneratePreviews: %s", Boolean.valueOf(z1));
                    List list0 = shareTarget0.f();
                    List list1 = shareTarget0.i();
                    List list2 = shareTarget0.j();
                    List list3 = shareTarget0.d();
                    dggc dggc0 = new dggc(dfsq0.i, z1, list0, list1, list2, list3, s1, z);
                    if(this.g.l(v1, s, dggc0)) {
                        dged0.c = ibtw0;
                        dged0.e = dggc0;
                        if(!hvrc.m()) {
                            dged0.b = true;
                        }
                    }
                }
            }
        }
    }

    private final void o(long v, int v1, ibts ibts0) {
        dged dged0 = (dged)this.a.get(Long.valueOf(v));
        if(dged0 == null) {
            return;
        }
        dcnn dcnn0 = new dcnn(v1);
        if(!hvrc.m()) {
            if(dged0.b) {
                dcnn0.h = true;
            }
            dged0.b = false;
        }
        ibts0.a(dcnn0);
        TransferMetadata transferMetadata0 = dcnn0.a();
        ibtw ibtw0 = dged0.c;
        if(ibtw0 != null) {
            ibtw0.a(dged0.a(v), transferMetadata0);
        }
        if(transferMetadata0.e) {
            dged0.c = null;
        }
        dged0.d = transferMetadata0;
    }
}

