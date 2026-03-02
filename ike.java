import android.view.ViewTreeObserver.OnTouchModeChangeListener;

public final class ike implements ViewTreeObserver.OnTouchModeChangeListener {
    public final ili a;

    public ike(ili ili0) {
        this.a = ili0;
    }

    @Override  // android.view.ViewTreeObserver$OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.a.I.a((z ? 1 : 2));
    }
}

