import j..util.concurrent.ConcurrentHashMap;

public final class fekp implements Runnable {
    public final felm a;
    public final fczq b;

    public fekp(felm felm0, fczq fczq0) {
        this.a = felm0;
        this.b = fczq0;
    }

    @Override
    public final void run() {
        felm felm0 = this.a;
        if(felm0.o == null) {
            ferz ferz0 = (ferz)felm0.r.get();
            gmcg gmcg0 = ffgp.i();
            ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
            fehy fehy0 = new fehy(felm0.b);
            fehc fehc0 = new fehc(felm0.b, felm0.g, fehy0, felm0.j, ferz0, felm0.k, felm0.B, gmcg0, concurrentHashMap0);
            felm0.g.p(fehc0);
            felm0.o = fehc0;
        }
        felm0.o.b(this.b);
        fehc fehc1 = felm0.o;
        String s = this.b.j;
        if(gfta.c(s)) {
            ffmn.f("BleOffloadClientConnMgr", "Cannot identify a connection to start without a node ID", new Object[0]);
            return;
        }
        fegy fegy0 = (fegy)fehc1.h.get(s);
        if(fegy0 == null) {
            ffmn.a("BleOffloadClientConnMgr", "Ignoring request to start unknown node %s", new Object[]{s});
            return;
        }
        if(hzya.a.b().l()) {
            fdyo fdyo0 = fehc1.b.m(s);
            if(fdyo0 != null && fdyo0.b == 1) {
                fehc1.c(fegy0);
            }
        }
        else if(fehc1.b.k(s)) {
            fehc1.c(fegy0);
        }
    }
}

