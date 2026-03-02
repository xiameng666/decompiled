public final class fxdw extends fxov implements cmuy {
    private static final fxou a;
    private final cmuz b;
    private boolean c;
    private fxou d;

    static {
        bboh.c("EQMon", bbcu.g, "StatLsnr");
        fxdw.a = new fxou(2, 23);
    }

    public fxdw(cmuz cmuz0, fxnw fxnw0) {
        super(fxnw0);
        this.b = cmuz0;
        this.d = fxou.a;
    }

    private final void a(boolean z) {
        fxou fxou0 = this.d;
        fxou fxou1 = z ? fxou.b : fxdw.a;
        this.d = fxou1;
        if(!fxou1.equals(fxou0)) {
            this.i.a();
        }
    }

    @Override  // fxov
    public final fxou b() {
        synchronized(this) {
        }
        return this.d;
    }

    @Override  // cmuy
    public final void c(boolean z) {
        synchronized(this) {
            this.c = (int)z;
            if(huwd.y()) {
                this.e(((boolean)(((int)z) ^ 1)), 24);
                return;
            }
            this.a(((boolean)(((int)z) ^ 1)));
        }
    }

    @Override  // cmuy
    public final void d(boolean z, ggfp ggfp0, cmyl cmyl0) {
        int v1;
        synchronized(this) {
            if(this.c) {
                if(huwd.y()) {
                    switch(cmyl0.ordinal()) {
                        case 0: {
                            v1 = 23;
                            break;
                        }
                        case 1: {
                            v1 = 25;
                            break;
                        }
                        case 2: {
                            v1 = 26;
                            break;
                        }
                        case 3: {
                            v1 = 27;
                            break;
                        }
                        case 4: {
                            v1 = 28;
                            break;
                        }
                        case 5: {
                            v1 = 29;
                            break;
                        }
                        case 6: {
                            v1 = 30;
                            break;
                        }
                        default: {
                            throw new RuntimeException(null, null);
                        }
                    }
                    this.e(z, v1);
                    return;
                }
                this.a(z);
            }
        }
    }

    private final void e(boolean z, int v) {
        fxou fxou0 = this.d;
        fxou fxou1 = z ? fxou.b : new fxou(2, v);
        this.d = fxou1;
        if(!fxou1.equals(fxou0)) {
            this.i.a();
        }
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            this.d = fxou.a;
            this.b.m(this);
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            this.b.n(this);
            this.d = fxou.a;
        }
    }
}

