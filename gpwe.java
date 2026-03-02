public final class gpwe {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final boolean f;
    private double g;
    private int h;
    private int i;
    private boolean j;

    public gpwe(double f, double f1, double f2, double f3, double f4, boolean z) {
        this.g = NaN;
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }

    public final double a(int v, int v1, double f, double f1) {
        if(this.j && ((f1 - this.g <= this.c) || !this.f && (GeoMath.d(v, v1, this.h, this.i) <= this.d) && (f > this.e))) {
            return NaN;
        }
        this.h = v;
        this.i = v1;
        this.g = f1;
        this.j = true;
        return AngleUtils.b(f, this.a, this.b);
    }

    public final void b() {
        this.g = NaN;
        this.h = 0;
        this.i = 0;
        this.j = false;
    }
}

