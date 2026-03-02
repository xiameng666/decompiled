final class aslr extends ibsl implements ibtx {
    int a;
    Object b;
    private Object c;

    public aslr(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        aslr aslr0 = new aslr(((ibrl)object2));
        aslr0.c = (icih)object0;
        aslr0.b = (Throwable)object1;
        return aslr0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.c;
            Object object3 = this.b;
            a.ae(aslt.a.i(), "Failed to fetch backup stats.", ((Throwable)object3));
            aqqd aqqd0 = new aqqd(((Throwable)object3));
            this.c = null;
            this.a = 1;
            if(((icih)object2).a(aqqd0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

