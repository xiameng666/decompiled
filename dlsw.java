public final class dlsw extends ibsl implements ibtw {
    int a;
    final icig b;
    final dlte c;

    public dlsw(icig icig0, ibrl ibrl0, dlte dlte0) {
        this.b = icig0;
        this.c = dlte0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlsw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlsw(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dlsv dlsv0 = new dlsv(this.c);
            this.a = 1;
            if(this.b.oR(dlsv0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

