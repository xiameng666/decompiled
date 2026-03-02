final class epmr extends ibsl implements ibtx {
    Object a;

    public epmr(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        epmr epmr0 = new epmr(((ibrl)object2));
        epmr0.a = (Throwable)object1;
        return epmr0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        ((ggtj)((ggtj)epnb.a.i()).s(((Throwable)object1))).x("error in framework shim significant places flow");
        return ibom.a;
    }
}

