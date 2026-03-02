import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import j..util.Objects;

final class bdas implements ViewTreeObserver.OnPreDrawListener {
    final bdat a;

    public bdas(bdat bdat0) {
        Objects.requireNonNull(bdat0);
        this.a = bdat0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        bdat bdat0 = this.a;
        TextView textView0 = bdat0.u;
        textView0.getViewTreeObserver().removeOnPreDrawListener(this);
        if(textView0.getLineCount() > textView0.getMaxLines()) {
            textView0.setTextIsSelectable(false);
            bdar bdar0 = new bdar(bdat0);
            bdat0.y.setOnClickListener(bdar0);
            bdat0.y.setVisibility(0);
        }
        return true;
    }
}

