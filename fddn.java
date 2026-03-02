import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

public final class fddn implements ViewTreeObserver.OnGlobalLayoutListener {
    final fdds a;

    public fddn(fdds fdds0) {
        Objects.requireNonNull(fdds0);
        this.a = fdds0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        fdds fdds0 = this.a;
        if(!fdds0.ah.canScrollVertically(1)) {
            fddr fddr0 = fdds0.ag;
            if(fddr0 != null && !fddr0.d) {
                fddr0.d = true;
                fddr0.b();
            }
        }
    }
}

