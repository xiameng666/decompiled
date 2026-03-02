final class aslw extends ibsl implements ibtx {
    int a;
    Object b;
    private Object c;

    public aslw(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        aslw aslw0 = new aslw(((ibrl)object2));
        aslw0.c = (icih)object0;
        aslw0.b = (Throwable)object1;
        return aslw0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.c;
            Object object3 = this.b;
            a.ae(asmc.a.i(), "Failed to fetch if backups allowed over metered network.", ((Throwable)object3));
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

