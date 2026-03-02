final class asoq extends ibsl implements ibtw {
    Object a;

    public asoq(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asoq)this.c(((aqqh)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new asoq(ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        aqqh aqqh0 = (aqqh)this.a;
        ((ggtj)asor.a.h()).B("Health data backup state updated to %s", aqqh0);
        return ibom.a;
    }
}

