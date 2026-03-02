public final class rww implements icig {
    final icig a;

    public rww(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        rwv rwv0 = new rwv(icih0);
        Object object0 = this.a.oR(rwv0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

