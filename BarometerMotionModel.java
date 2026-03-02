public final class BarometerMotionModel extends gpxx {
    @Override  // gpxx
    public final void a_isExpectedModel() {
        gftb.check(this.d);
        int v = this.d.data_;
        gftb.h(v == 6, "Expected type# %s, but got type# %s.", 6, v);
    }

    @Override  // IMotionModel
    public final void b(ParticleState gpxn0) {
        gftb.check(this.d);
        gpxn0.timestamp_ = this.d.timestamp_;
        double f = gpxn0.getStateAt(2);
        gpxm_Observation gpxm0 = this.d;
        gftb.check(gpxm0);
        gpxn0.f(2, AngleUtils.e(f + gpxm0.b(1)));
    }
}

