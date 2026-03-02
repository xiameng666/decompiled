public final class fvhy {
    private final double a;
    private final double[] b;

    private fvhy(double f, double[] arr_f) {
        this.a = f;
        this.b = arr_f;
    }

    public final double a(double f) {
        double f1 = this.d(f);
        return this.b[0] + f1 * (this.b[1] + (this.b[2] + this.b[3] * f1) * f1);
    }

    public final double b(double f) {
        double f1 = this.d(f);
        return (this.b[1] + (this.b[2] + this.b[2] + this.b[3] * 3.0 * f1) * f1) * (3.0 / (this.a + 0.0));
    }

    public static fvhy c(double f, double f1, double f2, double f3, double f4) {
        gftb.checkTrue(Double.compare(Math.ulp(0.0) * 100.0 + 0.0, f) < 0);
        double f5 = (f4 - f3 * 3.0 + f2 * 3.0 - f1) / 6.0;
        double f6 = (f3 - (f2 + f2) + f1) / 2.0;
        return new fvhy(f, new double[]{f1, f2 - f1 - f6 + (f5 + f5), f6 - 3.0 * f5, f5});
    }

    private final double d(double f) {
        gftb.checkTrue(Double.compare(f, 0.0) >= 0 && f <= this.a);
        return (f + 0.0) * 3.0 / (this.a + 0.0);
    }
}

