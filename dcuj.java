final class dcuj extends ibsl implements ibtw {
    int a;
    final dcus b;

    public dcuj(dcus dcus0, ibrl ibrl0) {
        this.b = dcus0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcuj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcuj(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = icjj.a(new dcui(this.b.g));
            dcuf dcuf0 = new dcuf(this.b, null);
            this.a = 1;
            if(icir.b(icig0, dcuf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

