public final class bvzb implements icig {
    final icig a;
    final hgmn b;

    public bvzb(icig icig0, hgmn hgmn0) {
        this.a = icig0;
        this.b = hgmn0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        bvza bvza0 = new bvza(icih0, this.b);
        Object object0 = this.a.oR(bvza0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

