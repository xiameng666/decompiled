public final class ddao implements ibtw {
    public final Object a;
    public final ibtw b;
    public final float c;
    public final int d;

    public ddao(Object object0, ibtw ibtw0, float f, int v) {
        this.a = object0;
        this.b = ibtw0;
        this.c = f;
        this.d = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddbf.i(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1));
        return ibom.a;
    }
}

