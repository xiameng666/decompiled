import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver;

final class nt implements View.OnAttachStateChangeListener {
    final nu a;

    public nt(nu nu0) {
        this.a = nu0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        nu nu0 = this.a;
        ViewTreeObserver viewTreeObserver0 = nu0.d;
        if(viewTreeObserver0 != null) {
            if(!viewTreeObserver0.isAlive()) {
                nu0.d = view0.getViewTreeObserver();
            }
            nu0.d.removeGlobalOnLayoutListener(nu0.b);
        }
        view0.removeOnAttachStateChangeListener(this);
    }
}

