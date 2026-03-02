final class rvb extends ibsl implements ibtw {
    Object a;

    public rvb(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rvb)this.c(object0, ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rvb(ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        ibuq.d(object1, "null cannot be cast to non-null type kotlin.Any");
        return object1;
    }
}

