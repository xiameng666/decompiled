public final class gpyz extends gpzc {
    private final double g;
    private final double h;
    private final boolean i;

    public gpyz(flpRttFlags hurm0) {
        super(hurm0);
        this.g = hurm0.c();
        this.h = hurm0.b();
        this.i = hurm0.A();
    }

    @Override  // gpzc
    public final double d(double f, double f1, double f2, double f3) {
        double f4 = this.g / Math.hypot((this.i ? this.c * f2 * f1 : this.c * f2), this.b * f3);
        double f5 = f - f1;
        double f6 = Math.signum(f5);
        return f4 / (this.h + 1.0 / this.h) * Math.exp(-f5 * f4 * f6 * Math.pow(this.h, f6));
    }
}

