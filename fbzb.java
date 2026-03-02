import android.content.Context;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.os.CancellationSignal;

public final class fbzb {
    public final Context a;
    public final geuw b;
    final BiometricPrompt.CryptoObject c;
    CancellationSignal d;
    fbyx e;

    public fbzb(Context context0, BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0, geuw geuw0) {
        batl.c((geuw0.b & 2) != 0 && (geuw0.b & 16) != 0, "The title and negative button text need to bet set in biometricPromptForm.");
        this.a = context0;
        this.c = biometricPrompt$CryptoObject0;
        this.b = geuw0;
    }
}

