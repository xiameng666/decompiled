final class cthr extends ibsl implements ibtw {
    int a;
    final cthy b;
    private Object c;

    public cthr(cthy cthy0, ibrl ibrl0) {
        this.b = cthy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cthr)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cthr(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            ctmq ctmq0 = new ctmq(ichm0);
            this.b.a.d(ctmq0);
            cthq cthq0 = new cthq(this.b, ctmq0);
            this.a = 1;
            if(ichl.b(ichm0, cthq0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

