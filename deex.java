final class deex implements ibtx {
    public static final deex a;

    static {
        deex.a = new deex();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TextButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hpw hpw0 = ism.a(0x7F08053B, ((goz)object1), 0);  // drawable:gs_delete_vd_theme_24
        ddxv.b(((goz)object1));
        fiso.a(hpw0, null, dla.j(hfc.e, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0L, ((goz)object1), 56, 8);
        fiuk.b(isq.c(0x7F152BC3, ((goz)object1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 0, 0, 0x3FFFE);  // string:sharing_clear_attachments "Clear files"
        return ibom.a;
    }
}

