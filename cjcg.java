public final class cjcg extends ibsl implements ibtw {
    int a;
    final icig b;
    final ibtw c;
    private Object d;

    public cjcg(icig icig0, ibtw ibtw0, ibrl ibrl0) {
        this.b = icig0;
        this.c = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjcg)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cjcg(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icih icih0 = (icih)this.d;
            cjcf cjcf0 = new cjcf(new ibvd(), icih0);
            this.a = 1;
            if(this.b.oR(cjcf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

