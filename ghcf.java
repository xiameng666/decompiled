final class ghcf {
    public final int a;
    public final int b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final ghae h;
    public final ghae i;

    public ghcf(int v, int v1, ghae ghae0, ghae ghae1, ggxn ggxn0, ggxn ggxn1) {
        this.a = v;
        this.b = v1;
        this.d = ggxn0.a;
        this.e = ggxn0.b;
        this.f = ggxn1.a;
        this.g = ggxn1.b;
        this.h = ghae0;
        this.i = ghae1;
        double f = Math.sqrt(ghae0.d(ghae1));
        this.c = Double.compare(f, 0.0) <= 0 ? 30 : Math.max(0, Math.min(30, -(Math.getExponent(f / ghbj.c.a) >> ghbj.c.b - 1)));
    }

    @Override
    public final String toString() {
        return "shape " + this.a + " edge " + this.b;
    }
}

