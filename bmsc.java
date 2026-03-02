import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmsc implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmsd a;

    public bmsc(bmsd bmsd0) {
        Objects.requireNonNull(bmsd0);
        this.a = bmsd0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.a.n(this.a.b.getBottom());
    }
}

