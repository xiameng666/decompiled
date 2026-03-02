final class eazc extends ibsl implements ibtw {
    int a;
    final eazd b;

    public eazc(eazd eazd0, ibrl ibrl0) {
        this.b = eazd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eazc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eazc(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        eazb eazb0 = new eazb(this.b, null);
        this.a = 1;
        Object object2 = icfo.c(1000L, eazb0, this);
        return object2 == object1 ? object1 : object2;
    }
}

