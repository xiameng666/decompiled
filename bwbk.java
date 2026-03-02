import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.widget.TextView;

public final class bwbk implements ValueAnimator.AnimatorUpdateListener {
    public final TextView a;

    public bwbk(TextView textView0) {
        this.a = textView0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
        this.a.setMaxLines(v);
    }
}

