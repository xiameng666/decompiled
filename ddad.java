public final class ddad implements icig {
    final icig a;
    final ddag b;

    public ddad(icig icig0, ddag ddag0) {
        this.a = icig0;
        this.b = ddag0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        ddac ddac0 = new ddac(icih0, this.b);
        Object object0 = this.a.oR(ddac0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

