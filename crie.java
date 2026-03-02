public final class crie {
    public final String a;
    private static final Object b;
    private final cric c;
    private final Object d;
    private final Object e;
    private final Object f;
    private volatile Object g;
    private volatile Object h;

    static {
        crie.b = new Object();
    }

    public crie(String s, Object object0, Object object1, cric cric0) {
        this.f = new Object();
        this.g = null;
        this.h = null;
        this.a = s;
        this.d = object0;
        this.e = object1;
        this.c = cric0;
    }

    public final Object a() {
        return this.b(null);
    }

    public final Object b(Object object0) {
        Object object4;
        __monitor_enter(this.f);
        __monitor_exit(this.f);
        if(object0 != null) {
            return object0;
        }
        crcn crcn0 = crid.a;
        if(crcn0 == null) {
            return this.e;
        }
        if(!crcn0.a) {
            synchronized(crie.b) {
                if(crcn.b()) {
                    return this.h == null ? this.d : this.h;
                }
            }
            try {
                for(Object object3: crif.a) {
                    crie crie0 = (crie)object3;
                    if(crcn.b()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    try {
                        object4 = null;
                        cric cric0 = crie0.c;
                        if(cric0 != null) {
                            object4 = cric0.a();
                        }
                    }
                    catch(IllegalStateException unused_ex) {
                    }
                    synchronized(crie.b) {
                        crie0.h = object4;
                    }
                }
            }
            catch(SecurityException unused_ex) {
            }
        }
        cric cric1 = this.c;
        if(cric1 != null) {
            try {
                return cric1.a();
            }
            catch(SecurityException | IllegalStateException unused_ex) {
            }
        }
        return crid.a.a ? this.e : this.d;
    }
}

