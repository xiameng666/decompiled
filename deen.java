import android.text.Html;

final class deen implements ibtx {
    public static final deen a;

    static {
        deen.a = new deen();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$UnorderedContentItem");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        fiuk.a(dekm.a(Html.fromHtml(isq.c(0x7F152C36, ((goz)object1)), 0, null, null)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, null, null, null, ((goz)object1), 0, 0, 0x3FFFE);  // string:sharing_main_help_dialog_find_device_content_1 "<b>On Android devices:</b> 
                                                                                                                                                                                          // Find it fast in Quick Settings by swiping down from the top of the screen. You can 
                                                                                                                                                                                          // also search for Quick Share in Settings."
        return ibom.a;
    }
}

