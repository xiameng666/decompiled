final class ccib extends ibsl implements ibtw {
    int a;
    final lps b;
    final lqj c;
    final cchx d;

    public ccib(lps lps0, cchx cchx0, lqj lqj0, ibrl ibrl0) {
        this.b = lps0;
        this.d = cchx0;
        this.c = lqj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ccib)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ccib(this.b, this.d, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ccia ccia0 = new ccia(this.d, this.c, null);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, ccia0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

