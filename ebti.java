final class ebti extends ibsl implements ibtw {
    final ebtm a;
    final String b;
    private Object c;

    public ebti(ebtm ebtm0, String s, ibrl ibrl0) {
        this.a = ebtm0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebti)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ebti(this.a, this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icbb.b(((icck)this.c), this.a.j(), null, new ebth(this.a, this.b, null), 2);
        return ibom.a;
    }
}

