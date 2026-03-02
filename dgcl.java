public final class dgcl implements icig {
    final icig a;

    public dgcl(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dgck dgck0 = new dgck(icih0);
        Object object0 = this.a.oR(dgck0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

