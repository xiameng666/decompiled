import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver;

final class mq implements View.OnAttachStateChangeListener {
    final mu a;

    public mq(mu mu0) {
        this.a = mu0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        mu mu0 = this.a;
        ViewTreeObserver viewTreeObserver0 = mu0.e;
        if(viewTreeObserver0 != null) {
            if(!viewTreeObserver0.isAlive()) {
                mu0.e = view0.getViewTreeObserver();
            }
            mu0.e.removeGlobalOnLayoutListener(mu0.c);
        }
        view0.removeOnAttachStateChangeListener(this);
    }
}

