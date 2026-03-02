final class irv extends ibur implements ibts {
    final irw a;
    final ibtw b;

    public irv(irw irw0, ibtw ibtw0) {
        this.a = irw0;
        this.b = ibtw0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        irw irw0 = this.a;
        if(!irw0.c) {
            lpg lpg0 = ((iki)object0).a.getLifecycle();
            ibtw ibtw0 = this.b;
            irw0.e = ibtw0;
            if(irw0.d == null) {
                irw0.d = lpg0;
                lpg0.c(irw0);
                return ibom.a;
            }
            if(lpg0.a().a(lpf.c)) {
                gze gze0 = new gze(0x4F523A4F, true, new iru(irw0, ibtw0));
                irw0.b.e(gze0);
            }
        }
        return ibom.a;
    }
}

