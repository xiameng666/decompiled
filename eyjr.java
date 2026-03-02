final class eyjr extends ibsl implements ibtw {
    int a;
    final eyjw b;
    final exwv c;

    public eyjr(eyjw eyjw0, exwv exwv0, ibrl ibrl0) {
        this.b = eyjw0;
        this.c = exwv0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyjr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyjr(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.i(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

