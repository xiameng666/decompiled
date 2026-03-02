import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;
import j..util.Objects;

public final class cqpl extends AnimatorListenerAdapter {
    final RadioButtonPreferenceWithDropdown a;

    public cqpl(RadioButtonPreferenceWithDropdown radioButtonPreferenceWithDropdown0) {
        Objects.requireNonNull(radioButtonPreferenceWithDropdown0);
        this.a = radioButtonPreferenceWithDropdown0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        View view0 = this.a.d;
        if(view0 == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        batl.s(viewGroup$LayoutParams0);
        viewGroup$LayoutParams0.height = -2;
    }
}

