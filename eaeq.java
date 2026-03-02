public final class eaeq extends ibsl implements ibtw {
    int a;
    final lps b;
    final icig c;
    final eaeu d;

    public eaeq(lps lps0, icig icig0, ibrl ibrl0, eaeu eaeu0) {
        this.b = lps0;
        this.c = icig0;
        this.d = eaeu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eaeq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eaeq(this.b, this.c, ibrl0, this.d);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eaep eaep0 = new eaep(this.c, null, this.d);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, eaep0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

