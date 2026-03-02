public final class ctxr implements icig {
    final icig a;

    public ctxr(icig icig0) {
        this.a = icig0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        ctxq ctxq0 = new ctxq(icih0);
        Object object0 = this.a.oR(ctxq0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

