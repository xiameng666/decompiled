final class fvpy {
    public final long[] a;
    public final boolean[] b;
    public final double[] c;
    public final double[] d;
    private int e;

    public fvpy() {
        this.a = new long[20];
        this.b = new boolean[20];
        this.c = new double[20];
        this.d = new double[20];
        this.e = 0;
        for(int v = 0; v < 20; ++v) {
            this.b[v] = false;
        }
    }

    public final void a(fvtm fvtm0, cjds cjds0) {
        int v = this.e;
        this.a[v] = fvtm0.a();
        int v1 = this.e;
        this.c[v1] = cjds0.b();
        int v2 = this.e;
        this.d[v2] = cjds0.c();
        int v3 = this.e;
        this.b[v3] = true;
        this.e = (v3 + 1) % 20;
    }
}

