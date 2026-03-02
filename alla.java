import androidx.preference.Preference;
import com.google.android.gms.auth.proximity.multidevice.RestrictedSwitchPreferenceCompat;

public final class alla implements ohj {
    public final allq a;
    public final boolean b;
    public final RestrictedSwitchPreferenceCompat c;

    public alla(allq allq0, boolean z, RestrictedSwitchPreferenceCompat restrictedSwitchPreferenceCompat0) {
        this.a = allq0;
        this.b = z;
        this.c = restrictedSwitchPreferenceCompat0;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        allq allq0 = this.a;
        if(this.b) {
            allq0.am.b(allq0.ag);
        }
        else {
            allq0.am.a(allq0.ag, allq0.getString(0x7F152654));  // string:proximity_auth_chromebook "Chromebook"
        }
        this.c.H(false);
        return true;
    }
}

