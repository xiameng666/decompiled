public final class dcui implements icig {
    final icig a;

    public dcui(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dcuh dcuh0 = new dcuh(icih0);
        Object object0 = this.a.oR(dcuh0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

