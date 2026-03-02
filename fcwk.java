import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView;

public final class fcwk implements ValueAnimator.AnimatorUpdateListener {
    public final LockPatternView a;
    public final fcwp b;

    public fcwk(LockPatternView lockPatternView0, fcwp fcwp0) {
        this.a = lockPatternView0;
        this.b = fcwp0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.b.a = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.a.invalidate();
    }
}

