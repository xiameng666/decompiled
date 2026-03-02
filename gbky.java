public final class gbky extends ibsl implements ibtw {
    int a;
    final gbkj b;
    final String c;
    final String d;
    final byte[] e;

    public gbky(gbkj gbkj0, String s, String s1, byte[] arr_b, ibrl ibrl0) {
        this.b = gbkj0;
        this.c = s;
        this.d = s1;
        this.e = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbky)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbky(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            gbko gbko0 = new gbko(this.e, this.c, this.d);
            if(oqj.d(((gbkr)this.b).a, false, true, gbko0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

