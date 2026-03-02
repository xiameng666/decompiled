import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Bundle;
import android.provider.Settings.Secure;
import androidx.preference.Preference;
import com.google.android.gms.chimera.modules.significant.places.AppContextProvider;

public final class epmo extends skp {
    private Preference ag;
    private final boolean ah;
    public Preference d;

    public epmo() {
        boolean z;
        if(hzcr.c()) {
            AppContextProvider.a();
            z = true;
        }
        else {
            z = false;
        }
        this.ah = z;
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.H(0x7F190105, s);  // xml:significant_places_trusted_places_settings
        Preference preference0 = this.iO("mandatory_biometrics");
        gfuy.e(preference0);
        this.ag = preference0;
        Context context0 = this.requireContext();
        Preference preference1 = null;
        if(hxjc.c() && jys.d()) {
            BiometricManager biometricManager0 = (BiometricManager)context0.getSystemService(BiometricManager.class);
            try {
                biometricManager0.canAuthenticate(0x10000);
            }
            catch(SecurityException unused_ex) {
                goto label_18;
            }
            if(jys.d()) {
                BiometricManager biometricManager1 = (BiometricManager)context0.getSystemService("biometric");
                if(biometricManager1 != null && biometricManager1.canAuthenticate(15) != 12) {
                    Preference preference2 = this.ag;
                    if(preference2 == null) {
                        ibuq.j("mandatoryBiometricPreference");
                        preference2 = null;
                    }
                    preference2.o = new epmk(this);
                    goto label_23;
                }
            }
            goto label_18;
        }
        else {
        label_18:
            Preference preference3 = this.ag;
            if(preference3 == null) {
                ibuq.j("mandatoryBiometricPreference");
                preference3 = null;
            }
            preference3.T(false);
        }
    label_23:
        Preference preference4 = this.iO("extend_unlock");
        gfuy.e(preference4);
        this.d = preference4;
        if(preference4 == null) {
            ibuq.j("extendUnlockPreference");
            preference4 = null;
        }
        preference4.T(this.ah);
        if(this.ah) {
            Preference preference5 = this.d;
            if(preference5 == null) {
                ibuq.j("extendUnlockPreference");
            }
            else {
                preference1 = preference5;
            }
            preference1.o = new epml(this);
        }
        this.K();
    }

    private final void K() {
        int v = Settings.Secure.getInt(this.requireContext().getContentResolver(), "mandatory_biometrics", 0);
        Preference preference0 = this.ag;
        if(preference0 == null) {
            ibuq.j("mandatoryBiometricPreference");
            preference0 = null;
        }
        preference0.n((v == 1 ? this.getString(0x7F1508A9) : this.getString(0x7F1508A6)));  // string:common_on "On"
        Preference preference1 = this.d;
        if(preference1 == null) {
            ibuq.j("extendUnlockPreference");
            preference1 = null;
        }
        preference1.n(this.getString(0x7F1508A6));  // string:common_off "Off"
        if(!this.ah) {
            return;
        }
        new azts(this.requireContext(), null).ch().b(new epmn(new epmm(this)));
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.K();
    }
}

