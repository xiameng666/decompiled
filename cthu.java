final class cthu extends ibsl implements ibtw {
    int a;
    final icig b;
    final ctna c;

    public cthu(icig icig0, ctna ctna0, ibrl ibrl0) {
        this.b = icig0;
        this.c = ctna0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cthu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cthu(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctht ctht0 = new ctht(this.c);
            this.a = 1;
            if(this.b.oR(ctht0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

