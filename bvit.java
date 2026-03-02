final class bvit extends ibsl implements ibtw {
    final bvkk a;

    public bvit(bvkk bvkk0, ibrl ibrl0) {
        this.a = bvkk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvit)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvit(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.k.f(bvfu.a);
        return ibom.a;
    }
}

