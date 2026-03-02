import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import j..util.Objects;

final class focu implements View.OnAttachStateChangeListener {
    final focv a;
    private final fnjf b;

    public focu(focv focv0, View view0, int v) {
        Objects.requireNonNull(focv0);
        this.a = focv0;
        super();
        this.b = new foct(this, view0, v);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        fnir fnir0 = this.a.a;
        fnjf fnjf0 = this.b;
        fnir0.c(fnjf0);
        if(fnir0.e()) {
            fnjf0.b(fnir0.a());
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.a.a.d(this.b);
    }
}

