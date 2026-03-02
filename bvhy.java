final class bvhy extends ibsl implements ibtw {
    Object a;
    final ibvd b;

    public bvhy(ibvd ibvd0, ibrl ibrl0) {
        this.b = ibvd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvhy)this.c(((bvia)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bvhy(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.b.a = (bvia)this.a;
        return ibom.a;
    }
}

