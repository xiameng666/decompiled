final class bvzc extends ibsl implements ibtw {
    int a;
    final bvze b;
    final hgmn c;
    final du d;
    final ibts e;

    public bvzc(bvze bvze0, hgmn hgmn0, du du0, ibts ibts0, ibrl ibrl0) {
        this.b = bvze0;
        this.c = hgmn0;
        this.d = du0;
        this.e = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvzc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvzc(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            hgmn hgmn0 = this.c;
            hgmm hgmm0 = hgmm.b(hgmn0.b) == null ? hgmm.f : hgmm.b(hgmn0.b);
            icmn icmn0 = (icmn)this.b.a.get(hgmm0);
            if(icmn0 != null) {
                bvzb bvzb0 = new bvzb(icmn0, hgmn0);
                bvyy bvyy0 = new bvyy(this.d, this.e);
                this.a = 1;
                if(bvzb0.oR(bvyy0, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

