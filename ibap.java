import j..util.Objects;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

final class ibap extends iaoq {
    final iban a;
    final iaou b;
    final ibbd c;

    public ibap(ibbd ibbd0, iban iban0, iaou iaou0) {
        Objects.requireNonNull(ibbd0);
        this.c = ibbd0;
        super();
        this.a = iban0;
        gftb.z(iaou0, "resolver");
        this.b = iaou0;
    }

    @Override  // iaoq
    public final iapk a(iaos iaos0) {
        iang iang0;
        ibbq ibbq1;
        ibbq ibbq0;
        ibbd ibbd0 = this.c;
        iaps iaps0 = ibbd0.n;
        iaps0.d();
        if(ibbd0.t == this.b) {
            iapm iapm0 = iaos0.a;
            if(!iapm0.d()) {
                this.b(iapm0.a());
                return iapm0.a();
            }
            Object object0 = iapm0.c();
            iakt iakt0 = ibbd0.I;
            iakk iakk0 = iaos0.b;
            iakt0.b(1, "Resolved address: {0}, config={1}", new Object[]{object0, iakk0});
            if(ibbd0.U != 2) {
                iakt0.b(2, "Address resolved: {0}", new Object[]{object0});
                ibbd0.U = 2;
            }
            iaoo iaoo0 = iaos0.c;
            iami iami0 = (iami)iakk0.a(iami.a);
            if(iaoo0 == null) {
                ibbq0 = null;
            }
            else {
                Object object1 = iaoo0.b;
                ibbq0 = object1 == null ? null : ((ibbq)object1);
            }
            iapk iapk0 = iaoo0 == null ? null : iaoo0.a;
            if(ibbd0.N) {
                if(ibbq0 == null) {
                    if(iapk0 == null) {
                        ibbq0 = ibbd.e;
                        ibbd0.K.d(null);
                    }
                    else {
                        if(!ibbd0.M) {
                            iakt0.a(2, "Fallback to error due to invalid first service config without default config");
                            gftb.b(((boolean)(iaoo0.a.h() ^ 1)), "the error status must not be OK");
                            iaps0.execute(new ibao(this, iaoo0.a));
                            return iaoo0.a;
                        }
                        ibbq0 = ibbd0.L;
                    }
                }
                else if(iami0 != null) {
                    ibbd0.K.d(iami0);
                    if(ibbq0.a() != null) {
                        iakt0.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                }
                else {
                    iami iami2 = ibbq0.a();
                    ibbd0.K.d(iami2);
                }
                if(!ibbq0.equals(ibbd0.L)) {
                    iakt0.b(2, "Service config changed{0}", new Object[]{(ibbq0 == ibbd.e ? " to empty" : "")});
                    ibbd0.L = ibbq0;
                    ibbd0.T.a = ibbq0.a;
                }
                ibbd0.M = true;
                ibbq1 = ibbq0;
            }
            else {
                if(ibbq0 != null) {
                    iakt0.a(2, "Service config from name resolver discarded by channel settings");
                }
                ibbq1 = ibbd.e;
                if(iami0 != null) {
                    iakt0.a(2, "Config selector from name resolver discarded by channel settings");
                }
                iami iami1 = ibbq1.a();
                ibbd0.K.d(iami1);
            }
            iakk iakk1 = iaos0.b;
            iban iban0 = this.a;
            if(iban0 == this.c.v) {
                iaki iaki0 = new iaki(iakk1);
                iakj iakj0 = iami.a;
                if(iaki0.a.b.containsKey(iakj0)) {
                    IdentityHashMap identityHashMap0 = new IdentityHashMap(iaki0.a.b);
                    identityHashMap0.remove(iakj0);
                    iaki0.a = new iakk(identityHashMap0);
                }
                IdentityHashMap identityHashMap1 = iaki0.b;
                if(identityHashMap1 != null) {
                    identityHashMap1.remove(iakj0);
                }
                Map map0 = ibbq1.c;
                if(map0 != null) {
                    iaki0.b(ianf.a, map0);
                    iaki0.a();
                }
                iakk iakk2 = iaki0.a();
                Object object2 = iapm0.c();
                iauc iauc0 = iban0.a;
                ianb ianb0 = new ianb(((List)object2), iakk2, ibbq1.b);
                ibfg ibfg0 = (ibfg)ianb0.c;
                if(ibfg0 == null) {
                    try {
                        String s = iauc0.d.b;
                        iang0 = iauc0.d.a.a(s);
                        if(iang0 == null) {
                            throw new iaug(a.d("using default policy", s, "Trying to load \'", "\' because ", ", but it\'s unavailable"));
                        }
                    }
                    catch(iaug iaug0) {
                        iauc0.a.f(iall.c, new iaue(iapk.p.f(iaug0.getMessage())));
                        iauc0.b.d();
                        iauc0.c = null;
                        iauc0.b = new iauf();
                        return iapk.b;
                    }
                    ibfg0 = new ibfg(iang0, null);
                }
                iang iang1 = iauc0.c;
                if(iang1 == null) {
                label_97:
                    iaud iaud0 = new iaud();
                    iauc0.a.f(iall.a, iaud0);
                    iauc0.b.d();
                    iauc0.c = ibfg0.a;
                    ianf ianf0 = iauc0.b;
                    iauc0.b = iauc0.c.a(iauc0.a);
                    iauc0.a.a().b(2, "Load balancer changed from {0} to {1}", new Object[]{ianf0.getClass().getSimpleName(), iauc0.b.getClass().getSimpleName()});
                }
                else {
                    String s1 = iang1.c();
                    if(!ibfg0.a.c().equals(s1)) {
                        goto label_97;
                    }
                }
                Object object3 = ibfg0.b;
                if(object3 != null) {
                    iauc0.a.a().b(1, "Load-balancing config: {0}", new Object[]{object3});
                }
                return iauc0.b.a(new ianb(ianb0.a, ianb0.b, object3));
            }
            return iapk.b;
        }
        return iapk.b;
    }

    public final void b(iapk iapk0) {
        ibbd ibbd0 = this.c;
        ibbd.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{ibbd0.i, iapk0});
        ibaz ibaz0 = ibbd0.K;
        if(ibaz0.a.get() == ibbd.f) {
            ibaz0.d(null);
        }
        if(ibbd0.U != 3) {
            ibbd0.I.b(3, "Failed to resolve name: {0}", new Object[]{iapk0});
            ibbd0.U = 3;
        }
        iban iban0 = this.a;
        if(iban0 != ibbd0.v) {
            return;
        }
        iban0.a.b.b(iapk0);
    }
}

