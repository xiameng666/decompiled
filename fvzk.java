import j..time.Duration;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class fvzk {
    public fvzh a;
    public final fvzn b;
    public final ggrv c;
    public final ExecutorService d;
    public boolean e;
    public ObserverRegistry f;
    public final cczf g;
    public final cczf h;
    public final huqn_elevationGraphOptimizerFlags i;
    public final Map j;
    public final Map k;
    private final fgvt l;

    public fvzk(gpwg gpwg0, ExecutorService executorService0, huqn_elevationGraphOptimizerFlags huqn0, gfsi gfsi0, fgvt fgvt0) {
        this.e = false;
        this.d = executorService0;
        int v = (int)huqn0.G();
        this.b = new fvzn(gpwg0.a, v, gpwg0.b);
        this.c = gpwg0.b;
        this.i = huqn0;
        this.g = gfsi0.apply(cdef.ex);
        this.h = gfsi0.apply(cdef.gs);
        this.l = fgvt0;
        this.j = new HashMap();
        this.k = new HashMap();
    }

    public final ggeo a() {
        ggeo ggeo0;
        synchronized(this) {
            HashMap hashMap0 = new HashMap();
            for(Object object0: this.k.values()) {
                fvzj fvzj0 = (fvzj)object0;
                Long long0 = (long)fvzj0.d;
                List list0 = (List)Map.-EL.getOrDefault(hashMap0, long0, new ArrayList());
                Collections.sort(list0);
                if(list0.isEmpty()) {
                    list0.add(Long.valueOf(fvzj0.a));
                    hashMap0.put(long0, list0);
                }
                else {
                    long v1 = (long)(((Long)gggq.p(list0)));
                    long v2 = this.i.T();
                    if(Math.abs(v1 - fvzj0.a) >= v2) {
                        list0.add(Long.valueOf(fvzj0.a));
                        hashMap0.put(long0, list0);
                    }
                }
            }
            ggeo0 = ggeo.k(hashMap0);
        }
        return ggeo0;
    }

    public final icvk b() {
        fvzh fvzh0;
        synchronized(this) {
            fvzh0 = this.a;
            if(fvzh0 == null) {
                return null;
            }
        }
        return fvzh0.a;
    }

    public final void c(long v, Collection collection0, long v1) {
        synchronized(this) {
            HashMap hashMap0 = new HashMap();
            for(Object object0: collection0) {
                Long long0 = (long)((icvq)object0).b;
                List list0 = (List)Map.-EL.getOrDefault(hashMap0, long0, new ArrayList());
                list0.add(((icvq)object0));
                hashMap0.put(long0, list0);
            }
            ArrayList arrayList0 = new ArrayList();
            Map map0 = this.k;
            for(Object object1: map0.entrySet()) {
                fvzj fvzj0 = (fvzj)((Map.Entry)object1).getValue();
                List list1 = (List)hashMap0.get(Long.valueOf(fvzj0.d));
                if(list1 != null) {
                    for(Object object2: list1) {
                        icvq icvq0 = (icvq)object2;
                        long v3 = Duration.ofNanos(v).minusMillis(fvzj0.a).toMillis();
                        if(Math.abs(icvq0.c - (v1 - v3)) < this.i.T()) {
                            arrayList0.add(new fvzg(fvzj0.b, (icvq0.d == null ? icvr.a : icvq0.d).b, (icvq0.d == null ? icvr.a : icvq0.d).c, gged_interceptors.l(fvzj0.c)));
                        }
                    }
                }
            }
            map0.clear();
            if(!arrayList0.isEmpty()) {
                fvza fvza0 = new fvza(this, v, arrayList0, v1);
                this.d.execute(fvza0);
                synchronized(this) {
                    if(this.f != null && (this.a != null && (this.a.b != null && !this.a.b.isEmpty()))) {
                        ObserverRegistry gpyo0 = this.f;
                        gftb.check(this.a.b);
                        gftb.check(this.a.c);
                        gftb.check(this.a.a);
                        fvzh fvzh0 = this.a;
                        gftb.check(fvzh0);
                        gftb.check(fvzh0.a);
                        for(Object object3: gpyo0.a) {
                            ((IFilterObserver)object3).ay();
                        }
                    }
                }
                return;
            }
            fvzd fvzd0 = new fvzd(this);
            this.d.execute(fvzd0);
        }
    }

    public final void d(Map map0) {
        huqn_elevationGraphOptimizerFlags huqn0 = this.i;
        if(huqn0.Z()) {
            fgvt fgvt0 = this.l;
            if((fgvt0 instanceof fvyg) && this.b.h() && !map0.isEmpty()) {
                Map map1 = this.j;
                map1.clear();
                fvyg fvyg0 = (fvyg)fgvt0;
                long v = huqn0.K();
                Long long0 = fyav.b().c(v);
                long v1 = long0 == null ? System.currentTimeMillis() : ((long)long0);
                Long.valueOf(v1).getClass();
                for(Object object0: map0.entrySet()) {
                    map1.put(((Integer)((Map.Entry)object0).getKey()), Double.valueOf(fvzm.a(huqn0, Duration.ofMillis(v1).minusDays(((icvl)((Map.Entry)object0).getValue()).b).toDays(), ((icvl)((Map.Entry)object0).getValue()).c)));
                }
            }
        }
    }

    public final void e() {
        synchronized(this) {
            this.e = false;
            this.a = null;
            if(!this.i.W()) {
                fvzb fvzb0 = new fvzb(this);
                this.d.execute(fvzb0);
            }
        }
    }

    public final void f(ObserverRegistry gpyo0) {
        synchronized(this) {
            this.f = gpyo0;
        }
    }

    public final void g() {
        synchronized(this) {
            this.f = null;
        }
    }

    public final boolean h() {
        synchronized(this) {
        }
        return !this.k.isEmpty();
    }
}

