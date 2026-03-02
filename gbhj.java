final class gbhj extends ibsl implements ibtw {
    int a;
    final gbhk b;

    public gbhj(gbhk gbhk0, ibrl ibrl0) {
        this.b = gbhk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbhj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbhj(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        gaxl.a();
        long v1 = hzks.b();
        gbhi gbhi0 = new gbhi(this.b, null);
        this.a = 1;
        Object object2 = icfo.a(v1, gbhi0, this);
        return object2 == object1 ? object1 : object2;
    }
}

