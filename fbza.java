import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import android.os.Bundle;
import j..util.Objects;

final class fbza extends BiometricPrompt.AuthenticationCallback {
    final fbzb a;

    public fbza(fbzb fbzb0) {
        Objects.requireNonNull(fbzb0);
        this.a = fbzb0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        super.onAuthenticationError(v, charSequence0);
        switch(v) {
            case 5: 
            case 10: {
                fbyx fbyx1 = this.a.e;
                if(fbyx1 != null) {
                    fbyx1.at = false;
                    fbyx1.W(false);
                    if(fbyx1.as) {
                        fbyx1.T(19, Bundle.EMPTY);
                        return;
                    }
                }
                break;
            }
            case 1: 
            case 7: 
            case 11: 
            case 12: {
                fbyx fbyx0 = this.a.e;
                if(fbyx0 != null) {
                    fbyx0.L();
                    return;
                }
                break;
            }
        }
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        super.onAuthenticationSucceeded(biometricPrompt$AuthenticationResult0);
        fbzb fbzb0 = this.a;
        fbyx fbyx0 = fbzb0.e;
        if(fbyx0 != null) {
            fbyx0.V(4, (fbzb0.c == null ? null : fbzb0.c.getSignature()));
        }
    }
}

