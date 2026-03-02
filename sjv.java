import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View.OnClickListener;
import android.view.View;
import com.android.settingslib.widget.CollapsableTextView;

public final class sjv extends ClickableSpan {
    final CollapsableTextView a;

    public sjv(CollapsableTextView collapsableTextView0) {
        this.a = collapsableTextView0;
        super();
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        ibuq.f(view0, "widget");
        View.OnClickListener view$OnClickListener0 = this.a.j;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(view0);
        }
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        ibuq.f(textPaint0, "ds");
        super.updateDrawState(textPaint0);
        textPaint0.setUnderlineText(true);
    }
}

