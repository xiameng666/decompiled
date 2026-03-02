abstract class iaxx implements iavn {
    protected abstract iavn a();

    @Override  // iavb
    public iauy b(gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, iakq iakq0, ialc[] arr_ialc) {
        throw null;
    }

    @Override  // iamq
    public final iaml c() {
        return this.a().c();
    }

    @Override  // ibbs
    public final Runnable d(ibbr ibbr0) {
        return this.a().d(ibbr0);
    }

    @Override  // ibbs
    public void p(iapk iapk0) {
        this.a().p(iapk0);
    }

    @Override  // ibbs
    public void q(iapk iapk0) {
        this.a().q(iapk0);
    }

    @Override  // iavn
    public final iakk r() {
        return this.a().r();
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("delegate", this.a());
        return gfsv0.toString();
    }
}

