import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

final class dxjr implements ViewTreeObserver.OnGlobalLayoutListener {
    final int a;
    final dxjs b;

    public dxjr(dxjs dxjs0, int v) {
        this.a = v;
        Objects.requireNonNull(dxjs0);
        this.b = dxjs0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int v = this.b.d.getHeight();
        this.b.d.smoothScrollBy(0, ((int)(((double)(this.a - v)) * 1.5)));
        this.b.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

