public final class ehme extends ibsl implements ibtw {
    final ehmg a;

    public ehme(ehmg ehmg0, ibrl ibrl0) {
        this.a = ehmg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehme)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehme(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return new ehlr(this.a.b);
    }
}

