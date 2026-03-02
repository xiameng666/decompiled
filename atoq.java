public final class atoq extends ibsl implements ibtx {
    Object a;
    final ator b;

    public atoq(ator ator0, ibrl ibrl0) {
        this.b = ator0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        atoq atoq0 = new atoq(this.b, ((ibrl)object2));
        atoq0.a = (Throwable)object1;
        return atoq0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        ((ggtj)((ggtj)ator.a.i()).s(((Throwable)object1))).x("Error in bank app foreground flow collection.");
        this.b.h.g(null);
        this.b.g = null;
        return ibom.a;
    }
}

