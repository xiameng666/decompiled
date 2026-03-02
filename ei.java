import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;

final class ei implements View.OnAttachStateChangeListener {
    final fv a;
    final ej b;

    public ei(ej ej0, fv fv0) {
        this.b = ej0;
        this.a = fv0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.a.e();
        gx.c(((ViewGroup)this.a.a.P.getParent()), this.b.a).h();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

