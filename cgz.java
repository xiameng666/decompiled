final class cgz extends ibsl implements ibts {
    final chb a;
    final Object b;

    public cgz(chb chb0, Object object0, ibrl ibrl0) {
        this.a = chb0;
        this.b = object0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new cgz(this.a, this.b, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.g();
        Object object1 = this.a.b(this.b);
        this.a.a.c(object1);
        this.a.i(object1);
        return ibom.a;
    }
}

