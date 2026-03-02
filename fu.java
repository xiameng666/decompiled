import android.view.View.OnAttachStateChangeListener;
import android.view.View;

final class fu implements View.OnAttachStateChangeListener {
    final View a;

    public fu(View view0) {
        this.a = view0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.a.removeOnAttachStateChangeListener(this);
        this.a.requestApplyInsets();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

