import android.hardware.biometrics.BiometricPrompt.Builder;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.security.Signature;

public final class blui extends du {
    public static final bboh a;
    public bluy b;

    static {
        blui.a = bnaa.e("BiometricPromptFragment");
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        Bundle bundle1 = this.getArguments();
        BiometricPrompt.Builder biometricPrompt$Builder0 = new BiometricPrompt.Builder(this.getContext()).setTitle(bundle1.getString("title")).setDescription(bundle1.getString("description"));
        biometricPrompt$Builder0.setAllowedAuthenticators(0x800F);
        CancellationSignal cancellationSignal0 = new CancellationSignal();
        cancellationSignal0.setOnCancelListener(new blug(this));
        bluh bluh0 = new bluh(this);
        gfsx gfsx0 = this.b.a;
        if(!gfsx0.i()) {
            biometricPrompt$Builder0.build().authenticate(cancellationSignal0, new bblp(1, 9), bluh0);
            return;
        }
        biometricPrompt$Builder0.build().authenticate(new BiometricPrompt.CryptoObject(((Signature)gfsx0.d())), cancellationSignal0, new bblp(1, 9), bluh0);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
        this.b = (bluy)new lso(((xnz)this.requireContext())).a(bluy.class);
    }
}

