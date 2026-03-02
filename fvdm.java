public final class fvdm {
    public final fvir a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;

    public fvdm(fvir fvir0, ggzv ggzv0, double f, double f1, double f2) {
        this.a = fvir0;
        this.b = fvir0.b().a(ggzv0);
        this.c = fvir0.b().b(ggzv0);
        this.d = f;
        this.g = fvca.a(0.0, f) + fvbz.a(1.0, 38.0) * ((double)fvir0.d().size());
        this.e = f1;
        this.f = f2;
    }

    public final double a(int v, double f) {
        double f1 = this.c - ((double)this.a.b().g(v));
        double f2 = this.b - ((double)this.a.b().f(v));
        return Math.exp(this.f * fvca.a(Math.sqrt(f2 * f2 + f1 * f1) * this.a.b().f, this.d) + this.e * f - this.g);
    }
}

