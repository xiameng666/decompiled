final class dgoc extends ibsl implements ibtw {
    Object a;
    final dgop b;
    final ichm c;

    public dgoc(dgop dgop0, ichm ichm0, ibrl ibrl0) {
        this.b = dgop0;
        this.c = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgoc)this.c(((dggz)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgoc(this.b, this.c, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.b.o(this.c, ((dggz)this.a));
        return ibom.a;
    }
}

