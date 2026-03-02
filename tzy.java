public final class tzy extends ibsl implements ibtw {
    int a;
    final uac b;
    final txx c;
    final tyb d;
    private Object e;

    public tzy(uac uac0, txx txx0, tyb tyb0, ibrl ibrl0) {
        this.b = uac0;
        this.c = txx0;
        this.d = tyb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((tzy)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new tzy(this.b, this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.e;
            tzw tzw0 = new tzw(ichm0, this.b);
            ibuq.f(this.c, "<this>");
            txm txm0 = new txm();
            this.c.n(tzw0, tzw0, this.c, txm0);
            tzx tzx0 = new tzx(this.d, tzw0);
            this.a = 1;
            if(ichl.b(ichm0, tzx0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

