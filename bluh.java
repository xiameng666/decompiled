import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import j..util.Objects;

final class bluh extends BiometricPrompt.AuthenticationCallback {
    final blui a;

    public bluh(blui blui0) {
        Objects.requireNonNull(blui0);
        this.a = blui0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        ((ggtj)blui.a.h()).z("Authentication Error %d.", v);
        this.a.b.c.ii(new blux((v == 5 || v == 10 ? 16 : 8)));
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        ((ggtj)blui.a.h()).x("Authentication Success, continue key signing.");
        switch(biometricPrompt$AuthenticationResult0.getAuthenticationType()) {
            case 1: {
                this.a.b.c.ii(new blux(1, null));
                return;
            }
            case 2: {
                this.a.b.c.ii(new blux(2, null));
            }
        }
    }
}

