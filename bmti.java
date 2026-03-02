import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmti implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmtj a;

    public bmti(bmtj bmtj0) {
        Objects.requireNonNull(bmtj0);
        this.a = bmtj0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.b.n(this.a.c.getBottom());
    }
}

