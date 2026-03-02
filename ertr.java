public final class ertr implements icig {
    final icig a;
    final String b;

    public ertr(icig icig0, String s) {
        this.a = icig0;
        this.b = s;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        ertq ertq0 = new ertq(icih0, this.b);
        Object object0 = icmt.h(((icmt)this.a), ertq0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

