import android.content.Context;
import android.os.Bundle;
import androidx.preference.PreferenceScreen;
import com.android.settingslib.widget.FooterPreference;
import com.android.settingslib.widget.IllustrationPreference;
import com.android.settingslib.widget.MainSwitchPreference;
import j..util.Objects;

public final class ezlh extends ezbq {
    public boolean ag;
    Context ah;
    private PreferenceScreen ai;
    private IllustrationPreference ak;
    private FooterPreference al;
    public MainSwitchPreference d;

    @Override  // ezbq
    public final void M() {
        ezbn ezbn0 = this.P();
        this.ag = false;
        PreferenceScreen preferenceScreen0 = this.ai;
        if(preferenceScreen0 != null) {
            preferenceScreen0.ah();
            this.ai.am(this.ak);
            this.ai.am(this.d);
            if(ezbn0 != null) {
                boolean z = ezbn0.m("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet");
                this.ag = z;
                this.d.k(z);
            }
            MainSwitchPreference mainSwitchPreference0 = this.d;
            mainSwitchPreference0.n = new ezlc(this);
            this.ai.am(this.al);
        }
    }

    @Override  // ezbq
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.ah = this.getContext();
        this.B(0x7F1900D6);  // xml:on_body_detection_preferences_with_main_switch
        this.d = (MainSwitchPreference)Objects.requireNonNull(this.iO("trustlet_onbody_switch_pref_key"));
        this.ai = (PreferenceScreen)this.iO("auth_trust_agent_pref_on_body_detection_list_key");
        this.ak = (IllustrationPreference)this.iO("trusted_onbody_illustration_key");
        FooterPreference footerPreference0 = (FooterPreference)this.iO("trusted_onbody_footer_pref_key");
        this.al = footerPreference0;
        footerPreference0.ah(this.getString(0x7F15032B));  // string:auth_trust_agent_learn_more "Learn more"
        this.al.l(new ezlb(this));
    }
}

