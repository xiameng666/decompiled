public final class ctsb extends ibsl implements ibtw {
    int a;
    final ctsg b;
    final ctoq c;

    public ctsb(ctsg ctsg0, ctoq ctoq0, ibrl ibrl0) {
        this.b = ctsg0;
        this.c = ctoq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctsb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctsb(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctoy ctoy0 = new ctoy(this.c);
            this.a = 1;
            if(this.b.c.a(ctoy0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

