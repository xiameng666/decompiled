final class ddbe implements ibtw {
    final String a;
    final float b;

    public ddbe(String s, float f) {
        this.a = s;
        this.b = f;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        long v = ddhw.a(((goz)object0)).g;
        long v1 = ddhw.a(((goz)object0)).f;
        ddbf.e(this.a, v, v1, this.b, ((goz)object0), 0);
        return ibom.a;
    }
}

