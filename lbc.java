final class lbc extends ibsl implements ibtx {
    int a;
    final lcc b;

    public lbc(lcc lcc0, ibrl ibrl0) {
        this.b = lcc0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new lbc(this.b, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.d(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

