public final class dwfr extends ibsl implements ibtw {
    int a;
    final lps b;
    final icig c;
    final dwfy d;

    public dwfr(lps lps0, icig icig0, ibrl ibrl0, dwfy dwfy0) {
        this.b = lps0;
        this.c = icig0;
        this.d = dwfy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwfr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwfr(this.b, this.c, ibrl0, this.d);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dwfq dwfq0 = new dwfq(this.c, null, this.d);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, dwfq0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

