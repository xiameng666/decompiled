import android.text.Layout;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import j..util.Objects;

final class buqk implements ViewTreeObserver.OnGlobalLayoutListener {
    final buqd a;

    public buqk(buqd buqd0) {
        Objects.requireNonNull(buqd0);
        this.a = buqd0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        for(int v = 0; true; ++v) {
            FlexboxLayout flexboxLayout0 = this.a.i;
            if(v >= flexboxLayout0.getChildCount()) {
                break;
            }
            TextView textView0 = (TextView)kfb.b(flexboxLayout0.getChildAt(v), 0x7F0B22B8);  // id:title
            int v1 = textView0.getLineCount();
            Layout layout0 = textView0.getLayout();
            if(layout0 != null && v1 > 0 && layout0.getEllipsisCount(v1 - 1) > 0) {
                flexboxLayout0.o(2);
                return;
            }
        }
    }
}

