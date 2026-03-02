import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import j..util.Objects;

public final class cabu implements ViewTreeObserver.OnGlobalLayoutListener {
    final cabx a;

    public cabu(cabx cabx0) {
        Objects.requireNonNull(cabx0);
        this.a = cabx0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        float[] arr_f = {((float)this.a.e.getHeight()), 0.0f};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.a.e, "translationY", arr_f);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.a.d, "alpha", new float[]{0.0f, 1.0f});
        cabt cabt0 = new cabt(this);
        this.a.a(objectAnimator0, objectAnimator1, cabt0);
    }
}

