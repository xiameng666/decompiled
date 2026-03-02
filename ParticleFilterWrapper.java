public final class ParticleFilterWrapper extends gpua {
    public final ISensorFusionProcessor b;
    long timestampNanos_;
    private final long d;

    public ParticleFilterWrapper(ISensorFusionProcessor gpuv0, long v) {
        this.timestampNanos_ = 0L;
        this.b = gpuv0;
        this.d = v;
        this.a = new ISensorFusionProcessor[]{gpuv0};
    }

    @Override  // gpua
    public final void d(long v, gptu_Position gptu0) {
        if(v > this.timestampNanos_ + this.d) {
            this.b.w();
        }
        if(!gptu0.s()) {
            this.updateTime(v);
        }
        this.b.d(v, gptu0);
    }

    @Override  // gpua
    public final void h(long v, gpvs gpvs0) {
        if(v > this.timestampNanos_ + this.d) {
            this.b.w();
        }
        this.b.h(v, gpvs0);
    }

    @Override  // gpua
    public final void o_handleStepEvent(long v) {
        if(v > this.timestampNanos_ + this.d) {
            this.b.w();
        }
        this.b.o_handleStepEvent(v);
    }

    @Override  // gpua
    public final void q(long v, fwed fwed0) {
        if(v > this.timestampNanos_ + this.d) {
            this.b.w();
        }
        this.updateTime(v);
        this.b.q(v, fwed0);
    }

    @Override  // gpua
    public final long r() {
        return this.b.r();
    }

    @Override  // gpua
    public final gptu_Position s() {
        return ((ParticleFilterProcessor)this.b).b;
    }

    public final void updateTime(long timestampNanos) {
        if(timestampNanos > this.timestampNanos_) {
            this.timestampNanos_ = timestampNanos;
        }
    }
}

