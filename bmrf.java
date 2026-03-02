import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.hardware.biometrics.BiometricPrompt.Builder;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;

public final class bmrf extends du {
    public static final bnaj a;
    public blrs b;
    public bnae c;

    static {
        bmrf.a = bnai.b(AppContextProvider.a());
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        String s;
        super.onActivityCreated(bundle0);
        Context context0 = this.getContext();
        bmuz bmuz0 = (bmuz)new lso(((xnz)this.requireContext())).a(bmuz.class);
        if(bmuz0.u.i()) {
            s = this.getString(0x7F151165, new Object[]{bmuz0.q});  // string:fido_lock_screen_prompt_passkey_creation_description "Create passkey for 
                                                                    // %1$s"
        }
        else {
            s = bmuz0.p == null || !bmuz0.p.b().i() ? null : this.getString(0x7F151166, new Object[]{bmuz0.q});  // string:fido_lock_screen_prompt_passkey_sign_in_description "Use passkey for %1$s"
        }
        this.z(blgt.D);
        KeyguardManager keyguardManager0 = (KeyguardManager)this.getContext().getSystemService("keyguard");
        if(s == null) {
            s = this.getContext().getString(0x7F1511DF, new Object[]{this.getArguments().getCharSequence("caller_name")});  // string:fido_verify_your_identity_description "%s needs to verify it\'s you."
        }
        int v = cjit.a(context0);
        if(v == 0) {
            if(jys.d() && hsvj.c()) {
                BiometricPrompt biometricPrompt0 = new BiometricPrompt.Builder(context0).setTitle("Use your screen lock").setDescription(s).setAllowedAuthenticators(0x18000).setConfirmationRequired(true).setLogoBitmap(BitmapFactory.decodeResource(context0.getResources(), 0x7F080402)).build();  // drawable:fido_lock
                CancellationSignal cancellationSignal0 = new CancellationSignal();
                cancellationSignal0.setOnCancelListener(new bmrb(this));
                biometricPrompt0.authenticate(cancellationSignal0, new bblp(1, 9), new bmre(this));
                return;
            }
            v = 0;
        }
        if(v != 7 && v != 9 || !hsvj.c()) {
            Intent intent0 = keyguardManager0.createConfirmDeviceCredentialIntent("Use your screen lock", s);
            if(intent0 != null && this.isAdded()) {
                this.startActivityForResult(intent0, 10);
            }
            return;
        }
        ((xnz)this.getContext()).runOnUiThread(() -> cjit.d(this.getContext(), new bmra(this)).show());
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 10) {
            if(v1 == -1) {
                this.z(blgt.E);
                this.b.b(bmhg.g);
                return;
            }
            this.z(blgt.F);
            this.b.a(new bmby("Lock screen credential verification failed"));
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
    }

    // Detected as a lambda impl.
    public final void y() {
        cjit.d(this.getContext(), new bmra(this)).show();
    }

    private final void z(blgt blgt0) {
        bnae bnae0 = this.c;
        if(bnae0 != null) {
            bmrf.a.b(bnae0, blgt0);
        }
    }
}

