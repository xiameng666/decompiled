public final class rxc implements icig {
    final icig a;

    public rxc(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        rxb rxb0 = new rxb(icih0);
        Object object0 = this.a.oR(rxb0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

