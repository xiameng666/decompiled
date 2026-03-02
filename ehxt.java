final class ehxt extends ibsl implements ibtw {
    final clj a;
    final gtl b;

    public ehxt(clj clj0, gtl gtl0, ibrl ibrl0) {
        this.a = clj0;
        this.b = gtl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehxt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehxt(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Double double0 = new Double(0.0);
        ((ehwv)this.a.f()).f.f(double0);
        double f = double0.doubleValue();
        Double double1 = new Double(0.0);
        ((ehwv)this.a.g()).f.f(double1);
        double f1 = double1.doubleValue() - f;
        if((Math.abs(f1) > 3.141593)) {
            int v = this.b.e() - ((int)Math.signum(f1));
            this.b.i(v);
        }
        return ibom.a;
    }
}

