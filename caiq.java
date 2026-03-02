final class caiq extends ibsl implements ibtw {
    int a;
    long b;
    final caiy c;

    public caiq(caiy caiy0, ibrl ibrl0) {
        this.c = caiy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((caiq)this.c(Long.valueOf(((Number)object0).longValue()), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new caiq(this.c, ibrl0);
        ibrl1.b = ((Number)object0).longValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.c.c(this.b, this);
        return object2 == object1 ? object1 : object2;
    }
}

