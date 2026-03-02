final class cbrq extends ibsl implements ibtw {
    final cbrs a;

    public cbrq(cbrs cbrs0, ibrl ibrl0) {
        this.a = cbrs0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbrq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbrq(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.E();
        return ibom.a;
    }
}

