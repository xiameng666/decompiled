public final class bgeq implements icig {
    final icig a;

    public bgeq(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        bgep bgep0 = new bgep(icih0);
        Object object0 = this.a.oR(bgep0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

