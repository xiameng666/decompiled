final class ctpi implements ibtx {
    public static final ctpi a;

    static {
        ctpi.a = new ctpi();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$Button");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        gdh.b("Close Stream Pings", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 6, 0, 0x3FFFE);
        return ibom.a;
    }
}

