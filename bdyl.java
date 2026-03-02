final class bdyl extends ibsl implements ibtw {
    int a;
    final bdyo b;

    public bdyl(bdyo bdyo0, ibrl ibrl0) {
        this.b = bdyo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdyl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdyl(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = icjj.a(this.b.a.b);
            bdyk bdyk0 = new bdyk(this.b);
            this.a = 1;
            if(icig0.oR(bdyk0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

