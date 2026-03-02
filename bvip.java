final class bvip extends ibsl implements ibtw {
    int a;
    final bvkk b;

    public bvip(bvkk bvkk0, ibrl ibrl0) {
        this.b = bvkk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvip)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvip(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            Object object2 = ibom.a;
            Object object3 = this.b.j.b.a(object2, this);
            if(object3 == object1) {
                object2 = object3;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

