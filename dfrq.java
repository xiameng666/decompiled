public final class dfrq extends ibsl implements ibtw {
    int a;
    final dfrr b;
    private Object c;

    public dfrq(dfrr dfrr0, ibrl ibrl0) {
        this.b = dfrr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfrq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfrq(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.c;
            ibvd ibvd0 = new ibvd();
            icig icig0 = iciv.c(icjj.a(new dfrp(this.b.b.d)), this.b.a);
            dfrm dfrm0 = new dfrm(ibvd0, icck0, this.b);
            this.a = 1;
            if(icig0.oR(dfrm0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

