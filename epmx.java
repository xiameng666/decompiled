public final class epmx extends ibsl implements ibtw {
    boolean a;
    final epna b;

    public epmx(epna epna0, ibrl ibrl0) {
        this.b = epna0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epmx)this.c(((Boolean)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epmx(this.b, ibrl0);
        ibrl1.a = ((Boolean)object0).booleanValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.b.a(this.a);
        return ibom.a;
    }
}

