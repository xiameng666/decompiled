import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

final class xo implements ValueAnimator.AnimatorUpdateListener {
    final xp a;

    public xo(xp xp0) {
        this.a = xp0;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.p = valueAnimator0.getAnimatedFraction();
    }
}

