final class eyvs extends ibsl implements ibtw {
    int a;
    final eyvx b;

    public eyvs(eyvx eyvx0, ibrl ibrl0) {
        this.b = eyvx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyvs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyvs(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.a.k(this) == object1) {
                return object1;
            }
        }
        return Boolean.valueOf(false);
    }
}

