import android.hardware.biometrics.BiometricPrompt.Builder;
import android.os.Bundle;
import android.os.CancellationSignal;

public final class bmta extends du {
    public static final bboh a;
    public bmuz b;
    public acp c;

    static {
        bmta.a = bnaa.a("PasskeysLockscreenFragment");
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        bmuz bmuz0 = (bmuz)new lso(((xnz)this.requireContext())).a(bmuz.class);
        this.b = bmuz0;
        bmuz0.l(blhf.av);
        BiometricPrompt.Builder biometricPrompt$Builder0 = new BiometricPrompt.Builder(this.requireContext());
        biometricPrompt$Builder0.setTitle("Use your screen lock");
        biometricPrompt$Builder0.setAllowedAuthenticators(0x8000);
        CancellationSignal cancellationSignal0 = new CancellationSignal();
        cancellationSignal0.setOnCancelListener(new bmsy(this));
        bmsz bmsz0 = new bmsz(this);
        biometricPrompt$Builder0.build().authenticate(cancellationSignal0, new bblp(1, 9), bmsz0);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.c = this.registerForActivityResult(new adu(), new bmsx(this));
    }
}

