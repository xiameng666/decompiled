public final class lbf implements icig {
    final icig a;

    public lbf(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        lbe lbe0 = new lbe(icih0);
        Object object0 = this.a.oR(lbe0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

