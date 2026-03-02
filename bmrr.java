import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmrr implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmrs a;

    public bmrr(bmrs bmrs0) {
        Objects.requireNonNull(bmrs0);
        this.a = bmrs0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmrs bmrs0 = this.a;
        bmrs0.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view0 = bmrs0.c.findViewById(0x7F0B0DD0);  // id:buttons_row
        bmuz bmuz0 = bmrs0.b;
        if(view0 == null) {
            view0 = bmrs0.c;
        }
        bmuz0.o(view0.getBottom(), 100);
    }
}

