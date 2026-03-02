final class ifl extends igm {
    final ifn f;

    public ifl(ifn ifn0) {
        this.f = ifn0;
        super(ifn0);
    }

    @Override  // igm
    public final int a(int v) {
        ifk ifk0 = this.f.f;
        igm igm0 = this.f.G().C();
        ibuq.c(igm0);
        return ifk0.e(this, igm0, v);
    }

    @Override  // igm
    public final int b(int v) {
        ifk ifk0 = this.f.f;
        igm igm0 = this.f.G().C();
        ibuq.c(igm0);
        return ifk0.f(this, igm0, v);
    }

    @Override  // igm
    public final int c(int v) {
        ifk ifk0 = this.f.f;
        igm igm0 = this.f.G().C();
        ibuq.c(igm0);
        return ifk0.g(this, igm0, v);
    }

    @Override  // igm
    public final int d(int v) {
        ifk ifk0 = this.f.f;
        igm igm0 = this.f.G().C();
        ibuq.c(igm0);
        return ifk0.h(this, igm0, v);
    }

    @Override  // ias
    public final ibq e(long v) {
        this.eq(v);
        this.f.g = new jkp(v);
        ifk ifk0 = this.f.f;
        igm igm0 = this.f.G().C();
        ibuq.c(igm0);
        super.E(ifk0.b(this, igm0, v));
        return this;
    }

    @Override  // igl
    public final int q(hxw hxw0) {
        int v = ifo.a(this, hxw0);
        this.q.f(hxw0, v);
        return v;
    }
}

