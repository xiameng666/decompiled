import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView;

public final class fcwj implements ValueAnimator.AnimatorUpdateListener {
    public final LockPatternView a;
    public final fcwp b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public fcwj(LockPatternView lockPatternView0, fcwp fcwp0, float f, float f1, float f2, float f3) {
        this.a = lockPatternView0;
        this.b = fcwp0;
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        float f1 = 1.0f - f;
        this.b.e = this.c * f1 + this.d * f;
        this.b.f = f1 * this.e + f * this.f;
        this.a.invalidate();
    }
}

