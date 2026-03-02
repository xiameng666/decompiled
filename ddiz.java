final class ddiz implements ibtx {
    final String a;

    public ddiz(String s) {
        this.a = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$Button");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dla.d(hfc.e, 8.0f);
        jbn jbn0 = fpu.d(((goz)object1)).m;
        fiuk.b(this.a, hfc0, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0x30, 0, 0x1FFFC);
        return ibom.a;
    }
}

