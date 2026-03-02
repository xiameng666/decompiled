final class qph extends ibsl implements ibtx {
    public qph(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object0).intValue();
        Throwable throwable0 = (Throwable)object1;
        return new qph(((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Boolean.valueOf(false);
    }
}

