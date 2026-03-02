final class eyfy extends ibsl implements ibtw {
    int a;
    final eyfz b;

    public eyfy(eyfz eyfz0, ibrl ibrl0) {
        this.b = eyfz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyfy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyfy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(glya.a(this.b.a, this) == object1) {
                return object1;
            }
        }
        this.b.b.V(null);
        return ibom.a;
    }
}

