public final class bdxn implements icig {
    final icig a;

    public bdxn(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        bdxm bdxm0 = new bdxm(icih0);
        Object object0 = this.a.oR(bdxm0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

