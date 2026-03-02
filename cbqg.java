final class cbqg extends ibsl implements ibtw {
    Object a;
    int b;
    final cbqh c;

    public cbqg(cbqh cbqh0, ibrl ibrl0) {
        this.c = cbqh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbqg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbqg(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            ((lqd)object2).ii(object0);
            return ibom.a;
        }
        ibnx.b(object0);
        lqi lqi0 = this.c.c;
        this.a = lqi0;
        this.b = 1;
        cbqe cbqe0 = new cbqe(this.c, null);
        object0 = icbd.a(cclw.d, cbqe0, this);
        if(object0 != object1) {
            object2 = lqi0;
            ((lqd)object2).ii(object0);
            return ibom.a;
        }
        return object1;
    }
}

