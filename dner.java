public final class dner extends ibsl implements ibtw {
    int a;
    final lps b;
    final icig c;
    final dnfc d;

    public dner(lps lps0, icig icig0, ibrl ibrl0, dnfc dnfc0) {
        this.b = lps0;
        this.c = icig0;
        this.d = dnfc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dner)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dner(this.b, this.c, ibrl0, this.d);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dneq dneq0 = new dneq(this.c, null, this.d);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, dneq0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

