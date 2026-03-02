final class dcvr extends ibsl implements ibtx {
    public dcvr(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Exception exception0 = (Exception)object1;
        return new dcvr(((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Boolean.valueOf(false);
    }
}

