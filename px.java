import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow.OnDismissListener;

final class px implements PopupWindow.OnDismissListener {
    final ViewTreeObserver.OnGlobalLayoutListener a;
    final py b;

    public px(py py0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        this.b = py0;
        this.a = viewTreeObserver$OnGlobalLayoutListener0;
        super();
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver0 = this.b.d.getViewTreeObserver();
        if(viewTreeObserver0 != null) {
            viewTreeObserver0.removeGlobalOnLayoutListener(this.a);
        }
    }
}

