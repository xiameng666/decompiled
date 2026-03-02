final class bgdd implements ibtx {
    final ibth a;

    public bgdd(ibth ibth0) {
        this.a = ibth0;
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
        bgdq.b(null, new bgay(bgat.d), isq.c(0x7F15266B, ((goz)object1)), null, false, fpu.a(((goz)object1)).f, false, false, this.a, "BatchUploadButton", ((goz)object1), 0x30000000, 0xD9);  // string:pwm_batch_upload_start_button "Save passwords in your account"
        return ibom.a;
    }
}

