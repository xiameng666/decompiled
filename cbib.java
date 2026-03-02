final class cbib extends ibsl implements ibtw {
    final cbij a;
    final int b;

    public cbib(cbij cbij0, int v, ibrl ibrl0) {
        this.a = cbij0;
        this.b = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbib)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbib(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        cbhu cbhu0 = new cbhu(this.b);
        this.a.i.g(cbhu0);
        return ibom.a;
    }
}

