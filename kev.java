import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.WeakHashMap;

final class kev implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakHashMap a;

    public kev() {
        this.a = new WeakHashMap();
    }

    public final void a(View view0) {
        view0.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.a(view0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

