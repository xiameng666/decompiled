final class dwho extends ibsl implements ibtw {
    final dwhp a;

    public dwho(dwhp dwhp0, ibrl ibrl0) {
        this.a = dwhp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwho)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwho(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icck icck0 = lsc.a(this.a);
        this.a.e(icck0, new frxf[]{dwhg.a});
        return ibom.a;
    }
}

