final class etlb extends ibsl implements ibtw {
    final etlf a;

    public etlb(etlf etlf0, ibrl ibrl0) {
        this.a = etlf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((etlb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new etlb(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.m();
        return ibom.a;
    }
}

