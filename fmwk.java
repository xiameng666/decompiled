import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

public final class fmwk extends fmwj {
    private final fmwh a;

    public fmwk(fmwh fmwh0) {
        this.a = fmwh0;
    }

    @Override  // iddp
    public final boolean onTouchEvent(TextView textView0, Spannable spannable0, MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1) {
            int v = textView0.getOffsetForPosition(motionEvent0.getX(), motionEvent0.getY());
            URLSpan[] arr_uRLSpan = (URLSpan[])spannable0.getSpans(v, v, URLSpan.class);
            if(arr_uRLSpan.length == 1) {
                int v1 = 0;
                URLSpan uRLSpan0 = arr_uRLSpan[0];
                if(uRLSpan0 != null) {
                    Uri uri0 = Uri.parse(uRLSpan0.getURL());
                    fmwi fmwi0 = this.a.a;
                    if(fmwi0.s) {
                        ((fmuw)fmwi0.r).g.b(((fmuw)fmwi0.r).b(0x7D).a());
                        return super.onTouchEvent(textView0, spannable0, motionEvent0);
                    }
                    fmre fmre0 = fmwi0.r;
                    String s = uri0.getScheme();
                    Integer integer0 = (Integer)fmuw.a.get(s);
                    flsl flsl0 = ((fmuw)fmre0).g;
                    fmai fmai0 = ((fmuw)fmre0).b(0x7A);
                    if(integer0 != null) {
                        v1 = (int)integer0;
                    }
                    fmai0.k(v1);
                    flsl0.b(fmai0.a());
                }
            }
        }
        return super.onTouchEvent(textView0, spannable0, motionEvent0);
    }
}

