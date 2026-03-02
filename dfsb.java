public final class dfsb implements icig {
    final icig a;

    public dfsb(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dfsa dfsa0 = new dfsa(icih0);
        Object object0 = this.a.oR(dfsa0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

