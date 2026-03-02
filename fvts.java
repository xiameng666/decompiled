public final class fvts extends fvtm {
    public final int a;
    public final int k;

    public fvts(long v, long v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, gged_interceptors gged0) {
        super(v, v1, v2, v3, v4, v5, v8, gged0, v9);
        this.a = v6;
        this.k = v7 == 0 || v7 == 0x7FFFFFFF ? -1 : v7;
    }

    @Override  // fvtm
    public final long a() {
        try {
            return this.h == 3 ? gxnn.g(this.d, this.e, this.c) : gxnj.i(this.d, this.e, this.a, this.c);
        }
        catch(IllegalArgumentException unused_ex) {
            return -1L;
        }
    }

    @Override  // fvtm
    public final String b() {
        return " lac: " + this.a + " psc: " + this.k;
    }

    @Override  // fvtm
    public final boolean c() {
        return this.d > 0 && this.e > 0 && this.a > 0 && this.c > 0;
    }

    @Override  // fvtm
    public final boolean d(fvtm fvtm0) {
        if((fvtm0 instanceof fvts)) {
            int v = ((fvts)fvtm0).k;
            return (v == -1 ? 0 : 1) == (this.k == -1 ? 0 : 1) && this.a == ((fvts)fvtm0).a && this.k == v;
        }
        return false;
    }
}

