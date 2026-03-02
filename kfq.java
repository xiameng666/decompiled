import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;

public final class kfq implements ValueAnimator.AnimatorUpdateListener {
    public final kr a;

    public kfq(kr kr0) {
        this.a = kr0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        ((View)this.a.a.c.getParent()).invalidate();
    }
}

