final class sbd extends ibsl implements ibtw {
    int a;
    final sbe b;
    final ryh c;
    private Object d;

    public sbd(sbe sbe0, ryh ryh0, ibrl ibrl0) {
        this.b = sbe0;
        this.c = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((sbd)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new sbd(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.d;
            rzy rzy0 = new rzy(this.c);
            rzs rzs0 = new rzs(ichm0, this.c, ichm0, ichm0);
            sbb sbb0 = new sbb(this.b.a.d(rzy0, rzs0));
            this.a = 1;
            if(ichl.b(ichm0, sbb0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

