import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;
import j..util.Objects;

public final class cqpm extends AnimatorListenerAdapter {
    final RadioButtonPreferenceWithDropdown a;

    public cqpm(RadioButtonPreferenceWithDropdown radioButtonPreferenceWithDropdown0) {
        Objects.requireNonNull(radioButtonPreferenceWithDropdown0);
        this.a = radioButtonPreferenceWithDropdown0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        View view0 = this.a.d;
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }
}

