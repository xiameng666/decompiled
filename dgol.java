final class dgol extends ibsl implements ibtw {
    int a;
    final dgop b;
    final int c;

    public dgol(dgop dgop0, int v, ibrl ibrl0) {
        this.b = dgop0;
        this.c = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgol)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgol(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        dgok dgok0 = new dgok(this.c, null);
        this.a = 1;
        Object object2 = icll.b(this.b.l, dgok0, this);
        return object2 == object1 ? object1 : object2;
    }
}

