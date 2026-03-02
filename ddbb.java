final class ddbb implements ibtw {
    final String a;
    final ddbv b;
    final float c;

    public ddbb(String s, ddbv ddbv0, float f) {
        this.a = s;
        this.b = ddbv0;
        this.c = f;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ddbf.e(this.a, this.b.b, this.b.a, this.c, ((goz)object0), 0x1B0);
        return ibom.a;
    }
}

