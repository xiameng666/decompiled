public final class dgco implements icig {
    final icig a;

    public dgco(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dgcn dgcn0 = new dgcn(icih0);
        Object object0 = this.a.oR(dgcn0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

