import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;

public final class cqpk implements View.OnClickListener {
    public final RadioButtonPreferenceWithDropdown a;

    public cqpk(RadioButtonPreferenceWithDropdown radioButtonPreferenceWithDropdown0) {
        this.a = radioButtonPreferenceWithDropdown0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.c ^= 1;
        this.a.al(true);
    }
}

