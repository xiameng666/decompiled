public final class fvcq {
    private final fvcp a;

    public fvcq() {
        this.a = new fvcp();
    }

    public final int a() {
        int v1;
        synchronized(this) {
            v1 = 0;
            for(Object object0: this.a.b()) {
                v1 += ((fvcp)object0).a();
            }
        }
        return v1;
    }

    public final Object b(int v, int v1) {
        Object object0;
        synchronized(this) {
            fvcp fvcp0 = (fvcp)this.a.c(v1);
            if(fvcp0 == null) {
                return null;
            }
            object0 = fvcp0.c(v);
        }
        return object0;
    }

    public final void c(int v, int v1, Object object0) {
        synchronized(this) {
            fvcp fvcp0 = this.a;
            fvcp fvcp1 = (fvcp)fvcp0.c(v1);
            if(fvcp1 == null) {
                fvcp1 = new fvcp();
                fvcp0.d(v1, fvcp1);
            }
            fvcp1.d(v, object0);
        }
    }

    public final void d(gfsi gfsi0) {
        synchronized(this) {
            for(Object object0: this.a.b()) {
                for(Object object1: ((fvcp)object0).b()) {
                    gfsi0.apply(object1);
                }
            }
        }
    }
}

