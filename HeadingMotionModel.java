public final class HeadingMotionModel extends gpxg {
    private final double e;

    public HeadingMotionModel(RandomGenerator gpya0, double f) {
        super(gpya0);
        this.e = AngleUtils.b(f, 0.0, 2.0);
    }

    @Override  // IMotionModel
    public final void b(ParticleState gpxn0) {
        double f = this.b;
        if((f > 0.0)) {
            gpxn0.timestamp_ = this.a;
            double f1 = this.c.makeNoise();
            gpxn0.f(2, gpxn0.getStateAt(2) + AngleUtils.e(f * this.e * f1));
        }
    }
}

