final class bgdc implements ibtx {
    final ibth a;

    public bgdc(ibth ibth0) {
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
        bgdq.b(dla.j(hfc.e, 0.0f, 14.0f, 0.0f, 0.0f, 13), new bgay(bgat.c), isq.c(0x7F152669, ((goz)object1)), null, false, fpu.a(((goz)object1)).f, true, false, this.a, "AddPasswordsButton", ((goz)object1), 0x30180006, 0x98);  // string:pwm_add_password "Add password"
        return ibom.a;
    }
}

