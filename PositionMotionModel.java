public final class PositionMotionModel extends gpxg {
    private final double e;

    public PositionMotionModel(RandomGenerator gpya0, double f) {
        super(gpya0);
        this.e = AngleUtils.b(f, 0.0, 10.0);
    }

    @Override  // IMotionModel
    public final void b(ParticleState gpxn0) {
        double f = this.b;
        if((f > 0.0)) {
            gpxn0.timestamp_ = this.a;
            double f1 = this.c.makeNoise();
            gpxn0.f(3, Math.max(0.0, gpxn0.getStateAt(3) + f * this.e * f1));
        }
    }
}

