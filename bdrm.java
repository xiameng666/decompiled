final class bdrm implements ibtx {
    final bdsf a;

    public bdrm(bdsf bdsf0) {
        this.a = bdsf0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        bdsa.i(bdtv.b(hfc.e, false, 3), 0.0f, gzf.e(0x44883167, new bdrl(this.a), ((goz)object1)), ((goz)object1), 0xC00, 6);
        return ibom.a;
    }
}

