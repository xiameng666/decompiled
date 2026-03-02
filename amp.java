import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.os.Build.VERSION;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class amp extends BiometricPrompt.AuthenticationCallback {
    final amq a;

    public amp(amq amq0) {
        this.a = amq0;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        WeakReference weakReference0 = this.a.a;
        if(weakReference0.get() != null && !((amj)weakReference0.get()).k && ((amj)weakReference0.get()).j) {
            ((amj)weakReference0.get()).i(new amt(v, charSequence0));
        }
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference0 = this.a.a;
        if(weakReference0.get() != null && ((amj)weakReference0.get()).j) {
            ((amj)weakReference0.get()).j(true);
        }
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationHelp(int v, CharSequence charSequence0) {
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        alk alk0 = null;
        if(biometricPrompt$AuthenticationResult0 != null) {
            BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0 = biometricPrompt$AuthenticationResult0.getCryptoObject();
            if(biometricPrompt$CryptoObject0 != null) {
                Cipher cipher0 = biometricPrompt$CryptoObject0.getCipher();
                if(cipher0 == null) {
                    Signature signature0 = biometricPrompt$CryptoObject0.getSignature();
                    if(signature0 == null) {
                        Mac mac0 = biometricPrompt$CryptoObject0.getMac();
                        if(mac0 == null) {
                            IdentityCredential identityCredential0 = biometricPrompt$CryptoObject0.getIdentityCredential();
                            if(identityCredential0 != null) {
                                alk0 = new alk(identityCredential0);
                            }
                            else if(Build.VERSION.SDK_INT >= 33) {
                                PresentationSession presentationSession0 = biometricPrompt$CryptoObject0.getPresentationSession();
                                if(presentationSession0 != null) {
                                    alk0 = new alk(presentationSession0);
                                    goto label_29;
                                }
                                goto label_25;
                            }
                            else {
                            label_25:
                                if(Build.VERSION.SDK_INT >= 35) {
                                    long v = biometricPrompt$CryptoObject0.getOperationHandle();
                                    if(v != 0L) {
                                        alk0 = new alk(v);
                                    }
                                }
                            }
                        }
                        else {
                            alk0 = new alk(mac0);
                        }
                    }
                    else {
                        alk0 = new alk(signature0);
                    }
                }
                else {
                    alk0 = new alk(cipher0);
                }
            }
        }
    label_29:
        int v1 = -1;
        alj alj0 = new alj(alk0, (biometricPrompt$AuthenticationResult0 == null ? -1 : biometricPrompt$AuthenticationResult0.getAuthenticationType()));
        WeakReference weakReference0 = this.a.a;
        if(weakReference0.get() != null && ((amj)weakReference0.get()).j) {
            if(alj0.b == -1) {
                alk alk1 = alj0.a;
                int v2 = ((amj)weakReference0.get()).p;
                if((v2 & 0x7FFF) != 0 && !ams.b(v2)) {
                    v1 = 2;
                }
                alj0 = new alj(alk1, v1);
            }
            ((amj)weakReference0.get()).k(alj0);
        }
    }
}

