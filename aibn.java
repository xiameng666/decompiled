import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;

public final class aibn extends ohv implements ohi, ohj {
    public Context ag;
    public String ah;
    public static final int ai;
    private aiaw aj;
    private SwitchPreference ak;
    private aiax al;
    private SwitchPreference am;
    private String an;
    public aicr d;

    static {
        bboh.b("AutofillPreferenceFragment", bbcu.cD);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.ag = this.a.a;
        this.aj = new aiaw(this.ag);
        this.B(0x7F190108);  // xml:sms_code_autofill_preferences
        this.d = new aicr();
        PreferenceScreen preferenceScreen0 = this.A();
        this.ak = (SwitchPreference)preferenceScreen0.l("autofill_permission_state");
        Preference preference0 = preferenceScreen0.l("placeholder_for_description");
        String s1 = this.getString(0x7F152EF9);  // string:sms_code_autofill_settings_toggle_description_autofill_service_settings "Autofill 
                                                 // service settings"
        String s2 = this.getString(0x7F152EFA, new Object[]{s1});  // string:sms_code_autofill_settings_toggle_description_v2 "Autofill must be enabled 
                                                                   // to automatically fill verification codes. You can enable autofill in %s."
        SpannableString spannableString0 = new SpannableString(s2);
        int v = s2.indexOf(s1);
        spannableString0.setSpan(new aibm(this), v, s1.length() + v, 33);
        preference0.n(spannableString0);
        this.al = new aiax(this.ag);
        SwitchPreference switchPreference0 = new SwitchPreference(this.ag);
        this.am = switchPreference0;
        switchPreference0.n = this;
        switchPreference0.L("browser_permission_state");
        this.am.w = false;
        this.am.S(this.getString(0x7F152F05));  // string:sms_code_browser_settings_toggle_primary "Default browser"
        this.am.n(this.getString(0x7F152F06));  // string:sms_code_browser_settings_toggle_secondary "Allow default browser to enter 
                                                // verification codes from text messages"
        preferenceScreen0.am(this.am);
        if(this.K()) {
            this.ak.S(this.getString(0x7F152EFC));  // string:sms_code_autofill_settings_toggle_primary_with_browser_settings "Autofill 
                                                    // service"
            this.ak.n = this;
        }
        else {
            preferenceScreen0.ak(this.ak);
        }
        preferenceScreen0.ak(preference0);
    }

    private final boolean K() {
        return aicl.d(this.ag);
    }

    @Override  // ohi
    public final boolean b(Preference preference0, Object object0) {
        if(preference0 == this.ak) {
            return aicl.c(this.ag);
        }
        return preference0 == this.am ? aicm.c(this.ag) : true;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        if(preference0 == this.ak) {
            if(!aicl.c(this.ag)) {
                new aibr().show(((xob)this.requireContext()).getSupportFragmentManager(), "AutofillServiceTurningOnDialogFragment");
                return true;
            }
            if(this.ak.a) {
                this.d.k(this.ag, aicr.e(this.ah));
                this.aj.f();
                return true;
            }
            this.d.k(this.ag, aicr.d(this.ah));
            this.aj.e();
            return true;
        }
        if(preference0 == this.am) {
            if(!aicm.c(this.ag)) {
                new aibw().show(((xob)this.requireContext()).getSupportFragmentManager(), "DefaultBrowserSelectionDialogFragment");
                return true;
            }
            if(this.am.a) {
                this.d.k(this.ag, aicr.h(this.an));
                this.al.d();
                return true;
            }
            this.d.k(this.ag, aicr.g(this.an));
            this.al.c();
            return true;
        }
        return false;
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        if(this.K()) {
            this.ak.o = null;
        }
        this.am.o = null;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        String s = aicl.b(this.ag);
        this.ah = s;
        this.d.k(this.ag, aicr.c(s));
        if(this.K()) {
            this.ak.H(true);
            this.ak.o = this;
            this.ak.k(this.aj.k());
        }
        this.am.H(true);
        this.am.o = this;
        this.am.k(this.al.h());
        this.an = aicm.b(this.ag);
    }
}

