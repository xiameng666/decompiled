final class dgjx extends ibsl implements ibtw {
    int a;
    final dgkd b;
    private Object c;

    public dgjx(dgkd dgkd0, ibrl ibrl0) {
        this.b = dgkd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgjx)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgjx(this.b, ibrl0);
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
            dgjw dgjw0 = new dgjw(this.b, ichm0, null);
            icir.d(new iclv(this.b.d.c, dgjw0), ichm0);
            synchronized(this.b) {
                this.b.e = ichm0;
            }
            dgjv dgjv0 = new dgjv();
            this.a = 1;
            if(ichl.b(ichm0, dgjv0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

