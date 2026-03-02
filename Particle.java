public final class Particle {
    public ParticleState state_;

    public final void a(Particle gpxo0) {
        ParticleState gpxn0 = gpxo0.state_;
        if(gpxn0 != null) {
            if(this.state_ == null) {
                this.state_ = gpxn0.c();
            }
            this.state_.d(gpxo0.state_);
        }
    }

    public final void b() {
        ParticleState gpxn0 = this.state_;
        if(gpxn0 != null) {
            gpxn0.e();
        }
    }
}

