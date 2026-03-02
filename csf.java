final class csf extends ibsl implements ibtw {
    int a;
    final csg b;

    public csf(csg csg0, ibrl ibrl0) {
        this.b = csg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((csf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new csf(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibvb ibvb0 = new ibvb();
            ibvb ibvb1 = new ibvb();
            ibvb ibvb2 = new ibvb();
            icig icig0 = this.b.a.a();
            cse cse0 = new cse(ibvb0, ibvb1, ibvb2, this.b);
            this.a = 1;
            if(icig0.oR(cse0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

