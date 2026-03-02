final class cthv extends ibsl implements ibtw {
    int a;
    final byte[] b;
    final ichm c;

    public cthv(ichm ichm0, byte[] arr_b, ibrl ibrl0) {
        this.c = ichm0;
        this.b = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cthv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cthv(this.c, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.c.a(this.b, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

