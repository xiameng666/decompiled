import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;

public final class ehni implements ValueAnimator.AnimatorUpdateListener {
    public final View a;

    public ehni(View view0) {
        this.a = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        ibuq.f(valueAnimator0, "animator");
        Object object0 = valueAnimator0.getAnimatedValue();
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.Int");
        this.a.setBackgroundColor(((Integer)object0).intValue());
    }
}

