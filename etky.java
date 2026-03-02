public final class etky extends ibsl implements ibtw {
    int a;
    final etlf b;

    public etky(etlf etlf0, ibrl ibrl0) {
        this.b = etlf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((etky)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new etky(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.f(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

