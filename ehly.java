public final class ehly extends ibsl implements ibtw {
    int a;
    final ehmc b;
    final hgiq c;

    public ehly(ehmc ehmc0, hgiq hgiq0, ibrl ibrl0) {
        this.b = ehmc0;
        this.c = hgiq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehly)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehly(this.b, this.c, ibrl0);
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

