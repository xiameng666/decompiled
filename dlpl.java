public final class dlpl extends ibsl implements ibtw {
    int a;
    final icig b;
    final dlps c;

    public dlpl(icig icig0, ibrl ibrl0, dlps dlps0) {
        this.b = icig0;
        this.c = dlps0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlpl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlpl(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dlpk dlpk0 = new dlpk(this.c);
            this.a = 1;
            if(this.b.oR(dlpk0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

