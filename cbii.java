final class cbii extends ibsl implements ibtw {
    final cbij a;
    final gvlp b;

    public cbii(cbij cbij0, gvlp gvlp0, ibrl ibrl0) {
        this.a = cbij0;
        this.b = gvlp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbii)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbii(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.j.g(this.b);
        return ibom.a;
    }
}

