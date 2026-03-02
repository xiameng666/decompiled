final class bvib extends ibsl implements ibtw {
    int a;
    final bvkk b;

    public bvib(bvkk bvkk0, ibrl ibrl0) {
        this.b = bvkk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvib)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvib(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibvd ibvd0 = new ibvd();
            bvhx bvhx0 = new bvhx(null);
            icjm icjm0 = new icjm(new iclv(new iclx(null, this.b.l, bvhx0), new bvhy(ibvd0, null)), new bvhz(this.b, ibvd0, null));
            this.a = 1;
            if(icir.a(icjm0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

