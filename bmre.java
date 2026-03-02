import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import j..util.Objects;
import java.util.Locale;

final class bmre extends BiometricPrompt.AuthenticationCallback {
    final bmrf a;

    public bmre(bmrf bmrf0) {
        Objects.requireNonNull(bmrf0);
        this.a = bmrf0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        bmrf bmrf0 = this.a;
        bmrf.a.b(bmrf0.c, blgt.B);
        if(v == 10) {
            bmrf0.b.a(new bmbz("The flow was cancelled"));
            return;
        }
        if(v != 7 && v != 9) {
            bmrf0.b.a(new bmby(String.format(Locale.US, "User authentication failed [%d]: %s ", v, charSequence0)));
            return;
        }
        ((xnz)bmrf0.getContext()).runOnUiThread(new bmrd(this));
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        bmrf.a.b(this.a.c, blgt.A);
        this.a.b.b(bmhg.f);
    }
}

