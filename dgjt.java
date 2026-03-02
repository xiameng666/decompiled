final class dgjt extends ibsl implements ibtw {
    int a;
    final dgjr b;

    public dgjt(dgjr dgjr0, ibrl ibrl0) {
        this.b = dgjr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgjt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgjt(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.c.b(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

