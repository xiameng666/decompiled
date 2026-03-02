final class gbhi extends ibsl implements ibtw {
    int a;
    final gbhk b;

    public gbhi(gbhk gbhk0, ibrl ibrl0) {
        this.b = gbhk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbhi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbhi(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        evql evql0 = this.b.a.g();
        this.a = 1;
        Object object2 = ictn.b(evql0, this);
        return object2 == object1 ? object1 : object2;
    }
}

