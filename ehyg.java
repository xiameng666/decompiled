final class ehyg extends ibsl implements ibtw {
    final clj a;
    final chb b;
    private Object c;

    public ehyg(clj clj0, chb chb0, ibrl ibrl0) {
        this.a = clj0;
        this.b = chb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehyg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ehyg(this.a, this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icbb.b(((icck)this.c), null, null, new ehyf(this.a, this.b, null), 3);
        return ibom.a;
    }
}

