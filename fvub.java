public final class fvub extends fvtm {
    public final int a;
    public final int k;
    public final int l;

    public fvub(long v, long v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, gged_interceptors gged0) {
        super(v, v1, 4, v4, v2, v3, v7, (gged0 == null ? fvub.b : gged0), v9);
        this.a = v5;
        this.k = v6;
        this.l = v8;
    }

    @Override  // fvtm
    public final long a() {
        try {
            return gxnk.g(this.d, this.e, this.c);
        }
        catch(IllegalArgumentException unused_ex) {
            return -1L;
        }
    }

    @Override  // fvtm
    public final String b() {
        return " pci: " + this.a + " tac " + this.k + " timingAdvance " + this.l;
    }

    @Override  // fvtm
    public final boolean c() {
        return this.d > 0 && this.e > 0 && this.c > 0;
    }

    @Override  // fvtm
    public final boolean d(fvtm fvtm0) {
        return (fvtm0 instanceof fvub) && this.a == ((fvub)fvtm0).a && this.k == ((fvub)fvtm0).k;
    }
}

