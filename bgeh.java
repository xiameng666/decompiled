public final class bgeh implements icig {
    final icig a;
    final bgeu b;

    public bgeh(icig icig0, bgeu bgeu0) {
        this.a = icig0;
        this.b = bgeu0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        bgeg bgeg0 = new bgeg(icih0, this.b);
        Object object0 = this.a.oR(bgeg0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

