public final class bvil implements icig {
    final icig a;
    final bvkk b;
    final String c;

    public bvil(icig icig0, bvkk bvkk0, String s) {
        this.a = icig0;
        this.b = bvkk0;
        this.c = s;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        bvik bvik0 = new bvik(icih0, this.b, this.c);
        Object object0 = icod.g(((icod)this.a), bvik0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

