public final class bget implements icig {
    final icig a;

    public bget(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        bges bges0 = new bges(icih0);
        Object object0 = this.a.oR(bges0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

