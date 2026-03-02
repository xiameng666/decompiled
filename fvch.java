public final class fvch {
    public final fvcl a;
    public final int b;
    public final int c;
    public final double d;
    private final int e;

    public fvch(fvcl fvcl0, double f, int v, int v1) {
        this.a = fvcl0;
        this.d = f;
        this.b = v1;
        this.c = v;
        this.e = (int)Math.ceil(f);
    }

    public final int a() {
        return this.b + this.e;
    }

    public final int b() {
        return this.b - this.e;
    }

    public final int c() {
        return this.c + this.e;
    }

    public final int d() {
        return this.c - this.e;
    }

    public static fvch e(fvcl fvcl0, ggzv ggzv0, double f) {
        int v = (int)Math.round(fvcl0.a(ggzv0));
        int v1 = (int)Math.round(fvcl0.b(ggzv0));
        return new fvch(fvcl0, f / fvcl0.f, v, v1);
    }

    public final fvcj f() {
        if(this.a.k(this.d(), this.b()) && this.a.k(this.c(), this.b()) && this.a.k(this.d(), this.a()) && this.a.k(this.c(), this.a())) {
            return new fvcg(this);
        }
        throw new IndexOutOfBoundsException();
    }
}

