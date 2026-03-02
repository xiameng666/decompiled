public final class rsh implements icig {
    final icig a;
    final String b;

    public rsh(icig icig0, String s) {
        this.a = icig0;
        this.b = s;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        rsg rsg0 = new rsg(icih0, this.b);
        Object object0 = this.a.oR(rsg0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

