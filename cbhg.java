final class cbhg extends ibsl implements ibtw {
    final cbhk a;
    private Object b;

    public cbhg(cbhk cbhk0, ibrl ibrl0) {
        this.a = cbhk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbhg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cbhg(this.a, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icck icck0 = (icck)this.b;
        icbb.b(icck0, null, null, new cbhc(this.a, null), 3);
        icbb.b(icck0, null, null, new cbhf(this.a, null), 3);
        return ibom.a;
    }
}

