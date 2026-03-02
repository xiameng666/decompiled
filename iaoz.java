abstract class iaoz extends iakv {
    @Override  // iakv
    public void a(String s, Throwable throwable0) {
        this.s().a(s, throwable0);
    }

    @Override  // iakv
    public void b() {
        this.s().b();
    }

    @Override  // iakv
    public void c(int v) {
        this.s().c(v);
    }

    @Override  // iakv
    public final iakk k() {
        return this.s().k();
    }

    protected abstract iakv s();

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("delegate", this.s());
        return gfsv0.toString();
    }
}

