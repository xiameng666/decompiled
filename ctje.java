public final class ctje extends ibsl implements ibtx {
    int a;
    Object b;
    private Object c;

    public ctje(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ctje ctje0 = new ctje(((ibrl)object2));
        ctje0.c = (icih)object0;
        ctje0.b = object1;
        return ctje0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.c;
            icig icig0 = ((ctho)this.b).e();
            this.a = 1;
            if(icir.c(((icih)object2), icig0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

