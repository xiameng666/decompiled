public final class asgp implements icig {
    final icig a;

    public asgp(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        asgo asgo0 = new asgo(icih0);
        Object object0 = this.a.oR(asgo0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

