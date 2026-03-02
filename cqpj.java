import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;

public final class cqpj implements ValueAnimator.AnimatorUpdateListener {
    public final RadioButtonPreferenceWithDropdown a;

    public cqpj(RadioButtonPreferenceWithDropdown radioButtonPreferenceWithDropdown0) {
        this.a = radioButtonPreferenceWithDropdown0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        View view0 = this.a.d;
        if(view0 == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        batl.s(viewGroup$LayoutParams0);
        viewGroup$LayoutParams0.height = (int)(((Integer)valueAnimator0.getAnimatedValue()));
        view0.requestLayout();
    }
}

