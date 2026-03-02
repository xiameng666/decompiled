final class fvic {
    final double a;
    public final fvhy[] b;
    public long c;
    private final double d;

    public fvic(fvek fvek0) {
        this.b = new fvhy[4];
        double f = fvek0.a == 3 ? 30.0 : 60.0;
        this.a = f;
        this.d = f * 3.0;
    }

    public final double a(fvhw fvhw0) {
        return ((double)(fvhw0.c() - this.c)) * 1.000000E-09;
    }

    final boolean b(fvhw fvhw0) {
        double f = this.a(fvhw0);
        return f >= 0.0 && f <= this.d;
    }
}

