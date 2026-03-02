final class ctof extends ibsl implements ibtw {
    int a;
    final ctoq b;
    private Object c;

    public ctof(ctoq ctoq0, ibrl ibrl0) {
        this.b = ctoq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctof)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctof(this.b, ibrl0);
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
            icnj icnj0 = this.b.a.b();
            ctoe ctoe0 = new ctoe(icck0, this.b);
            this.a = 1;
            if(icnj0.oR(ctoe0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

