final class eiaj extends ibsl implements ibtw {
    int a;
    final ibth b;

    public eiaj(ibth ibth0, ibrl ibrl0) {
        this.b = ibth0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eiaj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eiaj(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            long v1 = ibzw.m(ehxo.a, 2);
            this.a = 1;
            if(iccv.d(v1, this) == object1) {
                return object1;
            }
        }
        this.b.a();
        return ibom.a;
    }
}

