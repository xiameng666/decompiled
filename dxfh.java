final class dxfh extends ibsl implements ibtw {
    int a;
    final dxfi b;

    public dxfh(dxfi dxfi0, ibrl ibrl0) {
        this.b = dxfi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxfh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxfh(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dxfs dxfs0 = this.b.b;
            if(dxfs0 == null) {
                ibuq.j("pixRiskSignalsManager");
                dxfs0 = null;
            }
            this.a = 1;
            object0 = dxfs0.b(this);
            if(object0 == object1) {
                return object1;
            }
        }
        return new Integer(((Boolean)object0).booleanValue() ^ 1);
    }
}

