public final class epmy extends ibsl implements ibtx {
    Object a;

    public epmy(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        epmy epmy0 = new epmy(((ibrl)object2));
        epmy0.a = (Throwable)object1;
        return epmy0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        ((ggtj)((ggtj)epnb.a.i()).s(((Throwable)object1))).x("error listening to mandatory biometrics setting");
        return ibom.a;
    }
}

