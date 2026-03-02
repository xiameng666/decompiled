public final class dfrp implements icig {
    final icig a;

    public dfrp(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dfro dfro0 = new dfro(icih0);
        Object object0 = this.a.oR(dfro0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

