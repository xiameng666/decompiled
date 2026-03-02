final class cthx extends ibsl implements ibtw {
    int a;
    final cthy b;
    final icig c;
    private Object d;

    public cthx(cthy cthy0, icig icig0, ibrl ibrl0) {
        this.b = cthy0;
        this.c = icig0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cthx)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cthx(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.d;
            cthw cthw0 = new cthw(ichm0);
            ctna ctna0 = this.b.a.b(cthw0);
            icbb.b(ichm0, null, null, new cthu(this.c, ctna0, null), 3);
            cths cths0 = new cths(ctna0);
            this.a = 1;
            if(ichl.b(ichm0, cths0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

