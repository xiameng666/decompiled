final class dfno extends ibsl implements ibtw {
    int a;
    final ddag b;
    final ichm c;

    public dfno(ddag ddag0, ichm ichm0, ibrl ibrl0) {
        this.b = ddag0;
        this.c = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfno)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dfno(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dfnm dfnm0 = new dfnm(null);
            icmj icmj0 = new icmj(this.b.g, this.b.d, dfnm0);
            dfnn dfnn0 = new dfnn(this.c);
            this.a = 1;
            if(icmj0.oR(dfnn0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

