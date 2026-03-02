final class dcop extends ibsl implements ibtw {
    int a;
    final dcoa b;
    final icck c;
    final dcor d;

    public dcop(dcoa dcoa0, icck icck0, dcor dcor0, ibrl ibrl0) {
        this.b = dcoa0;
        this.c = icck0;
        this.d = dcor0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcop)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcop(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.a.a(this.c, this.d, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

