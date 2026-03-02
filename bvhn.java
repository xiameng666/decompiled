final class bvhn extends ibsl implements ibtw {
    int a;
    final bvkk b;

    public bvhn(bvkk bvkk0, ibrl ibrl0) {
        this.b = bvkk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvhn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvhn(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bvhm bvhm0 = new bvhm(this.b);
            this.a = 1;
            if(this.b.l.oR(bvhm0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

