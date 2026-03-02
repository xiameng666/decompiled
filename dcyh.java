public final class dcyh implements icig {
    final icig a;
    final dcyu b;

    public dcyh(icig icig0, dcyu dcyu0) {
        this.a = icig0;
        this.b = dcyu0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dcyg dcyg0 = new dcyg(icih0, this.b);
        Object object0 = this.a.oR(dcyg0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

