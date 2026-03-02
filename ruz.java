final class ruz extends ibsl implements ibtw {
    int a;
    final rve b;

    public ruz(rve rve0, ibrl ibrl0) {
        this.b = rve0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ruz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ruz(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Throwable throwable0;
        Object object1 = ibrx.a;
        ibnx.b(object0);
        while(true) {
            throwable0 = (Throwable)this.b.e.get();
            if(throwable0 != null) {
                break;
            }
            long v = ibzy.h(1, ibzz.d);
            this.a = 1;
            if(iccv.d(v, this) == object1) {
                return object1;
            }
        }
        throw throwable0;
    }
}

