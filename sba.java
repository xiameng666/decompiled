public final class sba implements icig {
    final icig a;

    public sba(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        saz saz0 = new saz(icih0);
        Object object0 = this.a.oR(saz0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

