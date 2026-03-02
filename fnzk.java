import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import j..util.Objects;

final class fnzk implements View.OnAttachStateChangeListener {
    final fnzx a;
    final fnzu b;

    public fnzk(fnzu fnzu0, fnzx fnzx0) {
        this.a = fnzx0;
        Objects.requireNonNull(fnzu0);
        this.b = fnzu0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        fnzu fnzu0 = this.b;
        fnjd fnjd0 = this.a.b;
        fnjf fnjf0 = fnzu0.z;
        fnjd0.c(fnjf0);
        if(fnjd0.a) {
            fnzu0.g(false);
            fnjf0.b(fnjd0.a());
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.a.b.d(this.b.z);
    }
}

