public final class gpvr {
    public final fvcm a;
    public final double b;
    public final double c;
    public final int d;
    public final int e;
    public final double f;

    public gpvr(fvcm fvcm0, double f, double f1, int v, int v1, double f2) {
        this.a = fvcm0;
        this.b = f;
        this.c = f1;
        this.d = v;
        this.e = v1;
        this.f = f2;
    }

    public final int a(int v, int v1) {
        if(v >= 0) {
            return v >= this.d || v1 < 0 || v1 >= this.e ? -1 : v1 * this.d + v;
        }
        return -1;
    }

    public final int b(int v) {
        return v % this.d;
    }

    public final int c(int v) {
        return v / this.d;
    }

    public final fvuf d(ggzv ggzv0) {
        ggxn ggxn0 = this.a.a(ggzv0);
        return new fvuf(((double)((ggxn0.a - this.b) / this.f)), ((double)((ggxn0.b - this.c) / this.f)));
    }
}

