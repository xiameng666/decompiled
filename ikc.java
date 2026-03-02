import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class ikc implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ili a;

    public ikc(ili ili0) {
        this.a = ili0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.D = 0L;
        this.a.I();
    }
}

