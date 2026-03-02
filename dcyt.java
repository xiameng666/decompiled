public final class dcyt extends ibsl implements ibtw {
    int a;
    final icig b;
    private Object c;

    public dcyt(icig icig0, ibrl ibrl0) {
        this.b = icig0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcyt)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcyt(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcys dcys0 = new dcys(((icih)this.c));
            this.a = 1;
            if(icoa.h(((icoa)this.b), dcys0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

