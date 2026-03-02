final class bdpk implements ibtx {
    public static final bdpk a;

    static {
        bdpk.a = new bdpk();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dla.j(hfc.e, 0.0f, 0.0f, 0.0f, 24.0f, 7);
        cth.a(ism.a(0x7F080ABB, ((goz)object1), 0), null, hfc0, null, null, 0.0f, null, ((goz)object1), 440, 120);  // drawable:pwm_import_successful
        return ibom.a;
    }
}

