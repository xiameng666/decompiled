import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class bmyq implements ViewTreeObserver.OnGlobalLayoutListener {
    final bmyr a;

    public bmyq(bmyr bmyr0) {
        Objects.requireNonNull(bmyr0);
        this.a = bmyr0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bmyr bmyr0 = this.a;
        bmyr0.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view0 = bmyr0.b.findViewById(0x7F0B0DD0);  // id:buttons_row
        bmwt bmwt0 = bmyr0.a;
        if(view0 == null) {
            view0 = bmyr0.b;
        }
        bmwt0.o(view0.getBottom());
    }
}

