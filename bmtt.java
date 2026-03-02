import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmtt implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmtu a;

    public bmtt(bmtu bmtu0) {
        Objects.requireNonNull(bmtu0);
        this.a = bmtu0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmtu bmtu0 = this.a;
        bmtu0.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view0 = bmtu0.b.findViewById(0x7F0B0DD0);  // id:buttons_row
        bmuz bmuz0 = bmtu0.a;
        if(view0 == null) {
            view0 = bmtu0.b;
        }
        bmuz0.n(view0.getBottom());
    }
}

