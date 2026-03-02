final class dgnp extends ibsl implements ibtw {
    int a;
    final dgop b;
    final ichm c;

    public dgnp(dgop dgop0, ichm ichm0, ibrl ibrl0) {
        this.b = dgop0;
        this.c = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgnp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgnp(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.k(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

