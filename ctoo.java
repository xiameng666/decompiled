final class ctoo extends ibsl implements ibtw {
    int a;
    final ctoq b;

    public ctoo(ctoq ctoq0, ibrl ibrl0) {
        this.b = ctoq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctoo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctoo(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnj icnj0 = this.b.a.b();
            icjo icjo0 = new icjo(new ctom(this.b, null), icnj0);
            cton cton0 = new cton(null);
            this.a = 1;
            if(icll.b(icjo0, cton0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

