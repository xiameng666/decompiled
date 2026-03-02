final class epmg extends ibsl implements ibtw {
    int a;
    final epmi b;

    public epmg(epmi epmi0, ibrl ibrl0) {
        this.b = epmi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epmg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epmg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            iclv iclv0 = new iclv(epom.a.g(), new epmf(this.b, null));
            this.a = 1;
            if(icir.a(iclv0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

