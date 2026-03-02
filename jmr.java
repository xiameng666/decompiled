final class jmr extends ibsl implements ibtw {
    int a;
    final jmw b;
    final long c;

    public jmr(jmw jmw0, long v, ibrl ibrl0) {
        this.b = jmw0;
        this.c = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((jmr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new jmr(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.b.e(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

