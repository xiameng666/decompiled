import java.text.NumberFormat;

final class dejp implements ibtx {
    final NumberFormat a;

    public dejp(NumberFormat numberFormat0) {
        this.a = numberFormat0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$ContentItem");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        fiuk.b(isq.d(0x7F152C41, new Object[]{this.a.format(3L), this.a.format(1L)}, ((goz)object1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 0, 0, 0x3FFFE);  // string:sharing_main_troubleshooting_dialog_content_3 "Bring the device within %1$s 
                                                                                                                                                                                                     // feet (%2$s meter) of this device"
        return ibom.a;
    }
}

