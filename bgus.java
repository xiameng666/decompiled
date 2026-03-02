import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.settingslib.widget.MainSwitchPreference;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.crisisalerts.state.CrisisAlertsSystemStateChangeIntentOperation;
import com.google.android.gms.libs.layoutpreference.LayoutPreference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class bgus extends bgvd {
    public static WeakReference ag;
    public MainSwitchPreference ah;
    public LayoutPreference ai;
    public bgvx aj;
    public bgwf ak;
    public bgrt al;
    public Executor am;
    public Context an;
    public View ao;
    public TextView ap;
    public TextView aq;
    private LayoutPreference ar;
    private TextView as;
    public static final bboh d;

    static {
        bgus.d = bgrz.a("StngSilk");
        bgus.ag = new WeakReference(null);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.an = this.requireContext();
        this.H(0x7F19008E, s);  // xml:crisis_alerts_settings_silk
        MainSwitchPreference mainSwitchPreference0 = (MainSwitchPreference)this.iO(this.getString(0x7F150A90));  // string:crisis_alerts_settings_switch_key "Crisis Alerts Main Switch Key"
        this.ah = mainSwitchPreference0;
        if(mainSwitchPreference0 == null) {
            return;
        }
        gmbu.t(this.aj.b(), new bgul(this, mainSwitchPreference0), this.am);
        CrisisAlertsSystemStateChangeIntentOperation.b(() -> gmbu.t(this.ak.c(), new bgur(this), this.am));
        LayoutPreference layoutPreference0 = (LayoutPreference)this.iO(this.getString(0x7F150A82));  // string:crisis_alerts_details_key "Crisis Alerts Details Preference Key"
        gftb.check(layoutPreference0);
        this.ar = layoutPreference0;
        TextView textView0 = (TextView)layoutPreference0.k(0x7F0B17C4);  // id:learn_more
        this.as = textView0;
        textView0.setVisibility(8);
        int v = this.an.getResources().getConfiguration().uiMode & 0x30;
        this.as.setTextColor((v == 0x20 ? this.an.getColor(0x7F0606C2) : this.an.getColor(0x7F0606C7)));  // color:google_blue300
        this.as.setPaintFlags(8 | this.as.getPaintFlags());
        LayoutPreference layoutPreference1 = (LayoutPreference)this.iO(this.getString(0x7F150A91));  // string:crisis_alerts_settings_warning_box_key "Crisis Alerts Not Available Country 
                                                                                                     // Key"
        gftb.check(layoutPreference1);
        this.ai = layoutPreference1;
        this.ao = layoutPreference1.k(0x7F0B1067);  // id:crisis_alerts_system_state_warning_box
        this.ap = (TextView)this.ai.k(0x7F0B1069);  // id:crisis_alerts_warning_message_text
        this.aq = (TextView)this.ai.k(0x7F0B1068);  // id:crisis_alerts_warning_message_link
        this.K();
        CrisisAlertsSystemStateChangeIntentOperation.b(new bguj());
        bgus.ag = new WeakReference(this);
        this.al.g();
    }

    // Detected as a lambda impl.
    public final void K() {
        gmbu.t(this.ak.c(), new bgur(this), this.am);
    }

    public final void L(Runnable runnable0) {
        Context context0 = this.an;
        if((context0 instanceof Activity)) {
            ((Activity)context0).runOnUiThread(runnable0);
            return;
        }
        ((android.app.Activity)context0).runOnUiThread(runnable0);
    }
}

