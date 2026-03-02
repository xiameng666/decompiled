final class eyri extends ibsl implements ibtw {
    int a;
    final eysa b;

    public eyri(eysa eysa0, ibrl ibrl0) {
        this.b = eysa0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyri)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyri(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b.c.p();
            eyrh eyrh0 = new eyrh(this.b);
            this.a = 1;
            if(icig0.oR(eyrh0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

