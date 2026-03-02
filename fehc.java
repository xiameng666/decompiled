import android.content.Context;
import j..util.concurrent.ConcurrentMap.-EL;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class fehc implements fdui, ffmj {
    public final Context a;
    public final fdxu b;
    public final ferc c;
    public final feqp d;
    public final gmcg e;
    public final fehy f;
    public final fehi g;
    public final ConcurrentMap h;
    public final ferz i;

    public fehc(Context context0, fdxu fdxu0, fehy fehy0, ferc ferc0, ferz ferz0, feqp feqp0, fehi fehi0, gmcg gmcg0, ConcurrentMap concurrentMap0) {
        this.a = context0;
        this.b = fdxu0;
        this.c = ferc0;
        this.i = ferz0;
        this.e = gmcg0;
        this.f = fehy0;
        this.d = feqp0;
        this.h = concurrentMap0;
        this.g = fehi0;
    }

    @Override  // fdui
    public final void a(String s, boolean z) {
        if(z) {
            fegy fegy0 = (fegy)this.h.get(s);
            if(fegy0 != null) {
                this.c(fegy0);
            }
        }
        else {
            fegy fegy1 = (fegy)this.h.remove(s);
            if(fegy1 != null) {
                ffmn.a("BleOffloadClientConnMgr", "onNearbyNodeChanged: [%s] away, stop connection %s", new Object[]{s, fegy1.b()});
                fegy1.h();
                this.b(fegy1.b());
            }
        }
    }

    public final void b(fczq fczq0) {
        String s = fczq0.j;
        if(gfta.c(s)) {
            ffmn.f("BleOffloadClientConnMgr", "Cannot add a config without a node ID", new Object[0]);
            return;
        }
        feha feha0 = new feha(this, fczq0);
        ConcurrentMap.-EL.computeIfAbsent(this.h, s, feha0);
    }

    public final void c(fegy fegy0) {
        gmcd gmcd1;
        gmcd gmcd0;
        String s = gfta.b(fegy0.b().j);
        ffmn.a("BleOffloadClientConn", "startConnection", new Object[0]);
        Lock lock0 = fegy0.c;
        lock0.lock();
        try {
            if(fegy0.r) {
                goto label_43;
            }
            else {
                AtomicReference atomicReference0 = fegy0.o;
                gmcd0 = (gmcd)atomicReference0.get();
                if(hzya.a.b().j()) {
                    int v = fegy0.s.a(fegy0.b);
                    int v1 = fegy0.p.getAndSet(v);
                    if(gmcd0 == null) {
                        if(!fegy0.h.getAndSet(true)) {
                            gmcd1 = fegy0.d();
                        }
                        else if(v1 != v) {
                            ffmn.f("BleOffloadClientConn", "startConnection: Connection PSM: %d preempted by PSM: %d", new Object[]{v1, v});
                            fegy0.n.a("startConnection: Connection preempted");
                            gmcd1 = fegy0.c();
                        }
                        else {
                            ffmn.f("BleOffloadClientConn", "startConnection: already active, dropping new request", new Object[0]);
                            gmcd1 = gmbx.a;
                        }
                    }
                    else if(v1 != v) {
                        ffmn.d("BleOffloadClientConn", "startConnection: in progress connection with PSM: %d preempted by PSM: %d. Connection future: %s", new Object[]{v1, v, gmcd0});
                        atomicReference0.set(null);
                        gmcd0.cancel(false);
                        fegy0.h.set(true);
                        gmcd1 = fegy0.c();
                    }
                    else {
                        ffmn.d("BleOffloadClientConn", "startConnection: connection in progress: %s", new Object[]{gmcd0});
                        gmcd1 = glzd.f(gmcd0, new fegt(), gmap.a);
                    }
                    goto label_49;
                }
                else if(gmcd0 != null) {
                    goto label_40;
                }
                else if(fegy0.h.getAndSet(true)) {
                    ffmn.f("BleOffloadClientConn", "startConnection: already active, dropping request", new Object[0]);
                    goto label_35;
                }
                else {
                    gmcd1 = fegy0.d();
                    goto label_49;
                }
            }
            goto label_50;
        }
        catch(Throwable throwable0) {
            fegy0.c.unlock();
            throw throwable0;
        }
    label_35:
        fegy0.c.unlock();
        gmcd1 = gmbx.a;
        goto label_50;
        try {
            gmcd1 = fegy0.d();
            goto label_49;
        label_40:
            ffmn.d("BleOffloadClientConn", "startConnection: connection in progress: %s", new Object[]{gmcd0});
            gmcd1 = glzd.f(gmcd0, new fegu(), gmap.a);
            goto label_49;
        label_43:
            ffmn.b("BleOffloadClientConn", "startConnection: was already stopped %s", new Object[]{fegy0.b});
            gmcd1 = gmbu.h(new IllegalStateException("connection stopped"));
        }
        catch(Throwable throwable0) {
            fegy0.c.unlock();
            throw throwable0;
        }
    label_49:
        lock0.unlock();
    label_50:
        gmbu.t(gmcd1, new fehb(this, s), this.e);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Number of offload connections: " + this.h.size());
        bbpd0.b();
        fegz fegz0 = new fegz(bbpd0, z, z1);
        ConcurrentMap.-EL.forEach(this.h, fegz0);
        bbpd0.a();
    }
}

