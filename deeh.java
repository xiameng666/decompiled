final class deeh extends ibsl implements ibtw {
    final ddag a;
    private Object b;

    public deeh(ddag ddag0, ibrl ibrl0) {
        this.a = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deeh)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new deeh(this.a, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ichm ichm0 = (ichm)this.b;
        icbb.b(ichm0, null, null, new dedu(this.a, ichm0, null), 3);
        icbb.b(ichm0, null, null, new dedw(this.a, ichm0, null), 3);
        icbb.b(ichm0, null, null, new dedy(this.a, ichm0, null), 3);
        icbb.b(ichm0, null, null, new deea(this.a, ichm0, null), 3);
        icbb.b(ichm0, null, null, new deec(this.a, ichm0, null), 3);
        icbb.b(ichm0, null, null, new deee(this.a, ichm0, null), 3);
        icbb.b(ichm0, null, null, new deeg(this.a, ichm0, null), 3);
        return ibom.a;
    }
}

