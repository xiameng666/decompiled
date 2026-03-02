final class rvc extends ibsl implements ibtw {
    public rvc(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibom ibom0 = (ibom)object0;
        return new rvc(((ibrl)object1)).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rvc(ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return ibom.a;
    }
}

