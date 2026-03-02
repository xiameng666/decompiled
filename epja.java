import android.os.Bundle;
import com.android.settingslib.widget.ButtonPreference;

public final class epja extends skp {
    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.H(0x7F190102, s);  // xml:significant_places_enroll_biometrics_preferences
        ButtonPreference buttonPreference0 = (ButtonPreference)this.iO("button_set_screen_lock");
        if(buttonPreference0 != null) {
            buttonPreference0.l(new epiz(this));
        }
    }
}

