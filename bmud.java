import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmud implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmue a;

    public bmud(bmue bmue0) {
        Objects.requireNonNull(bmue0);
        this.a = bmue0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmue bmue0 = this.a;
        bmue0.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view0 = bmue0.c.findViewById(0x7F0B0DD0);  // id:buttons_row
        bmuz bmuz0 = bmue0.b;
        if(view0 == null) {
            view0 = bmue0.c;
        }
        bmuz0.n(view0.getBottom());
    }
}

