import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import j..util.Objects;

public final class crmn implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final crni a;

    public crmn(crni crni0) {
        this.a = crni0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(!Objects.equals(s, "IABTCF_TCString") && !Objects.equals(s, "IABTCF_gdprApplies") && !Objects.equals(s, "IABTCF_EnableAdvertiserConsentMode")) {
            return;
        }
        this.a.aJ().k.a("IABTCF_TCString change picked up in listener.");
        crdj crdj0 = this.a.k;
        batl.s(crdj0);
        crdj0.c(500L);
    }
}

