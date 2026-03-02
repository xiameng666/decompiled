final class bgfo extends ibsl implements ibtx {
    int a;
    private Object b;

    public bgfo(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        Throwable throwable0 = (Throwable)object1;
        bgfo bgfo0 = new bgfo(((ibrl)object2));
        bgfo0.b = (icih)object0;
        return bgfo0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(((icih)this.b).a(Boolean.valueOf(true), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

