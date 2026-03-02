final class ehzs extends ibsl implements ibtw {
    final icck a;
    final boolean b;
    final chb c;
    final boolean d;

    public ehzs(icck icck0, boolean z, chb chb0, boolean z1, ibrl ibrl0) {
        this.a = icck0;
        this.b = z;
        this.c = chb0;
        this.d = z1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehzs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehzs(this.a, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ehzr ehzr0 = new ehzr(this.b, this.c, this.d, null);
        icbb.b(this.a, null, null, ehzr0, 3);
        return ibom.a;
    }
}

