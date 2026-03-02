import android.view.View.OnClickListener;
import android.view.View;
import com.android.settingslib.widget.TwoTargetSwitchPreference;

public final class sld implements View.OnClickListener {
    public final TwoTargetSwitchPreference a;

    public sld(TwoTargetSwitchPreference twoTargetSwitchPreference0) {
        this.a = twoTargetSwitchPreference0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        TwoTargetSwitchPreference twoTargetSwitchPreference0 = this.a;
        if(twoTargetSwitchPreference0.a == null || twoTargetSwitchPreference0.a.isEnabled()) {
            int v = twoTargetSwitchPreference0.b ^ 1;
            if(twoTargetSwitchPreference0.W(Boolean.valueOf(((boolean)v)))) {
                twoTargetSwitchPreference0.o(((boolean)v));
                twoTargetSwitchPreference0.ae(((boolean)v));
            }
        }
    }
}

