final class deur extends ibsl implements ibtw {
    int a;
    final gei b;

    public deur(gei gei0, ibrl ibrl0) {
        this.b = gei0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deur)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deur(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(gee.a(this.b, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

