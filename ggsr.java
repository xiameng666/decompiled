import j..util.concurrent.ConcurrentHashMap;

public abstract class ggsr {
    public final ConcurrentHashMap a;

    protected ggsr() {
        this.a = new ConcurrentHashMap();
    }

    protected abstract Object a();

    public final Object b(ggsp ggsp0, ggub ggub0) {
        ConcurrentHashMap concurrentHashMap0 = this.a;
        Object object0 = concurrentHashMap0.get(ggsp0);
        if(object0 != null) {
            return object0;
        }
        Object object1 = this.a();
        Object object2 = concurrentHashMap0.putIfAbsent(ggsp0, object1);
        if(object2 == null) {
            int v = ((ggsk)ggub0).b;
            ggsq ggsq0 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                ggsx ggsx0 = ggub0.c(v1);
                if(ggsj.f.equals(ggsx0)) {
                    Object object3 = ggub0.e(v1);
                    if((object3 instanceof ggsv)) {
                        if(ggsq0 == null) {
                            ggsq0 = new ggsq(this, ggsp0);
                        }
                        ((ggsv)object3).a();
                    }
                }
            }
            return object1;
        }
        return object2;
    }
}

