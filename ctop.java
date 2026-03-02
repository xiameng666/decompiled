final class ctop extends ibsl implements ibtw {
    int a;
    final ctoq b;

    public ctop(ctoq ctoq0, ibrl ibrl0) {
        this.b = ctoq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctop)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctop(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctoq ctoq0 = this.b;
            if(!ibuq.m(ctoq0.a.b().b(), ctor.a)) {
                ctoo ctoo0 = new ctoo(ctoq0, null);
                this.a = 1;
                if(icfo.b(ctoq0.b, ctoo0, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

