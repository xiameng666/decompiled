import android.app.AlertDialog.Builder;
import android.view.ContextThemeWrapper;
import androidx.preference.Preference;
import j..util.Objects;

final class ezlc implements ohi {
    final ezlh a;

    public ezlc(ezlh ezlh0) {
        Objects.requireNonNull(ezlh0);
        this.a = ezlh0;
        super();
    }

    @Override  // ohi
    public final boolean b(Preference preference0, Object object0) {
        ezlh ezlh0 = this.a;
        if(ezlh0.ag) {
            ezlh0.ag = false;
            ezbn ezbn0 = ezlh0.P();
            if(ezbn0 != null) {
                ccmp ccmp0 = new ccmp();
                ezbn0.e("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false);
                ezcf.a(ccmp0, bbdg.lz);
            }
            ezlh0.d.k(ezlh0.ag);
            return true;
        }
        if(bbqa.a()) {
            ezlh0.ah = fyhn.a(new ContextThemeWrapper(ezlh0.requireContext(), 0x7F160C70));  // style:Theme.GoogleMaterial3.DayNight.NoActionBar
            fyju fyju0 = new fyju(ezlh0.ah, 0x7F160DD5);  // style:ThemeOverlay.GoogleMaterial3.MaterialAlertDialog.Centered
            fyju0.N(0x7F150321);  // string:auth_trust_agent_dialog_on_body_detection_title "Keep in mind"
            fyju0.C(0x7F151B08);  // string:onbody_detection_disclaimer "On-body detection can\'t distinguish between 
                                  // you and someone else. If someone takes your device while it\'s been unlocked, they 
                                  // might be able to access it."
            fyju0.L(0x7F150815, new ezld(ezlh0));  // string:common_continue "Continue"
            fyju0.F(0x1040000, new ezle(ezlh0));
            fyju0.create().show();
            return false;
        }
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(ezlh0.ah);
        alertDialog$Builder0.setTitle(0x7F150321);  // string:auth_trust_agent_dialog_on_body_detection_title "Keep in mind"
        alertDialog$Builder0.setMessage(0x7F151B08);  // string:onbody_detection_disclaimer "On-body detection can\'t distinguish between 
                                                      // you and someone else. If someone takes your device while it\'s been unlocked, they 
                                                      // might be able to access it."
        alertDialog$Builder0.setPositiveButton(0x7F150815, new ezlf(ezlh0));  // string:common_continue "Continue"
        alertDialog$Builder0.setNegativeButton(0x1040000, new ezlg(ezlh0));
        alertDialog$Builder0.create().show();
        return false;
    }
}

