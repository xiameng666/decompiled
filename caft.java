final class caft implements ibtx {
    public static final caft a;

    static {
        caft.a = new caft();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$RegularSettingsScreen");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(0xF2208A60);
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new cagy();
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        ((goz)object1).A();
        clqa.a(((cagy)object3), ((goz)object1), 0);
        return ibom.a;
    }
}

