public final class asfe extends ibsl implements ibtw {
    int a;
    final icig b;
    private Object c;

    public asfe(icig icig0, ibrl ibrl0) {
        this.b = icig0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asfe)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new asfe(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            asfd asfd0 = new asfd(((icih)this.c));
            this.a = 1;
            if(this.b.oR(asfd0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

