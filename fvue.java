public final class fvue extends fvtm {
    public final int a;
    public final int k;
    public final long l;
    public final int m;

    public fvue(long v, long v1, int v2, int v3, long v4, int v5, int v6, int v7, int v8, int v9, gged_interceptors gged0) {
        super(v, v1, 5, 0, v2, v3, v7, (gged0 == null ? fvue.b : gged0), v9);
        this.l = v4;
        this.a = v5;
        this.k = v6;
        this.m = v8;
    }

    @Override  // fvtm
    public final long a() {
        try {
            return gxnm.g(this.d, this.e, this.l);
        }
        catch(IllegalArgumentException unused_ex) {
            return -1L;
        }
    }

    @Override  // fvtm
    public final String b() {
        return " nci: " + this.l + " pci: " + this.a + " tac " + this.k + " timingAdvance " + this.m;
    }

    @Override  // fvtm
    public final boolean c() {
        boolean z = huvd.l();
        long v = this.l;
        if(z) {
            return v == -1L ? false : this.d > 0 && this.e > 0;
        }
        return v <= 0L ? false : this.d > 0 && this.e > 0;
    }

    @Override  // fvtm
    public final boolean d(fvtm fvtm0) {
        return (fvtm0 instanceof fvue) && this.a == ((fvue)fvtm0).a && this.k == ((fvue)fvtm0).k && this.l == ((fvue)fvtm0).l;
    }
}

