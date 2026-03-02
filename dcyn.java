public final class dcyn implements icig {
    final icig a;
    final dcyu b;

    public dcyn(icig icig0, dcyu dcyu0) {
        this.a = icig0;
        this.b = dcyu0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dcym dcym0 = new dcym(icih0, this.b);
        Object object0 = this.a.oR(dcym0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

