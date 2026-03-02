import android.content.Context;
import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import com.google.android.chimera.Activity;
import j..util.Objects;

final class ereb extends BiometricPrompt.AuthenticationCallback {
    final Context a;
    final ered b;

    public ereb(ered ered0, Context context0) {
        this.a = context0;
        Objects.requireNonNull(ered0);
        this.b = ered0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        super.onAuthenticationError(v, charSequence0);
        erqc erqc0 = ered.d;
        erqc0.d("Mandatory Biometrics authentication error: %d-%s", new Object[]{v, charSequence0});
        if(v == 10) {
            ered ered0 = this.b;
            if(ered0.aj == 0) {
                erqc0.d("Showing CancelConfirmationFragment", new Object[0]);
                new erds().show(ered0.getParentFragmentManager(), "smartdevice.dialogfragment");
                if(hyis.t()) {
                    ered.E(ered0);
                }
            }
            return;
        }
        if(v != 7 && v != 9) {
            erdt erdt0 = new erdt(this.b, this.a);
            ((Activity)this.a).runOnUiThread(erdt0);
            return;
        }
        erdw erdw0 = new erdw(this.b, this.a);
        ((Activity)this.a).runOnUiThread(erdw0);
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        super.onAuthenticationSucceeded(biometricPrompt$AuthenticationResult0);
        ered.d.d("Mandatory Biometrics successfully validated", new Object[0]);
        this.b.ag.C(0);
    }
}

