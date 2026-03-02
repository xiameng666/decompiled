import android.view.ViewTreeObserver.OnPreDrawListener;
import j..util.Objects;

final class bdbe implements ViewTreeObserver.OnPreDrawListener {
    final bdbf a;

    public bdbe(bdbf bdbf0) {
        Objects.requireNonNull(bdbf0);
        this.a = bdbf0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        bdbf bdbf0 = this.a;
        bdbf0.v.getViewTreeObserver().removeOnPreDrawListener(this);
        if(bdbf0.v.getLineCount() > bdbf0.v.getMaxLines()) {
            bdbf0.w.setVisibility(0);
            bdbd bdbd0 = new bdbd(bdbf0);
            bdbf0.w.setOnClickListener(bdbd0);
        }
        return true;
    }
}

