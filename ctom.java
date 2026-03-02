final class ctom extends ibsl implements ibtw {
    final ctoq a;

    public ctom(ctoq ctoq0, ibrl ibrl0) {
        this.a = ctoq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctom)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctom(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ctox ctox0 = this.a.a;
        if(!ibuq.m(ctox0.b().b(), ctos.a)) {
            ctox0.c();
        }
        return ibom.a;
    }
}

