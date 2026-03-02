public final class rya extends ibsl implements ibtx {
    int a;
    Object b;
    private Object c;

    public rya(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        rya rya0 = new rya(((ibrl)object2));
        rya0.c = (icih)object0;
        rya0.b = (rxv)object1;
        return rya0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            Object object2 = (rxv)this.c;
            ibnx.b(object0);
            return Boolean.valueOf(((boolean)(object2 instanceof rxp ^ 1)));
        }
        ibnx.b(object0);
        icih icih0 = (icih)this.c;
        Object object3 = this.b;
        this.c = object3;
        this.a = 1;
        return icih0.a(object3, this) != object1 ? Boolean.valueOf(((boolean)(object3 instanceof rxp ^ 1))) : object1;
    }
}

