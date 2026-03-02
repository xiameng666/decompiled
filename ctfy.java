final class ctfy extends ibsl implements ibtw {
    int a;
    final ctga b;

    public ctfy(ctga ctga0, ibrl ibrl0) {
        this.b = ctga0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctfy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctfy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnj icnj0 = this.b.c.n();
            ctfx ctfx0 = new ctfx(this.b);
            this.a = 1;
            if(icnj0.oR(ctfx0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

