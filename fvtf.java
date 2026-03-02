public final class fvtf extends fvtm {
    public final int a;

    public fvtf(long v, long v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, gged_interceptors gged0) {
        super(v, v1, v2, v3, v4, v5, v7, gged0, v8);
        this.a = v6;
    }

    @Override  // fvtm
    public final long a() {
        try {
            return gxni.g(this.e, this.a, this.c);
        }
        catch(IllegalArgumentException unused_ex) {
            return -1L;
        }
    }

    @Override  // fvtm
    public final String b() {
        return " lac: " + this.a;
    }

    @Override  // fvtm
    public final boolean c() {
        return this.a != -1 && this.d >= 0 && this.e >= 0;
    }

    @Override  // fvtm
    public final boolean d(fvtm fvtm0) {
        return (fvtm0 instanceof fvtf) && this.a == ((fvtf)fvtm0).a;
    }
}

