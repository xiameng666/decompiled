import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import j..util.Objects;

final class ezkh implements SharedPreferences.OnSharedPreferenceChangeListener {
    public ezkh(ezki ezki0) {
        Objects.requireNonNull(ezki0);
        super();
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(s.equals("onbody_already_set")) {
            boolean z = false;
            ezki ezki0 = ezki.d();
            Object object0 = ezki0.b;
            synchronized(object0) {
                if(ezki0.d.getBoolean("onbody_already_set", false) || ezki0.d.getBoolean("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false)) {
                    z = true;
                }
                ezki0.c = z;
            }
            ezki0.e();
        }
    }
}

