import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt.Builder;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.PromptContentView;
import android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

public final class byor {
    public static final boolean a(Context context0, byon byon0, ibth ibth0, ibts ibts0, byan byan0, ibth ibth1, ibth ibth2, ibtx ibtx0, bxzv bxzv0, ibts ibts1, ibth ibth3, ibts ibts2) {
        ibth ibth4;
        Integer integer0;
        byos byos1;
        boolean z;
        byos byos0;
        try {
            int v = byon0.e.b;
            if(v == 0x8000) {
                Log.w("BiometricHandler", "Invalid state, only requested device credentials, falling back to 2-tap flow.");
                byos0 = new byos(true, 2, null);
            }
            else {
                BiometricManager biometricManager0 = (BiometricManager)context0.getSystemService("biometric");
                if(biometricManager0 == null) {
                    Log.w("BiometricHandler", "Biometric manager is null, falling back to 2-tap flow.");
                    byos0 = new byos(true, 2, null);
                }
                else {
                    hufl.i();
                    Log.i("BiometricHandler", "The identity single tap flow is being attempted.");
                    if(hufl.a.c().q()) {
                        try {
                            if(hufl.i()) {
                                z = cjbx.h(context0);
                            }
                            else {
                                int v1 = biometricManager0.canAuthenticate(0x10000);
                                z = (v1 == 21 ? 0 : 1) & (v1 == 20 ? 0 : 1);
                            }
                            if(z) {
                                integer0 = biometricManager0.canAuthenticate(v | 0x10000);
                                goto label_25;
                            }
                            else {
                                goto label_37;
                            }
                            goto label_38;
                        }
                        catch(SecurityException unused_ex) {
                            Log.w("BiometricHandler", "The Identity Check feature is not supported.");
                            goto label_33;
                        }
                    label_25:
                        if(integer0 == null) {
                            byos1 = null;
                            goto label_38;
                        label_37:
                            byos1 = null;
                        }
                        else if(((int)integer0) != 0) {
                        label_33:
                            byos1 = null;
                        }
                        else if(byor.b(biometricManager0)) {
                            Log.w("BiometricHandler", "Biometric manager only supports at most device credentials, falling back to the 2-tap flow.");
                            byos1 = new byos(true, 2, null);
                        }
                        else {
                            byos1 = new byos(false, v | 0x10000);
                        }
                    }
                    else {
                        integer0 = null;
                        goto label_25;
                    }
                label_38:
                    if(byos1 == null) {
                        Log.i("BiometricHandler", "The normal single tap flow is being used.");
                        if(biometricManager0.canAuthenticate(v) != 0) {
                            Log.w("BiometricHandler", "Biometric manager cannot authenticate, falling back to the 2-tap flow.");
                            byos0 = new byos(true, 2, null);
                        }
                        else if(byor.b(biometricManager0)) {
                            Log.w("BiometricHandler", "Biometric manager only supports at most device credentials, falling back to the 2-tap flow.");
                            byos0 = new byos(true, 2, null);
                        }
                        else {
                            byos0 = new byos(false, v);
                        }
                    }
                    else {
                        byos0 = byos1;
                    }
                }
            }
            if(!byos0.a) {
                int v2 = byos0.b;
                byoo byoo0 = new byoo(ibth0);
                PromptContentViewWithMoreOptionsButton.Builder promptContentViewWithMoreOptionsButton$Builder0 = new PromptContentViewWithMoreOptionsButton.Builder().setMoreOptionsButtonListener(context0.getMainExecutor(), byoo0);
                ibuq.e(promptContentViewWithMoreOptionsButton$Builder0, "setMoreOptionsButtonListener(...)");
                String s = byon0.d;
                if(s != null) {
                    promptContentViewWithMoreOptionsButton$Builder0.setDescription(s);
                }
                BiometricPrompt.Builder biometricPrompt$Builder0 = new BiometricPrompt.Builder(context0).setTitle(byon0.c).setAllowedAuthenticators(v2).setConfirmationRequired(true).setLogoBitmap(byon0.a).setLogoDescription(byon0.b).setContentView(((PromptContentView)promptContentViewWithMoreOptionsButton$Builder0.build()));
                ibuq.e(biometricPrompt$Builder0, "setContentView(...)");
                byap byap0 = byon0.e;
                if(byap0.b != 0x800F && byap0.b != 0x80FF) {
                    ibth4 = ibth1;
                    biometricPrompt$Builder0.setNegativeButton("Cancel", context0.getMainExecutor(), new byop(ibth4));
                }
                else {
                    ibth4 = ibth1;
                }
                CharSequence charSequence0 = byon0.f;
                if(charSequence0 != null) {
                    biometricPrompt$Builder0.setSubtitle(charSequence0);
                }
                BiometricPrompt biometricPrompt0 = biometricPrompt$Builder0.build();
                ibuq.e(biometricPrompt0, "build(...)");
                byoq byoq0 = new byoq(ibts2, ibtx0, bxzv0, ibts1, ibth3, v2, ibth4);
                CancellationSignal cancellationSignal0 = (CancellationSignal)ibth2.a();
                Executor executor0 = context0.getMainExecutor();
                ibuq.e(executor0, "getMainExecutor(...)");
                Long long0 = byap0.a;
                if(long0 != null) {
                    BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0 = new BiometricPrompt.CryptoObject(((long)long0));
                    if(cancellationSignal0 == null) {
                        cancellationSignal0 = new CancellationSignal();
                    }
                    biometricPrompt0.authenticate(biometricPrompt$CryptoObject0, cancellationSignal0, executor0, byoq0);
                    return true;
                }
                if(cancellationSignal0 == null) {
                    cancellationSignal0 = new CancellationSignal();
                }
                biometricPrompt0.authenticate(cancellationSignal0, executor0, byoq0);
                return true;
            }
            ibts0.a(byan0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.w("BiometricHandler", "Calling the biometric prompt API failed with: /n" + illegalArgumentException0.getLocalizedMessage() + "\n");
            ibts0.a(byan0);
        }
        return false;
    }

    private static final boolean b(BiometricManager biometricManager0) {
        return biometricManager0.canAuthenticate(0xFF) != 0 && biometricManager0.canAuthenticate(15) != 0;
    }
}

