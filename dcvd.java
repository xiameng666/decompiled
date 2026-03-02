final class dcvd extends ibsl implements ibtw {
    int a;
    final xnb b;
    final ibnn c;

    public dcvd(xnb xnb0, ibnn ibnn0, ibrl ibrl0) {
        this.b = xnb0;
        this.c = ibnn0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcvd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcvd(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            iccs iccs0 = ((dcvu)this.c.a()).a;
            this.a = 1;
            object0 = iccs0.n(this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Boolean)object0).booleanValue()) {
            dcvz.a.e().p("FRP on, finish Quick Share activity.", new Object[0]);
            this.b.finish();
        }
        return ibom.a;
    }
}

