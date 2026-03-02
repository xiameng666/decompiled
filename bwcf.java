final class bwcf extends ibsl implements ibtw {
    int a;
    final ibts b;
    final Object c;

    public bwcf(ibts ibts0, Object object0, ibrl ibrl0) {
        this.b = ibts0;
        this.c = object0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bwcf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bwcf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(iccv.c(100L, this) == object1) {
                return object1;
            }
        }
        this.b.a(this.c);
        return ibom.a;
    }
}

