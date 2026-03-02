final class dgnu extends ibsl implements ibtw {
    int a;
    final dgop b;

    public dgnu(dgop dgop0, ibrl ibrl0) {
        this.b = dgop0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgnu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgnu(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        dgnt dgnt0 = new dgnt(null);
        this.a = 1;
        Object object2 = icll.b(this.b.k, dgnt0, this);
        return object2 == object1 ? object1 : object2;
    }
}

