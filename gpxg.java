public abstract class gpxg extends gpxw {
    public double a;
    double b;
    private final double e;
    private final int f;

    public gpxg(RandomGenerator gpya0) {
        super(gpya0);
        this.a = NaN;
        this.b = 0.0;
        double f = AngleUtils.b(2.0, 0.0, 10.0);
        this.e = f;
        this.f = (int)Math.max(f, 1.0);
    }

    @Override  // gpxx
    public final void a_isExpectedModel() {
        gftb.z(this.d, "Evidence needs to be set.");
        double f = this.d.timestamp_;
        if(Double.isNaN(this.a)) {
            this.a = f;
            return;
        }
        double f1 = this.a;
        if((f <= f1)) {
            return;
        }
        int v = (int)((f - f1) * this.e);
        if(v > 0) {
            this.a = f;
        }
        int v1 = this.f;
        if(v > v1) {
            v = v1;
        }
        this.b = Math.sqrt(v);
    }

    @Override  // gpxx
    public final void c() {
        this.b = 0.0;
    }

    public final void d() {
        this.a = NaN;
        this.c();
    }
}

