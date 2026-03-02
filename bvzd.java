public final class bvzd extends ibsl implements ibtw {
    int a;
    final lps b;
    final bvze c;
    final hgmn d;
    final du e;
    final ibts f;

    public bvzd(lps lps0, bvze bvze0, hgmn hgmn0, du du0, ibts ibts0, ibrl ibrl0) {
        this.b = lps0;
        this.c = bvze0;
        this.d = hgmn0;
        this.e = du0;
        this.f = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvzd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvzd(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bvzc bvzc0 = new bvzc(this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, bvzc0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

