final class dxmf extends ibsl implements ibtw {
    int a;
    final dxmi b;

    public dxmf(dxmi dxmi0, ibrl ibrl0) {
        this.b = dxmi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxmf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxmf(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.c(this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Boolean)object0).booleanValue()) {
            this.b.e();
            return ibom.a;
        }
        icck icck0 = lsc.a(this.b);
        this.b.j(icck0, new frxf[]{dxpz.a});
        return ibom.a;
    }
}

