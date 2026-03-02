final class ddhp implements ibtx {
    final String a;
    final gra b;

    public ddhp(String s, gra gra0) {
        this.a = s;
        this.b = gra0;
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
        String s = this.a;
        ((goz)object1).M(5004770);
        gra gra0 = this.b;
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new ddho(gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fiuk.b(s, null, v1, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ibts)object3), jbn0, ((goz)object1), 0, 0x180000, 0xFFFA);
        return ibom.a;
    }
}

