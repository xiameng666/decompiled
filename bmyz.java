import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmyz implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmza a;

    public bmyz(bmza bmza0) {
        Objects.requireNonNull(bmza0);
        this.a = bmza0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.b.o(this.a.c.getBottom());
    }
}

