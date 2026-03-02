public final class gbfx extends ibsl implements ibtw {
    final gblf a;

    public gbfx(gblf gblf0, ibrl ibrl0) {
        this.a = gblf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbfx(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a;
    }
}

