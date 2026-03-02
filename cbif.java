final class cbif extends ibsl implements ibtw {
    final cbij a;

    public cbif(cbij cbij0, ibrl ibrl0) {
        this.a = cbij0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbif)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbif(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.k.g(Boolean.valueOf(true));
        return ibom.a;
    }
}

