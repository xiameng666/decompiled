import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;

public final class alkx implements alrr {
    public final allq a;

    public alkx(allq allq0) {
        this.a = allq0;
    }

    @Override  // alrr
    public final void a(boolean z) {
        allq allq0 = this.a;
        if(z) {
            allq0.ak.b(allq0.ag, true);
            return;
        }
        if(allq0.O()) {
            SwitchPreferenceCompat switchPreferenceCompat0 = (SwitchPreferenceCompat)allq0.iO("key_camera_roll_switch");
            gftb.check(switchPreferenceCompat0);
            switchPreferenceCompat0.k(false);
            return;
        }
        SwitchPreference switchPreference0 = (SwitchPreference)allq0.iO("key_camera_roll_switch");
        gftb.check(switchPreference0);
        switchPreference0.k(false);
    }
}

