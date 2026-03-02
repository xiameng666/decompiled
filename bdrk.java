final class bdrk implements ibtx {
    final bdsf a;

    public bdrk(bdsf bdsf0) {
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
        hfc hfc0 = dla.j(hfc.e, 0.0f, 0.0f, 0.0f, 16.0f, 7);
        fiuk.b(isq.d(0x7F15268E, new Object[]{this.a.b}, ((goz)object1)), hfc0, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 0x30, 0, 0x3FFFC);  // string:pwm_credential_export_confirmation_description "Make sure you trust %1$s 
                                                                                                                                                                            // with your personal information"
        return ibom.a;
    }
}

