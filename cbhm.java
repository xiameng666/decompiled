final class cbhm extends ibsl implements ibtw {
    Object a;
    int b;
    final cbij c;

    public cbhm(cbij cbij0, ibrl ibrl0) {
        this.c = cbij0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbhm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbhm(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_12;
        }
        ibnx.b(object0);
        icnl icnl0 = this.c.i;
        this.a = icnl0;
        this.b = 1;
        object0 = this.c.e(this.c.c, this);
        if(object0 != object1) {
            object2 = icnl0;
        label_12:
            cbhx cbhx0 = ((Boolean)object0).booleanValue() ? cbhx.a : cbhr.a;
            ((icnl)object2).g(cbhx0);
            return ibom.a;
        }
        return object1;
    }
}

