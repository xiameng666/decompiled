public final class aseq implements icig {
    final icig a;
    final aser b;

    public aseq(icig icig0, aser aser0) {
        this.a = icig0;
        this.b = aser0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        asep asep0 = new asep(icih0);
        Object object0 = this.a.oR(asep0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

