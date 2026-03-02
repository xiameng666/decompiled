public final class rwo implements icig {
    final icig a;
    final rxl b;

    public rwo(icig icig0, rxl rxl0) {
        this.a = icig0;
        this.b = rxl0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        rwn rwn0 = new rwn(icih0, this.b);
        Object object0 = this.a.oR(rwn0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

