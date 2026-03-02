final class grcc extends ibsl implements ibtw {
    int a;
    Object b;
    final ibts c;

    public grcc(ibts ibts0, ibrl ibrl0) {
        this.c = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((grcc)this.c(((grcn)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new grcc(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        Object object2 = this.c.a(((grcn)this.b));
        this.a = 1;
        Object object3 = icpu.c(((gmcd)object2), this);
        return object3 == object1 ? object1 : object3;
    }
}

