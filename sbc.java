final class sbc extends ibsl implements ibtw {
    Object a;
    int b;
    final rzz c;
    final ichm d;

    public sbc(ichm ichm0, rzz rzz0, ibrl ibrl0) {
        this.d = ichm0;
        this.c = rzz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((sbc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new sbc(this.d, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            ((icgw)object2).e(((Throwable)object0));
            return ibom.a;
        }
        ibnx.b(object0);
        ichm ichm0 = this.d;
        this.a = ichm0;
        this.b = 1;
        Object object3 = sbh.a.d(this.c, this);
        if(object3 != object1) {
            object0 = object3;
            object2 = ichm0;
            ((icgw)object2).e(((Throwable)object0));
            return ibom.a;
        }
        return object1;
    }
}

