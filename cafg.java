final class cafg extends ibsl implements ibtw {
    int a;
    final cafj b;

    public cafg(cafj cafj0, ibrl ibrl0) {
        this.b = cafj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cafg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cafg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b.g.a();
            caff caff0 = new caff(this.b);
            this.a = 1;
            if(icig0.oR(caff0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

