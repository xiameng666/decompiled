import androidx.preference.Preference;
import com.google.android.gms.auth.proximity.multidevice.RestrictedSwitchPreference;

public final class allb implements ohj {
    public final allq a;
    public final boolean b;
    public final RestrictedSwitchPreference c;

    public allb(allq allq0, boolean z, RestrictedSwitchPreference restrictedSwitchPreference0) {
        this.a = allq0;
        this.b = z;
        this.c = restrictedSwitchPreference0;
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

