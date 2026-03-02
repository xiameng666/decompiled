import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class pw implements ViewTreeObserver.OnGlobalLayoutListener {
    final py a;

    public pw(py py0) {
        this.a = py0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        py py0 = this.a;
        if(py0.d.isAttachedToWindow() && py0.d.getGlobalVisibleRect(py0.c)) {
            py0.n();
            py0.v();
            return;
        }
        py0.m();
    }
}

