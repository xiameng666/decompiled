final class ddhj implements ibtx {
    final String a;

    public ddhj(String s) {
        this.a = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TextButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        jbn jbn0 = fpu.d(((goz)object1)).m;
        long v1 = fpu.a(((goz)object1)).e;
        fiuk.b(this.a, null, v1, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFFA);
        return ibom.a;
    }
}

