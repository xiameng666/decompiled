public final class dxhf extends ibsl implements ibtw {
    int a;
    final icig b;
    final dxhl c;

    public dxhf(icig icig0, ibrl ibrl0, dxhl dxhl0) {
        this.b = icig0;
        this.c = dxhl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxhf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxhf(this.b, ibrl0, this.c);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dxhe dxhe0 = new dxhe();
            this.a = 1;
            if(this.b.oR(dxhe0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

