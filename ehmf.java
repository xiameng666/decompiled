public final class ehmf extends ibsl implements ibtw {
    final ehmg a;
    final hgiq b;

    public ehmf(ehmg ehmg0, hgiq hgiq0, ibrl ibrl0) {
        this.a = ehmg0;
        this.b = hgiq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehmf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehmf(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        for(Object object1: this.a.b) {
            if(((ehlx)object1).a == this.b) {
                return object1;
            }
        }
        return null;
    }
}

