public final class csyl implements icig {
    final icig a;
    final csym b;

    public csyl(icig icig0, csym csym0) {
        this.a = icig0;
        this.b = csym0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        csyk csyk0 = new csyk(icih0, this.b);
        Object object0 = this.a.oR(csyk0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

