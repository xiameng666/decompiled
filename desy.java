final class desy extends ibsl implements ibtw {
    final devp a;
    final gra b;

    public desy(devp devp0, gra gra0, ibrl ibrl0) {
        this.a = devp0;
        this.b = gra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((desy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new desy(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        if(this.a.c == deco.a) {
            devo.g(this.b, true);
        }
        return ibom.a;
    }
}

