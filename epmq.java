final class epmq extends ibsl implements ibtw {
    Object a;
    final epna b;

    public epmq(epna epna0, ibrl ibrl0) {
        this.b = epna0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epmq)this.c(((epfz)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epmq(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.b.d.a(Boolean.valueOf(((epfz)this.a) == epfz.a));
        return ibom.a;
    }
}

