import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.gms.auth.proximity.phonehub.CdmAssociationChimeraActivity;
import j..util.Objects;

final class allo implements gmbg {
    final String a;
    final allq b;

    public allo(allq allq0, String s) {
        this.a = s;
        Objects.requireNonNull(allq0);
        this.b = allq0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        allq.d.n("Getting notification access failed.", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((Boolean)object0).booleanValue() && allq.P(this.a)) {
            return;
        }
        allq allq0 = this.b;
        String s = this.a;
        Object[] arr_object = {((Boolean)object0), Boolean.valueOf(allq.P(s))};
        allq.d.h("Requesting permissions using CDM. notificationAccessGranted=%b isAssociatedWithCdm=%b", arr_object);
        if(allq0.O()) {
            SwitchPreferenceCompat switchPreferenceCompat0 = (SwitchPreferenceCompat)allq0.iO("key_notifications_switch");
            gftb.check(switchPreferenceCompat0);
            switchPreferenceCompat0.T(true);
            switchPreferenceCompat0.H(true);
        }
        else {
            SwitchPreference switchPreference0 = (SwitchPreference)allq0.iO("key_notifications_switch");
            gftb.check(switchPreference0);
            switchPreference0.T(true);
            switchPreference0.H(true);
        }
        CdmAssociationChimeraActivity.a(s, null);
    }
}

