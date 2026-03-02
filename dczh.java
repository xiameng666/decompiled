final class dczh extends ibsl implements ibtw {
    final ddag a;

    public dczh(ddag ddag0, ibrl ibrl0) {
        this.a = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dczh)this.c(((ibom)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dczh(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a.a.h();
    }
}

