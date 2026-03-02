final class dgee extends ibsl implements ibtw {
    Object a;
    final dgeg b;

    public dgee(dgeg dgeg0, ibrl ibrl0) {
        this.b = dgeg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgee)this.c(((dgqm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgee(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dgqm dgqm0 = (dgqm)this.a;
        synchronized(this.b) {
            this.b.f(dgqm0, this.b.b);
        }
        return ibom.a;
    }
}

