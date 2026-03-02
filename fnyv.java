import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class fnyv implements ValueAnimator.AnimatorUpdateListener {
    public final fyuj a;
    public final fyuj b;

    public fnyv(fyuj fyuj0, fyuj fyuj1) {
        this.a = fyuj0;
        this.b = fyuj1;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.a.ab(f);
        this.b.ab(f);
    }
}

