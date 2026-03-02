final class ehmw extends ibsl implements ibtw {
    int a;
    final ehmx b;

    public ehmw(ehmx ehmx0, ibrl ibrl0) {
        this.b = ehmx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehmw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehmw(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ehmx ehmx0 = this.b;
            ehpa ehpa0 = ehmx0.ag;
            if(ehpa0 == null) {
                ibuq.j("viewModel");
                ehpa0 = null;
            }
            ehmv ehmv0 = new ehmv(ehmx0);
            this.a = 1;
            if(ehpa0.b.oR(ehmv0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

