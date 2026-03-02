import android.text.Html;
import android.text.Spanned;
import android.text.style.StyleSpan;
import java.util.ArrayList;

final class deeq implements ibtx {
    public static final deeq a;

    static {
        deeq.a = new deeq();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$ContentItem");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        Spanned spanned0 = Html.fromHtml(isq.c(0x7F152C40, ((goz)object1)), 0, null, null);  // string:sharing_main_troubleshooting_dialog_content_2 "Swipe down from the top of 
                                                                                             // the screen to open Quick Settings. Find and open <b>Quick Share</b>."
        iwg iwg0 = new iwg(null);
        iwg0.l(spanned0);
        Object[] arr_object = spanned0.getSpans(0, spanned0.length(), StyleSpan.class);
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object3 = arr_object[v1];
            if(((StyleSpan)object3).getStyle() == 1) {
                arrayList0.add(object3);
            }
        }
        for(Object object4: arrayList0) {
            iwg0.h(new jat(0L, 0L, jeu.k, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFB), spanned0.getSpanStart(((StyleSpan)object4)), spanned0.getSpanEnd(((StyleSpan)object4)));
        }
        fiuk.a(iwg0.d(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, null, null, null, ((goz)object1), 0, 0, 0x3FFFE);
        return ibom.a;
    }
}

