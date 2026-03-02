public final class rwl implements icig {
    final icig a;

    public rwl(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        rwk rwk0 = new rwk(icih0);
        Object object0 = this.a.oR(rwk0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

