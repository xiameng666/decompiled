final class dxqe extends ibsl implements ibtw {
    int a;
    final dxqi b;

    public dxqe(dxqi dxqi0, ibrl ibrl0) {
        this.b = dxqi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxqe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxqe(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dyna dyna0 = dzdt.f(this.b.e.c);
            ibuq.e(dyna0, "getSeServiceProviderFromBillableService(...)");
            this.a = 1;
            object0 = this.b.f.a(dyna0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        this.b.l(((ftix)object0));
        return ibom.a;
    }
}

