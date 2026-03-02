final class lbz extends ibsl implements ibtw {
    int a;
    Object b;
    final lcc c;

    public lbz(lcc lcc0, ibrl ibrl0) {
        this.c = lcc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbz)this.c(((lcu)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lbz(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.c.m(((lcu)this.b), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

