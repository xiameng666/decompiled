import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.android.settingslib.widget.BannerMessagePreference;
import com.android.settingslib.widget.IllustrationPreference;
import com.google.android.gms.libs.layoutpreference.LayoutPreference;

public final class eknt extends skp implements ohj {
    public final eknr ag;
    public AlertDialog ah;
    public ekob ai;
    private Preference aj;
    private IllustrationPreference ak;
    private BannerMessagePreference al;
    private Preference am;
    private SwitchPreferenceCompat an;
    private BannerMessagePreference ao;
    public final eknq d;

    public eknt() {
        this.d = new eknq(this);
        this.ag = new eknr(this);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.H((hxuv.f() ? 0x7F1900EE : 0x7F1900ED), s);  // xml:prefs_aapm
        Activity activity0 = ekne.a(this);
        if(activity0 == null) {
            return;
        }
        this.ai = eknu.a(activity0);
        Preference preference0 = this.A().l(this.getString(0x7F1506D1));  // string:card_preference_key "sb_card_preference_key"
        if(preference0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.aj = preference0;
        Preference preference1 = this.A().l(this.getString(0x7F1506D4));  // string:card_without_illustration_preference_key "sb_card_without_illustration_preference_key"
        ekob ekob0 = null;
        if(sku.a(this.requireContext())) {
            PreferenceScreen preferenceScreen0 = this.A();
            Preference preference2 = this.aj;
            if(preference2 == null) {
                ibuq.j("safeBrowsingIsOnPreference");
                preference2 = null;
            }
            preferenceScreen0.ak(preference2);
            if(preference1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.aj = preference1;
        }
        else {
            if(preference1 != null) {
                this.A().ak(preference1);
            }
            Preference preference3 = this.aj;
            if(preference3 == null) {
                ibuq.j("safeBrowsingIsOnPreference");
                preference3 = null;
            }
            LayoutPreference layoutPreference0 = (preference3 instanceof LayoutPreference) ? ((LayoutPreference)preference3) : null;
            if(layoutPreference0 != null) {
                View view0 = layoutPreference0.k(0x7F0B1F17);  // id:sb_graphic
                if(view0 != null) {
                    view0.setVisibility(0);
                }
            }
        }
        this.ak = (IllustrationPreference)this.A().l(this.getString(0x7F1515A4));  // string:illustration_preference_key "sb_illustration_preference_key"
        if(!sku.a(this.requireContext())) {
            IllustrationPreference illustrationPreference0 = this.ak;
            if(illustrationPreference0 != null) {
                this.A().ak(illustrationPreference0);
            }
            this.ak = null;
        }
        Preference preference4 = this.A().l(this.getString(0x7F15148B));  // string:gpp_warning_preference_key "sb_gpp_warning_preference_key"
        if(preference4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((BannerMessagePreference)preference4).T(false);
        ((BannerMessagePreference)preference4).ak(true);
        ((BannerMessagePreference)preference4).am(0x7F15148A);  // string:gpp_warning_preference_action "Turn on Play Protect"
        ((BannerMessagePreference)preference4).ai(new ekni(this, activity0));
        this.al = (BannerMessagePreference)preference4;
        Preference preference5 = this.A().l(this.getString(0x7F1501BE));  // string:apps_preference_key "sb_apps_preference_key"
        if(preference5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ekob ekob1 = this.ai;
        if(ekob1 == null) {
            ibuq.j("safeBrowsingPreferenceController");
        }
        else {
            ekob0 = ekob1;
        }
        eknt.M(activity0, ekob0.a(), new ekno(this, preference5));
        preference5.o = new eknj(this, activity0);
        this.am = preference5;
        Preference preference6 = this.A().l(this.getString(0x7F150EF3));  // string:enable_preference_key "sb_enable_preference_key"
        if(preference6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((SwitchPreferenceCompat)preference6).n = new eknk(this, activity0);
        ((SwitchPreferenceCompat)preference6).o = (Preference preference0) -> ibuq.m(preference0.s, this.getString(0x7F150EF3));  // string:enable_preference_key "sb_enable_preference_key"
        this.an = (SwitchPreferenceCompat)preference6;
        Preference preference7 = this.A().l(this.getString(0x7F1534E6));  // string:v5_warning_preference_key "sb_v5_warning_preference_key"
        if(preference7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((BannerMessagePreference)preference7).k(sjn.b);
        this.ao = (BannerMessagePreference)preference7;
        this.ah = new AlertDialog.Builder(this.getContext()).setTitle(0x7F150DCA).setMessage(0x7F150DC9).setNegativeButton(0x7F150DC7, new eknm()).setPositiveButton(0x7F150DC8, new eknn(this, activity0)).create();  // string:disable_warning_title "Turn off live threat protection?"
    }

    public final void K(Activity activity0, boolean z) {
        ekob ekob0 = this.ai;
        if(ekob0 == null) {
            ibuq.j("safeBrowsingPreferenceController");
            ekob0 = null;
        }
        eknz eknz0 = new eknz(new ekny());
        ekns ekns0 = new ekns(this, z);
        eknt.M(activity0, fhqu.a(glzd.f(ekob0.a.a.b(new ekof(Boolean.valueOf(z)), gmap.a), eknz0, gmap.a)), ekns0);
    }

    public final void L(int v) {
        Preference preference0 = this.aj;
        BannerMessagePreference bannerMessagePreference0 = null;
        if(preference0 == null) {
            ibuq.j("safeBrowsingIsOnPreference");
            preference0 = null;
        }
        boolean z = false;
        preference0.T(v != 1);
        IllustrationPreference illustrationPreference0 = this.ak;
        if(illustrationPreference0 != null) {
            illustrationPreference0.T(v != 1);
        }
        Preference preference1 = this.am;
        if(preference1 == null) {
            ibuq.j("appsPreference");
            preference1 = null;
        }
        preference1.T(v != 1);
        SwitchPreferenceCompat switchPreferenceCompat0 = this.an;
        if(switchPreferenceCompat0 == null) {
            ibuq.j("enablePreference");
            switchPreferenceCompat0 = null;
        }
        switchPreferenceCompat0.H(v != 1);
        BannerMessagePreference bannerMessagePreference1 = this.al;
        if(bannerMessagePreference1 == null) {
            ibuq.j("gppDisabledWarningPref");
            bannerMessagePreference1 = null;
        }
        bannerMessagePreference1.T(v == 1);
        SwitchPreferenceCompat switchPreferenceCompat1 = this.an;
        if(switchPreferenceCompat1 == null) {
            ibuq.j("enablePreference");
            switchPreferenceCompat1 = null;
        }
        switchPreferenceCompat1.k(v == 3);
        BannerMessagePreference bannerMessagePreference2 = this.ao;
        if(bannerMessagePreference2 == null) {
            ibuq.j("v5DisabledWarningPref");
        }
        else {
            bannerMessagePreference0 = bannerMessagePreference2;
        }
        if(v == 2) {
            z = true;
        }
        bannerMessagePreference0.T(z);
    }

    public static final void M(Activity activity0, evql evql0, evqf evqf0) {
        evql0.w(activity0, evqf0);
        evql0.t(activity0, ((evqc)evqf0));
    }

    // Detected as a lambda impl.
    @Override  // ohj
    public final boolean c(Preference preference0) {
        return ibuq.m(preference0.s, this.getString(0x7F150EF3));  // string:enable_preference_key "sb_enable_preference_key"
    }

    @Override  // du
    public final void onResume() {
        Activity activity0 = ekne.a(this);
        if(activity0 != null) {
            activity0.setTitle(0x7F15299E);  // string:safe_browsing_title "Android Safe Browsing"
        }
        super.onResume();
    }

    @Override  // ohv
    public final void onStart() {
        super.onStart();
        Activity activity0 = ekne.a(this);
        if(activity0 == null) {
            return;
        }
        ekob ekob0 = this.ai;
        if(ekob0 == null) {
            ibuq.j("safeBrowsingPreferenceController");
            ekob0 = null;
        }
        eknt.M(activity0, ekob0.b.bL().g(new ekoa()), this.d);
    }
}

