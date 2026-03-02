import android.os.Bundle;
import androidx.preference.Preference;

public final class epmm implements ibts {
    public final epmo a;

    public epmm(epmo epmo0) {
        this.a = epmo0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Bundle bundle0 = ((ezcp)object0).a.getBundle("Place");
        int v = bundle0 == null || !bundle0.getBoolean("key_trustlet_is_configured", false) ? 0 : 1;
        epmo epmo0 = this.a;
        Preference preference0 = epmo0.d;
        if(preference0 == null) {
            ibuq.j("extendUnlockPreference");
            preference0 = null;
        }
        preference0.n(epmo0.getString((1 == v ? 0x7F1508A9 : 0x7F1508A6)));  // string:common_on "On"
        return ibom.a;
    }
}

