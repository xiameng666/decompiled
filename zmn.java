final class zmn extends ibsl implements ibtw {
    int a;
    final zms b;

    public zmn(zms zms0, ibrl ibrl0) {
        this.b = zms0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((zmn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new zmn(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = icjg.a(this.b.l, 500L);
            zmm zmm0 = new zmm(this.b);
            this.a = 1;
            if(icig0.oR(zmm0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

