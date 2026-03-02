import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmsv implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmsw a;

    public bmsv(bmsw bmsw0) {
        Objects.requireNonNull(bmsw0);
        this.a = bmsw0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmsw bmsw0 = this.a;
        bmsw0.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view0 = bmsw0.c.findViewById(0x7F0B0DD0);  // id:buttons_row
        bmuz bmuz0 = bmsw0.b;
        if(view0 == null) {
            view0 = bmsw0.c;
        }
        bmuz0.o(view0.getBottom(), 100);
    }
}

