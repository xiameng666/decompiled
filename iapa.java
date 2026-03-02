public class iapa extends iaku {
    public final iaku f;

    protected iapa(iaku iaku0) {
        this.f = iaku0;
    }

    @Override  // iaku
    public void a(iapk iapk0, iaof_metadata iaof0) {
        this.f.a(iapk0, iaof0);
    }

    @Override  // iaku
    public void b(iaof_metadata iaof0) {
        this.f.b(iaof0);
    }

    @Override  // iaku
    public void c(Object object0) {
        this.f.c(object0);
    }

    @Override  // iaku
    public final void d() {
        this.f.d();
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("delegate", this.f);
        return gfsv0.toString();
    }
}

