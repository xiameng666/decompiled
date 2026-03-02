final class cqf extends ibsl implements ibtw {
    int a;
    final dgj b;
    final dgg c;

    public cqf(dgj dgj0, dgg dgg0, ibrl ibrl0) {
        this.b = dgj0;
        this.c = dgg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cqf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dgi dgi0 = new dgi(this.b);
            this.a = 1;
            if(this.c.b(dgi0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

