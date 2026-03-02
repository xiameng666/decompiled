import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.Builder;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class alo {
    public fm a;

    public alo(du du0, ali ali0) {
        if(du0 == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if(ali0 == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        fm fm0 = du0.getChildFragmentManager();
        alo.e(du0, ((amj)new lso(du0).a(amj.class)));
        this.f(fm0, du0, ali0, null);
    }

    public alo(du du0, Executor executor0, ali ali0) {
        if(du0 == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if(executor0 == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        fm fm0 = du0.getChildFragmentManager();
        alo.e(du0, ((amj)new lso(du0).a(amj.class)));
        this.f(fm0, du0, ali0, executor0);
    }

    public static amf a(fm fm0) {
        return (amf)fm0.h("androidx.biometric.internal.BiometricFragment");
    }

    public static amj b(du du0, boolean z) {
        ea ea0 = z ? du0.getActivity() : null;
        if(ea0 == null) {
            ea0 = du0.getParentFragment();
        }
        if(ea0 != null) {
            return (amj)new lso(ea0).a(amj.class);
        }
        throw new IllegalStateException("view model not found");
    }

    public final void c(alm alm0) {
        if(alm0 == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        this.d(alm0, null);
    }

    public final void d(alm alm0, alk alk0) {
        fm fm0 = this.a;
        if(fm0 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if(!fm0.au()) {
            amf amf0 = alo.a(fm0);
            boolean z = false;
            if(amf0 == null) {
                amf0 = new amf();
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("host_activity", false);
                amf0.setArguments(bundle0);
                ca ca0 = new ca(this.a);
                ca0.v(amf0, "androidx.biometric.internal.BiometricFragment");
                ca0.b();
                this.a.aq();
            }
            amf0.a.c = alm0;
            amf0.a.p();
            amj amj0 = amf0.a;
            amj0.o = alh.c(amf0.requireContext()).d();
            amj0.p();
            amf0.a.d = alk0;
            amf0.a.p();
            amj amj1 = amf0.a;
            KeyguardManager keyguardManager0 = null;
            amj1.h = null;
            if(!amj1.i) {
                if(amf0.getContext() == null) {
                    Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
                    return;
                }
                amj1.i = true;
                amj1.j = true;
                Context context0 = amf0.getContext();
                if(context0 != null && context0.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    Context context1 = amf0.getContext();
                    if(context1 != null) {
                        keyguardManager0 = (KeyguardManager)context1.getSystemService(KeyguardManager.class);
                    }
                    if(keyguardManager0 == null) {
                        amf0.A(12, amf0.getString(0x7F151333));  // string:generic_error_no_keyguard "This device does not support PIN, pattern, or 
                                                                 // password."
                        return;
                    }
                    CharSequence charSequence0 = amf0.a.g();
                    CharSequence charSequence1 = amf0.a.f();
                    CharSequence charSequence2 = amf0.a.c();
                    if(charSequence1 == null) {
                        charSequence1 = charSequence2;
                    }
                    Intent intent0 = alz.a(keyguardManager0, charSequence0, charSequence1);
                    if(intent0 == null) {
                        amf0.A(14, amf0.getString(0x7F151332));  // string:generic_error_no_device_credential "No PIN, pattern, or password set."
                        return;
                    }
                    amf0.a.k = true;
                    intent0.setFlags(0x8080000);
                    amf0.startActivityForResult(intent0, 1);
                    return;
                }
                BiometricPrompt.Builder biometricPrompt$Builder0 = ama.a(amf0.requireContext().getApplicationContext());
                CharSequence charSequence3 = amf0.a.g();
                CharSequence charSequence4 = amf0.a.f();
                CharSequence charSequence5 = amf0.a.c();
                if(charSequence3 != null) {
                    ama.h(biometricPrompt$Builder0, charSequence3);
                }
                if(charSequence4 != null) {
                    ama.g(biometricPrompt$Builder0, charSequence4);
                }
                if(charSequence5 != null) {
                    ama.e(biometricPrompt$Builder0, charSequence5);
                }
                CharSequence charSequence6 = amf0.a.e();
                if(!TextUtils.isEmpty(charSequence6)) {
                    Executor executor0 = amf0.a.h();
                    amj amj2 = amf0.a;
                    if(amj2.f == null) {
                        amj2.f = new ami(amj2);
                    }
                    ama.f(biometricPrompt$Builder0, charSequence6, executor0, amj2.f);
                }
                alm alm1 = amf0.a.c;
                if(alm1 == null || alm1.h) {
                    z = true;
                }
                amb.a(biometricPrompt$Builder0, z);
                amc.a(biometricPrompt$Builder0, amf0.a.p);
                if(Build.VERSION.SDK_INT >= 35) {
                    alm alm2 = amf0.a.c;
                    int v = alm2 == null ? -1 : alm2.a;
                    Bitmap bitmap0 = alm2 == null ? null : alm2.b;
                    String s = alm2 == null ? null : alm2.c;
                    amf0.a.h();
                    amj amj3 = amf0.a;
                    if(amj3.g == null) {
                        amj3.g = new amh(amj3);
                    }
                    if(v != -1) {
                        amd.d(biometricPrompt$Builder0, v);
                    }
                    if(bitmap0 != null) {
                        amd.b(biometricPrompt$Builder0, bitmap0);
                    }
                    if(s != null && !s.isEmpty()) {
                        amd.c(biometricPrompt$Builder0, s);
                    }
                }
                BiometricPrompt biometricPrompt0 = ama.b(biometricPrompt$Builder0);
                Context context2 = amf0.getContext();
                alk alk1 = amf0.a.d;
                if(alk1 != null) {
                    Cipher cipher0 = alk1.b;
                    if(cipher0 == null) {
                        Signature signature0 = alk1.a;
                        if(signature0 == null) {
                            Mac mac0 = alk1.c;
                            if(mac0 == null) {
                                IdentityCredential identityCredential0 = alk1.d;
                                if(identityCredential0 != null) {
                                    keyguardManager0 = new BiometricPrompt.CryptoObject(identityCredential0);
                                }
                                else if(Build.VERSION.SDK_INT >= 33) {
                                    PresentationSession presentationSession0 = alk1.e;
                                    if(presentationSession0 != null) {
                                        keyguardManager0 = new BiometricPrompt.CryptoObject(presentationSession0);
                                        goto label_119;
                                    }
                                    goto label_115;
                                }
                                else {
                                label_115:
                                    if(Build.VERSION.SDK_INT >= 35) {
                                        long v1 = alk1.f;
                                        if(v1 != 0L) {
                                            keyguardManager0 = new BiometricPrompt.CryptoObject(v1);
                                        }
                                    }
                                }
                            }
                            else {
                                keyguardManager0 = new BiometricPrompt.CryptoObject(mac0);
                            }
                        }
                        else {
                            keyguardManager0 = new BiometricPrompt.CryptoObject(signature0);
                        }
                    }
                    else {
                        keyguardManager0 = new BiometricPrompt.CryptoObject(cipher0);
                    }
                }
            label_119:
                amv amv0 = amf0.a.b();
                if(amv0.a == null) {
                    amv0.a = new CancellationSignal();
                }
                CancellationSignal cancellationSignal0 = amv0.a;
                ame ame0 = new ame();
                amj amj4 = amf0.a;
                if(amj4.e == null) {
                    amj4.e = new amr(new amq(amj4));
                }
                amr amr0 = amj4.e;
                if(amr0.a == null) {
                    amr0.a = new amp(amr0.b);
                }
                try {
                    BiometricPrompt.AuthenticationCallback biometricPrompt$AuthenticationCallback0 = amr0.a;
                    if(keyguardManager0 == null) {
                        ama.c(biometricPrompt0, cancellationSignal0, ame0, biometricPrompt$AuthenticationCallback0);
                        return;
                    }
                    ama.d(biometricPrompt0, ((BiometricPrompt.CryptoObject)keyguardManager0), cancellationSignal0, ame0, biometricPrompt$AuthenticationCallback0);
                    return;
                }
                catch(NullPointerException nullPointerException0) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", nullPointerException0);
                    amf0.A(1, (context2 == null ? "" : "Unknown error"));
                }
            }
            return;
        }
        Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
    }

    private static void e(du du0, amj amj0) {
        du0.getLifecycle().c(new aln(amj0));
    }

    private final void f(fm fm0, lsq lsq0, ali ali0, Executor executor0) {
        amj amj0 = (amj)new lso(lsq0).a(amj.class);
        this.a = fm0;
        if(executor0 != null) {
            amj0.a = executor0;
        }
        amj0.b = ali0;
    }
}

