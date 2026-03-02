final class dfrj extends ibsl implements ibtx {
    int a;
    Object b;
    final dfrr c;
    final int d;

    public dfrj(dfrr dfrr0, int v, ibrl ibrl0) {
        this.c = dfrr0;
        this.d = v;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        dfrj dfrj0 = new dfrj(this.c, this.d, ((ibrl)object2));
        dfrj0.b = (Throwable)object1;
        return dfrj0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.b;
            dfrr dfrr0 = this.c;
            dcii dcii0 = dfrr0.d;
            dcii0.b.e("nearby_sharing", 6);
            if(object2 == null) {
                dcii0.j(this.d);
                evql evql0 = dfrr0.c.D(this.d);
                this.a = 1;
                if(dcwp.a(evql0, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

