import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import com.android.settingslib.widget.FooterPreference;
import com.android.settingslib.widget.MainSwitchPreference;

public final class ezlx extends ezbq {
    public Preference ag;
    public ezbn ah;
    public ccmg ai;
    private MainSwitchPreference ak;
    private FooterPreference al;
    private ezcn am;
    public static final bboh d;

    static {
        ezlx.d = bboh.b("Trustlet_Place", bbcu.eM);
    }

    public final void K() {
        Context context0 = this.getContext();
        gftb.check(context0);
        if(this.ah != null && !this.ah.m("auth_trust_agent_pref_trusted_places_is_places_enabled_key")) {
            if(bbqa.c()) {
                this.ag.n("Extend Unlock with trusted places is off");
                return;
            }
            this.ag.n("Smart Lock with trusted places is off");
            return;
        }
        new azts(context0, null).bQ().z(new ezlw(this, context0));
    }

    @Override  // ezbq
    public final void M() {
        ezbn ezbn0 = this.P();
        this.ah = ezbn0;
        if(ezbn0 != null) {
            boolean z = ezbn0.m("auth_trust_agent_pref_trusted_places_is_places_enabled_key");
            this.ak.k(z);
            this.K();
        }
    }

    @Override  // ezbq
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.am = ezcn.a();
        this.ai = new ccmp();
        this.ah = this.P();
        this.B(0x7F190118);  // xml:trusted_places_preferences_with_main_switch
        Preference preference0 = this.iO("trustlet_place_switch_pref_key");
        gftb.check(preference0);
        this.ak = (MainSwitchPreference)preference0;
        ezbn ezbn0 = this.ah;
        if(ezbn0 != null) {
            ((MainSwitchPreference)preference0).k(ezbn0.m("auth_trust_agent_pref_trusted_places_is_places_enabled_key"));
        }
        ((MainSwitchPreference)preference0).n = new ezlv(this);
        if(!this.am.c) {
            ((MainSwitchPreference)preference0).H(false);
            ((MainSwitchPreference)preference0).n(this.getString(0x7F150322));  // string:auth_trust_agent_dpm_disabled "Disabled by administrator"
        }
        Preference preference1 = this.iO("auth_trust_agent_pref_trusted_places_significant_places_key");
        this.ag = preference1;
        preference1.H(true);
        this.ag.t = new Intent("com.google.android.gms.significantplaces.settings.TRUSTED_PLACES_SETTINGS").setPackage("com.google.android.gms").setFlags(0x14000000);
        this.K();
        FooterPreference footerPreference0 = (FooterPreference)this.iO("trusted_places_footer_pref_key");
        this.al = footerPreference0;
        footerPreference0.ah(this.getString(0x7F15032B));  // string:auth_trust_agent_learn_more "Learn more"
        this.al.l(new ezlu(this));
        this.al.S(this.getString(0x7F15343D, new Object[]{((int)4)}));  // string:trusted_places_preference_screen_footer_qplus_significant_places "After you 
                                                                        // unlock this device, it stays unlocked as long as you\'re at or close to a trusted 
                                                                        // place. \n \nThis device will stay unlocked for up to %d hours or until you leave 
                                                                        // one of your trusted places. For accuracy, this uses your precise location. \n \nOther 
                                                                        // settings may use the same trusted places."
    }

    @Override  // ezbq
    public final void onPause() {
        super.onPause();
        this.ah = null;
    }
}

