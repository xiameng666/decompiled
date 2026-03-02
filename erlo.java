import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import j..util.Objects;

final class erlo extends BiometricPrompt.AuthenticationCallback {
    final erlr a;

    public erlo(erlr erlr0) {
        Objects.requireNonNull(erlr0);
        this.a = erlr0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        erlr.a.d("onAuthenticationError(%d, %s)", new Object[]{v, String.valueOf(charSequence0)});
        this.a.b.C();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        Object[] arr_object = {biometricPrompt$AuthenticationResult0.getAuthenticationType()};
        erlr.a.d("onAuthenticationSucceeded(result type = %d)", arr_object);
        erlp erlp0 = this.a.c;
        if(erlp0 != null) {
            erlp0.F(erlr.B(biometricPrompt$AuthenticationResult0.getAuthenticationType()));
        }
    }
}

