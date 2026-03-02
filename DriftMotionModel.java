public final class DriftMotionModel extends gpxx {
    final double a;
    public double b;
    private double c;
    private boolean e;

    public DriftMotionModel(double f) {
        this.b = NaN;
        this.e = false;
        this.a = Math.exp(f * f / 2.0);
    }

    @Override  // gpxx
    public final void a_isExpectedModel() {
        gftb.z(this.d, "Evidence needs to be set.");
        double f = this.d.timestamp_;
        if(Double.isNaN(this.b)) {
            this.b = f;
            return;
        }
        double f1 = this.b;
        if((f <= f1)) {
            return;
        }
        this.c = f - f1;
        this.b = f;
        this.e = true;
    }

    @Override  // IMotionModel
    public final void b(ParticleState gpxn0) {
        if(this.e) {
            gpxn0.timestamp_ = this.b;
            double f = gpxn0.getStateAt(2);
            double f1 = gpxn0.getStateAt(3) * this.c * this.a;
            double f2 = Math.cos(f) * f1;
            double f3 = f1 * Math.sin(f);
            if(!Double.isNaN(f2) && !Double.isNaN(f3)) {
                gpxn0.f(0, gpxn0.getStateAt(0) + f2);
                gpxn0.f(1, gpxn0.getStateAt(1) + f3);
            }
        }
    }

    @Override  // gpxx
    public final void c() {
        this.e = false;
    }
}

