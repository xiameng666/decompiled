public final class aseg implements icig {
    final icig a;
    final aseh b;

    public aseg(icig icig0, aseh aseh0) {
        this.a = icig0;
        this.b = aseh0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        asef asef0 = new asef(icih0);
        Object object0 = this.a.oR(asef0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

