final class ctvp extends ibsl implements ibtw {
    int a;
    final ctvs b;
    private Object c;

    public ctvp(ctvs ctvs0, ibrl ibrl0) {
        this.b = ctvs0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctvp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctvp(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.c;
            ctvs ctvs0 = this.b;
            ctpd ctpd0 = ctvs0.a;
            if(ctpd0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            icig icig0 = ctpd0.b();
            ctvo ctvo0 = new ctvo(ctvs0, icck0);
            this.a = 1;
            if(icig0.oR(ctvo0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

