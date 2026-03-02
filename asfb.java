public final class asfb implements icig {
    final icig a;
    final asff b;

    public asfb(icig icig0, asff asff0) {
        this.a = icig0;
        this.b = asff0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        asfa asfa0 = new asfa(icih0, this.b);
        Object object0 = this.a.oR(asfa0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

