import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.android.settingslib.widget.BannerMessagePreference;
import java.util.Set;

public final class eyqd implements ibts {
    public final eyqp a;

    public eyqd(eyqp eyqp0) {
        this.a = eyqp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        eysx eysx0 = ((eyqq)object0).b;
        eyqp eyqp0 = this.a;
        if(eysx0 != null) {
            Set set0 = eyqp0.al;
            eysw eysw0 = eysx0.a;
            if(!set0.contains(eysw0)) {
                set0.add(eysw0);
                eysq.a(eyqp0.getParentFragmentManager(), eyqp0.am);
            }
        }
        eyqp0.L();
        eypl eypl0 = ((eyqq)object0).d;
        Preference preference0 = eyqp0.iO("enrolled_devices_settings_category");
        if(preference0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Preference preference1 = eyqp0.iO("distance_based_relock_setting_switch_preference");
        if(preference1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if(eypl0.a) {
            ((PreferenceCategory)preference0).T(true);
            ((SwitchPreferenceCompat)preference1).H(eypl0.b);
            ((SwitchPreferenceCompat)preference1).k(eyqp0.K().y());
            ((SwitchPreferenceCompat)preference1).n(eyqp0.getString((eypl0.b ? 0x7F150DEB : 0x7F15310F)));  // string:distance_based_relock_setting_description "Only get notified when your phone 
                                                                                                            // and watch are far apart, instead of every time your watch unlocks your phone"
            ((SwitchPreferenceCompat)preference1).n = new eyqf(eyqp0);
        }
        else {
            ((PreferenceCategory)preference0).T(false);
        }
        eysz eysz0 = ((eyqq)object0).c;
        BannerMessagePreference bannerMessagePreference0 = null;
        if(eysz0 == null) {
            BannerMessagePreference bannerMessagePreference1 = eyqp0.ak;
            if(bannerMessagePreference1 == null) {
                ibuq.j("warningMessagePreference");
            }
            else {
                bannerMessagePreference0 = bannerMessagePreference1;
            }
            bannerMessagePreference0.T(false);
            return ibom.a;
        }
        BannerMessagePreference bannerMessagePreference2 = eyqp0.ak;
        if(bannerMessagePreference2 == null) {
            ibuq.j("warningMessagePreference");
        }
        else {
            bannerMessagePreference0 = bannerMessagePreference2;
        }
        bannerMessagePreference0.T(true);
        bannerMessagePreference0.P(eysz0.a);
        eysy eysy0 = eysz0.b;
        if(eysy0 == null) {
            bannerMessagePreference0.ak(false);
            return ibom.a;
        }
        bannerMessagePreference0.ak(true);
        bannerMessagePreference0.am(eysy0.a);
        bannerMessagePreference0.ai(new eyqe(eysy0, eyqp0));
        return ibom.a;
    }
}

