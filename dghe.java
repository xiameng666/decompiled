final class dghe extends ibsl implements ibtw {
    int a;
    final icnl b;

    public dghe(icnl icnl0, ibrl ibrl0) {
        this.b = icnl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dghe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dghe(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        dghd dghd0 = new dghd(null);
        this.a = 1;
        Object object2 = icll.b(this.b, dghd0, this);
        return object2 == object1 ? object1 : object2;
    }
}

