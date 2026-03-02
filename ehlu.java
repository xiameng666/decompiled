final class ehlu extends ibsl implements ibtw {
    int a;
    final ehlw b;
    final hgiq c;

    public ehlu(ehlw ehlw0, hgiq hgiq0, ibrl ibrl0) {
        this.b = ehlw0;
        this.c = hgiq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehlu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehlu(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.a(this.c, this);
        return object2 == object1 ? object1 : object2;
    }
}

