import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.material.card.MaterialCardView;

public final class fnyp implements ValueAnimator.AnimatorUpdateListener {
    public final MaterialCardView a;

    public fnyp(MaterialCardView materialCardView0) {
        this.a = materialCardView0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.a.ie(f);
    }
}

