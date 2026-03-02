public final class dfse extends ibsl implements ibtw {
    int a;
    final icig b;
    final dfsg c;
    private Object d;

    public dfse(icig icig0, ibrl ibrl0, dfsg dfsg0) {
        this.b = icig0;
        this.c = dfsg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfse)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfse(this.b, ibrl0, this.c);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dfsd dfsd0 = new dfsd(((icih)this.d), this.c);
            this.a = 1;
            if(this.b.oR(dfsd0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

