public final class dcvq extends ibsl implements ibtw {
    int a;
    final icig b;
    final ibtw c;
    final ibtx d;
    private Object e;

    public dcvq(icig icig0, ibrl ibrl0, ibtw ibtw0, ibtx ibtx0) {
        this.b = icig0;
        this.c = ibtw0;
        this.d = ibtx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcvq)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcvq(this.b, ibrl0, this.c, this.d);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcvp dcvp0 = new dcvp(((icih)this.e), this.c, this.d);
            this.a = 1;
            if(this.b.oR(dcvp0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

