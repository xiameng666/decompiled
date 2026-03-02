public final class ldb extends ibsl implements ibtw {
    final ldf a;

    public ldb(ldf ldf0, ibrl ibrl0) {
        this.a = ldf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ldb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ldb(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return new Integer(this.a.f().a());
    }
}

