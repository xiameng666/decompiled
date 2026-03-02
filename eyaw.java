public final class eyaw extends ibsl implements ibtw {
    int a;
    final eyaz b;

    public eyaw(eyaz eyaz0, ibrl ibrl0) {
        this.b = eyaz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyaw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyaw(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = iciv.a(this.b.c.p());
            eyav eyav0 = new eyav(this.b);
            this.a = 1;
            if(icig0.oR(eyav0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

