public final class benz implements icig {
    final icig a;

    public benz(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        beny beny0 = new beny(icih0);
        Object object0 = this.a.oR(beny0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

