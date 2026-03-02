final class ctuj extends ibsl implements ibtw {
    int a;
    final String b;
    final byte[] c;
    final ichm d;

    public ctuj(ichm ichm0, String s, byte[] arr_b, ibrl ibrl0) {
        this.d = ichm0;
        this.b = s;
        this.c = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctuj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctuj(this.d, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctuz ctuz0 = new ctuz(this.b, this.c);
            this.a = 1;
            if(this.d.a(ctuz0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

