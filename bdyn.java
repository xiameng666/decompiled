public final class bdyn extends ibsl implements ibtw {
    int a;
    final bdyo b;
    private Object c;

    public bdyn(bdyo bdyo0, ibrl ibrl0) {
        this.b = bdyo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdyn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bdyn(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icbb.b(((icck)this.c), null, null, new bdyl(this.b, null), 3);
            icig icig0 = icjj.a(this.b.a.c);
            bdym bdym0 = new bdym(this.b);
            this.a = 1;
            if(icig0.oR(bdym0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

