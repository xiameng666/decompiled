import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmso implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmsp a;

    public bmso(bmsp bmsp0) {
        Objects.requireNonNull(bmsp0);
        this.a = bmsp0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.b.o(this.a.c.getBottom() + 20, 100);
    }
}

