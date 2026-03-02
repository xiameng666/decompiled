final class degb implements ibty {
    public static final degb a;

    static {
        degb.a = new degb();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        float f = ((jkv)object1).a;
        int v = ((Number)object3).intValue();
        ibuq.f(((dlp)object0), "$this$DesktopScaffold");
        if((v & 0x30) == 0) {
            v |= (((goz)object2).U(f) ? 0x20 : 16);
        }
        if((v & 0x91) == 0x90 && ((goz)object2).ac()) {
            ((goz)object2).G();
            return ibom.a;
        }
        String s = isq.c(0x7F152CCD, ((goz)object2));  // string:sharing_ready_to_receive "Ready to receive"
        String s1 = isq.c(0x7F152DBB, ((goz)object2));  // string:sharing_visibility_chip_visible_to_everyone_temporarily "From everyone temporarily"
        ddxv.b(((goz)object2));
        deiq.a(s, cqx.c(hhi.a(dla.j(hfc.e, 0.0f, 0.0f, 16.0f, 0.0f, 11), eah.a), fpu.a(((goz)object2)).c), s1, degg.a, f, ((goz)object2), v << 9 & 0xE000 | 0xC00);
        return ibom.a;
    }
}

