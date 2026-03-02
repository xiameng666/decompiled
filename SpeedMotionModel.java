public final class SpeedMotionModel extends gpxg {
    private final double e;
    private final double f;

    public SpeedMotionModel(RandomGenerator gpya0, double f, double f1) {
        super(gpya0);
        this.e = AngleUtils.b(f, 0.0, 10.0);
        this.f = AngleUtils.b(f1, 0.0, 10.0);
    }

    @Override  // IMotionModel
    public final void b(ParticleState gpxn0) {
        if((this.b > 0.0)) {
            gpxn0.timestamp_ = this.a;
            double f = gpxn0.getStateAt(2);
            gpxz gpxz0 = this.c;
            double f1 = this.b * this.f * gpxz0.makeNoise();
            double f2 = this.b * this.e * gpxz0.makeNoise();
            gpxn0.f(0, gpxn0.getStateAt(0) + (Math.cos(f) * f1 + Math.sin(f) * f2));
            gpxn0.f(1, gpxn0.getStateAt(1) + (f1 * Math.sin(f) - f2 * Math.cos(f)));
        }
    }
}

