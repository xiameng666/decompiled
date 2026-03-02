import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import j..util.Objects;

final class erlm extends BiometricPrompt.AuthenticationCallback {
    final xnz a;
    final erlr b;

    public erlm(erlr erlr0, xnz xnz0) {
        this.a = xnz0;
        Objects.requireNonNull(erlr0);
        this.b = erlr0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        erlr.a.m("Mandatory biometrics authentication error with code %d", new Object[]{v});
        if(v != 7 && v != 9) {
            this.b.b.C();
            return;
        }
        bbqv.a(new erll(this, this.a));
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        erlr.a.d("Mandatory biometrics authentication success", new Object[0]);
        erlp erlp0 = this.b.c;
        if(erlp0 != null) {
            erlp0.F(erlr.B(biometricPrompt$AuthenticationResult0.getAuthenticationType()));
        }
    }
}

