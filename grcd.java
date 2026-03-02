public final class grcd extends ibsl implements ibtw {
    int a;
    final grce b;
    final String c;
    final grdf d;
    final grck e;
    final ibts f;

    public grcd(grce grce0, String s, grdf grdf0, grck grck0, ibts ibts0, ibrl ibrl0) {
        this.b = grce0;
        this.c = s;
        this.d = grdf0;
        this.e = grck0;
        this.f = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((grcd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new grcd(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        grcc grcc0 = new grcc(this.f, null);
        this.a = 1;
        Object object2 = this.b.a(this.c, this.d, this.e, grcc0, this);
        return object2 == object1 ? object1 : object2;
    }
}

