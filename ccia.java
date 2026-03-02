final class ccia extends ibsl implements ibtw {
    int a;
    final lqj b;
    final cchx c;

    public ccia(cchx cchx0, lqj lqj0, ibrl ibrl0) {
        this.c = cchx0;
        this.b = lqj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ccia)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ccia(this.c, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cchz cchz0 = new cchz(this.b);
            this.a = 1;
            if(ccic.a(this.c, cchz0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

