final class cbs extends ibsl implements ibtw {
    int a;
    final clj b;
    final gui c;
    private Object d;

    public cbs(clj clj0, gui gui0, ibrl ibrl0) {
        this.b = clj0;
        this.c = gui0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbs)this.c(((grw)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cbs(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            grw grw0 = (grw)this.d;
            icig icig0 = gud.a(new cbq(this.b));
            cbr cbr0 = new cbr(grw0, this.b, this.c);
            this.a = 1;
            if(icig0.oR(cbr0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

