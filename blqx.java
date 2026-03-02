import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import j..util.Objects;
import java.util.Locale;

final class blqx extends BiometricPrompt.AuthenticationCallback {
    final bnaj a;
    final bnae b;
    final blrs c;

    public blqx(blqy blqy0, bnaj bnaj0, bnae bnae0, blrs blrs0) {
        this.a = bnaj0;
        this.b = bnae0;
        this.c = blrs0;
        Objects.requireNonNull(blqy0);
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        this.a.b(this.b, blgt.B);
        if(v == 10) {
            bmbz bmbz0 = new bmbz("The flow was cancelled");
            this.c.a(bmbz0);
            return;
        }
        bmby bmby0 = new bmby(String.format(Locale.US, "User authentication failed [%d]: %s ", v, charSequence0));
        this.c.a(bmby0);
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        this.a.b(this.b, blgt.A);
        this.c.b(bmhg.f);
    }
}

