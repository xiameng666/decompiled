public final class ggxu {
    public final double a;
    public final int b;

    public ggxu(int v, double f) {
        this.a = f;
        this.b = v;
    }

    public final int a(double f) {
        return Double.compare(f, 0.0) > 0 ? Math.max(0, Math.min(30, Math.getExponent(this.a / f) >> this.b - 1)) : 30;
    }
}

