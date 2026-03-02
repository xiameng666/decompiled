import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import com.google.android.gms.wallet.ui.common.FingerprintButton;
import j..util.Objects;

public final class fbzi extends FingerprintManager.AuthenticationCallback {
    final FingerprintButton a;

    public fbzi(FingerprintButton fingerprintButton0) {
        Objects.requireNonNull(fingerprintButton0);
        this.a = fingerprintButton0;
        super();
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        super.onAuthenticationError(v, charSequence0);
        if(v == 5) {
            return;
        }
        FingerprintButton fingerprintButton0 = this.a;
        fingerprintButton0.d = null;
        fingerprintButton0.b(charSequence0.toString());
        fbyx fbyx0 = fingerprintButton0.l;
        if(fbyx0 != null) {
            fbyx0.N();
        }
        gcfz.s(fingerprintButton0.g, (fingerprintButton0.f.c == null ? gewg.a : fingerprintButton0.f.c).d, 4);
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        FingerprintButton fingerprintButton0 = this.a;
        fingerprintButton0.requestFocus();
        fingerprintButton0.h = null;
        fingerprintButton0.e(2);
        fbyx fbyx0 = fingerprintButton0.l;
        if(fbyx0 != null) {
            fbyx0.N();
        }
        gcfz.s(fingerprintButton0.g, (fingerprintButton0.f.c == null ? gewg.a : fingerprintButton0.f.c).d, 3);
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult fingerprintManager$AuthenticationResult0) {
        super.onAuthenticationSucceeded(fingerprintManager$AuthenticationResult0);
        this.a.d = null;
        this.a.requestFocus();
        this.a.h = null;
        this.a.e(1);
        gcfz.s(this.a.g, (this.a.f.c == null ? gewg.a : this.a.f.c).d, 2);
    }
}

