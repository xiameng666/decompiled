final class deso extends ibsl implements ibtw {
    final gei a;

    public deso(gei gei0, ibrl ibrl0) {
        this.a = gei0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deso)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deso(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.b();
        return ibom.a;
    }
}

