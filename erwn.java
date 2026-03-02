final class erwn extends ibsl implements ibtw {
    int a;
    final erwq b;
    final String c;
    final Boolean d;

    public erwn(erwq erwq0, String s, Boolean boolean0, ibrl ibrl0) {
        this.b = erwq0;
        this.c = s;
        this.d = boolean0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((erwn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new erwn(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            ertn ertn0 = new ertn(this.c, this.d);
            Object object2 = this.b.a.a.c.a(ertn0, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

