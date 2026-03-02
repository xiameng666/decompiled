final class cbic extends ibsl implements ibtw {
    final cbij a;

    public cbic(cbij cbij0, ibrl ibrl0) {
        this.a = cbij0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbic)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbic(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.i.g(cbhs.a);
        return ibom.a;
    }
}

