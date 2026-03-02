import android.view.View.OnAttachStateChangeListener;
import android.view.View;

public final class iqu implements View.OnAttachStateChangeListener {
    final ijr a;
    final ibvd b;

    public iqu(ijr ijr0, ibvd ibvd0) {
        this.a = ijr0;
        this.b = ibvd0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        ijr ijr0 = this.a;
        lps lps0 = lsr.a(ijr0);
        if(lps0 != null) {
            this.b.a = iqx.a(ijr0, lps0.getLifecycle());
            ijr0.removeOnAttachStateChangeListener(this);
            return;
        }
        hxt.b(a.i(ijr0, "View tree for ", " has no ViewTreeLifecycleOwner"));
        throw new ibnm();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

