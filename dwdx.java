public final class dwdx extends ibsl implements ibtw {
    int a;
    final lps b;
    final icig c;
    final dwef d;

    public dwdx(lps lps0, icig icig0, ibrl ibrl0, dwef dwef0) {
        this.b = lps0;
        this.c = icig0;
        this.d = dwef0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwdx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwdx(this.b, this.c, ibrl0, this.d);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dwdw dwdw0 = new dwdw(this.c, null, this.d);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, dwdw0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

