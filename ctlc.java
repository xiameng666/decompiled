final class ctlc extends ibsl implements ibtw {
    int a;
    final icig b;
    final String c;
    final ichm d;
    final alfw e;

    public ctlc(icig icig0, ichm ichm0, alfw alfw0, String s, ibrl ibrl0) {
        this.b = icig0;
        this.d = ichm0;
        this.e = alfw0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctlc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctlc(this.b, this.d, this.e, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctla ctla0 = new ctla(this.d, null);
            icjm icjm0 = new icjm(this.b, ctla0);
            ctlb ctlb0 = new ctlb(this.e, this.c);
            this.a = 1;
            if(icjm0.oR(ctlb0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

