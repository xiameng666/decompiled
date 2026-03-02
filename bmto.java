import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmto implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmtp a;

    public bmto(bmtp bmtp0) {
        Objects.requireNonNull(bmtp0);
        this.a = bmtp0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmtp bmtp0 = this.a;
        bmtp0.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view0 = bmtp0.b.findViewById(0x7F0B0DD0);  // id:buttons_row
        bmuz bmuz0 = bmtp0.a;
        if(view0 == null) {
            view0 = bmtp0.b;
        }
        bmuz0.n(view0.getBottom());
    }
}

