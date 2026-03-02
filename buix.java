public final class buix extends ibsl implements ibtw {
    Object a;
    int b;
    final buiy c;

    public buix(buiy buiy0, ibrl ibrl0) {
        this.c = buiy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buix)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buix(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            ((icnl)object2).g(object0);
            return ibom.a;
        }
        ibnx.b(object0);
        icck icck0 = lsc.a(this.c);
        buiw buiw0 = new buiw(this.c, null);
        iccs iccs0 = icbb.a(icck0, this.c.b, null, buiw0, 2);
        icnl icnl0 = this.c.e;
        this.a = icnl0;
        this.b = 1;
        Object object3 = iccs0.n(this);
        if(object3 != object1) {
            object0 = object3;
            object2 = icnl0;
            ((icnl)object2).g(object0);
            return ibom.a;
        }
        return object1;
    }
}

