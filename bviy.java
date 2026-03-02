public final class bviy implements icig {
    final icig a;
    final bvkk b;
    final String c;

    public bviy(icig icig0, bvkk bvkk0, String s) {
        this.a = icig0;
        this.b = bvkk0;
        this.c = s;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        bvix bvix0 = new bvix(icih0, this.b, this.c);
        Object object0 = this.a.oR(bvix0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

