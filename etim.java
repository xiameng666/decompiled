public final class etim extends ibsl implements ibtw {
    int a;
    final icig b;
    final etip c;

    public etim(icig icig0, ibrl ibrl0, etip etip0) {
        this.b = icig0;
        this.c = etip0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((etim)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new etim(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            etil etil0 = new etil(this.c);
            this.a = 1;
            if(this.b.oR(etil0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

