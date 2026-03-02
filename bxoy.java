import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class bxoy implements ValueAnimator.AnimatorUpdateListener {
    public final bxpb a;
    public final du b;
    public final du c;

    public bxoy(bxpb bxpb0, du du0, du du1) {
        this.a = bxpb0;
        this.b = du0;
        this.c = du1;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        BottomSheetBehavior bottomSheetBehavior0 = this.a.b;
        if(bottomSheetBehavior0 != null) {
            bottomSheetBehavior0.I(((Integer)valueAnimator0.getAnimatedValue()).intValue());
        }
        du du0 = this.b;
        if(du0.getView() != null) {
            View view0 = du0.getView();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            viewGroup$LayoutParams0.height = (int)(((Integer)valueAnimator0.getAnimatedValue()));
            view0.setLayoutParams(viewGroup$LayoutParams0);
            view0.setAlpha(1.0f - valueAnimator0.getAnimatedFraction());
        }
        du du1 = this.c;
        if(du1.getView() != null) {
            du1.getView().setAlpha(valueAnimator0.getAnimatedFraction());
        }
    }
}

