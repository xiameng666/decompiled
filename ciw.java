final class ciw extends ibsl implements ibtw {
    float a;

    public ciw(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ciw)this.c(Float.valueOf(((Number)object0).floatValue()), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ciw(ibrl0);
        ibrl1.a = ((Number)object0).floatValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a > 0.0f ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

