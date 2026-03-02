final class dgds extends ibsl implements ibtw {
    Object a;
    final dgdt b;

    public dgds(dgdt dgdt0, ibrl ibrl0) {
        this.b = dgdt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgds)this.c(((dgjp)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgds(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.b.g(((dgjp)this.a));
        return ibom.a;
    }
}

