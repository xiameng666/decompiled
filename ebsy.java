final class ebsy extends ibsl implements ibtw {
    int a;
    final ebtm b;

    public ebsy(ebtm ebtm0, ibrl ibrl0) {
        this.b = ebtm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebsy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebsy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            esnd esnd0 = new esnd();
            esnd0.a(9);
            evql evql0 = this.b.q.cP(esnd0.a);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(ebtm.a.j(), "Failed to warm up tap UI", throwable0);
        }
        return ibom.a;
    }
}

