import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmyg implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmyh a;

    public bmyg(bmyh bmyh0) {
        Objects.requireNonNull(bmyh0);
        this.a = bmyh0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmyh bmyh0 = this.a;
        bmyh0.ai.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view0 = bmyh0.ai.findViewById(0x7F0B0DD0);  // id:buttons_row
        bmwt bmwt0 = bmyh0.ah;
        if(view0 == null) {
            view0 = bmyh0.ai;
        }
        bmwt0.o(view0.getBottom());
    }
}

