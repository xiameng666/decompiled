final class gbgw extends ibsl implements ibtw {
    int a;
    final gbgx b;
    final fbbw c;

    public gbgw(gbgx gbgx0, fbbw fbbw0, ibrl ibrl0) {
        this.b = gbgx0;
        this.c = fbbw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbgw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbgw(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        gbhf gbhf0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        gbgx gbgx0 = this.b;
        fbbw fbbw0 = this.c;
        gamx gamx0 = gbgx0.d();
        fbbv fbbv0 = fbbv.b(fbbw0.f) == null ? fbbv.a : fbbv.b(fbbw0.f);
        ibuq.e(fbbv0, "getRequestContextType(...)");
        boolean z = fbbw0.i;
        boolean z1 = fbbw0.h;
        ibuq.f(fbbv0, "requestContextType");
        switch(fbbv0.ordinal()) {
            case 0: {
                throw new UnsupportedOperationException("No Suitable RequestContextSetter.");
            }
            case 1: {
                gbhf0 = new gbhf(z, z1);
                break;
            }
            case 2: {
                gbhf0 = new gbhg(z, z1);
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        this.a = 1;
        Object object2 = gbgx0.g(gamx0, fbbw0, gbhf0, this);
        return object2 == object1 ? object1 : object2;
    }
}

