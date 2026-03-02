import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import j..util.Objects;

public final class ezbt extends BiometricPrompt.AuthenticationCallback {
    final Intent a;
    final ConfirmUserCredentialAndStartChimeraActivity b;

    public ezbt(ConfirmUserCredentialAndStartChimeraActivity confirmUserCredentialAndStartChimeraActivity0, Intent intent0) {
        this.a = intent0;
        Objects.requireNonNull(confirmUserCredentialAndStartChimeraActivity0);
        this.b = confirmUserCredentialAndStartChimeraActivity0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        super.onAuthenticationError(v, charSequence0);
        this.b.finish();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        this.b.k.b(this.a);
    }
}

