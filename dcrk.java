final class dcrk extends ibsl implements ibtw {
    Object a;
    final dcrn b;

    public dcrk(dcrn dcrn0, ibrl ibrl0) {
        this.b = dcrn0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcrk)this.c(((dcrw)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcrk(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dcrw dcrw0 = (dcrw)this.a;
        do {
            Object object1 = this.b.g.b();
            dcrq dcrq0 = dcrq.a(((dcrq)object1), dcrw0, null, 6);
        }
        while(!this.b.g.h(object1, dcrq0));
        return ibom.a;
    }
}

