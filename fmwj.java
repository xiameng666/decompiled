import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.widget.TextView;

public class fmwj extends iddp {
    private boolean a;

    public fmwj() {
        this.a = false;
    }

    @Override  // iddp
    protected final void a(TextView textView0, ClickableSpan clickableSpan0, Spannable spannable0) {
        if(this.a) {
            return;
        }
        this.a = true;
        Selection.setSelection(spannable0, spannable0.getSpanStart(clickableSpan0), spannable0.getSpanEnd(clickableSpan0));
    }

    @Override  // iddp
    protected final void b(TextView textView0) {
        if(!this.a) {
            return;
        }
        this.a = false;
        Selection.removeSelection(((Spannable)textView0.getText()));
    }
}

