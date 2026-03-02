final class bdwl implements ibtx {
    public static final bdwl a;

    static {
        bdwl.a = new bdwl();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TextButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        gdh.b(isq.c(0x7F1526A8, ((goz)object1)), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 0, 0, 0x3FFFE);  // string:pwm_delete_all_delete_button "Delete"
        return ibom.a;
    }
}

