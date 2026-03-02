import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt.Builder;
import android.os.Bundle;
import android.os.CancellationSignal;

public class erlr extends du {
    public static final baun a;
    private String ag;
    erlq b;
    erlp c;
    private boolean d;

    static {
        erlr.a = new erqc(new String[]{"Setup", "UI", "LockScreenFragment"});
    }

    public static boolean A(Context context0) {
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        return keyguardManager0 != null && !keyguardManager0.isKeyguardSecure();
    }

    public static final int B(int v) {
        if(v != 1 && v != 2) {
            erlr.a.m("Unknown biometric auth result type: %d", new Object[]{v});
            return 0;
        }
        return 1;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        baun baun0 = erlr.a;
        baun0.d("onActivityResult, requestCode: %d", new Object[]{v});
        super.onActivityResult(v, v1, intent0);
        if(v == 5) {
            if(v1 == -1) {
                baun0.d("Successfully verified via lockscreen", new Object[0]);
                this.b.E();
                return;
            }
            baun0.m("User skipped lock screen", new Object[0]);
            this.b.D();
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        du du0 = this.getParentFragment();
        if((du0 instanceof erlq)) {
            this.b = (erlq)du0;
            if((du0 instanceof erlp)) {
                this.c = (erlp)du0;
            }
        }
        else {
            try {
                this.b = (erlq)context0;
                if((context0 instanceof erlp)) {
                    this.c = (erlp)context0;
                }
            }
            catch(ClassCastException classCastException0) {
                throw new RuntimeException("Containing activity must implement LockScreenFragment.Listener", classCastException0);
            }
        }
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        boolean z = false;
        if(bbqa.d() && ((xnz)this.getContext()) != null) {
            erlr.a.d("Apply new transition in Android U+", new Object[0]);
        }
        super.onCreate(bundle0);
        if(bundle0 != null && bundle0.getBoolean("lockscreenShown")) {
            z = true;
        }
        this.d = z;
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        this.ag = bundle1.getString("lockScreenText", this.getString(0x7F152E5C));  // string:smartdevice_d2d_lockscreen_description "Unlock to continue setting up your 
                                                                                    // device"
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        erlr.a.d("onResume", new Object[0]);
        if(this.d) {
            this.d = false;
            this.b.E();
        }
    }

    @Override  // du
    public void onSaveInstanceState(Bundle bundle0) {
        erlr.a.d("onSaveInstanceState", new Object[0]);
        bundle0.putBoolean("lockscreenShown", this.d);
    }

    protected final void z() {
        all all0;
        baun baun0 = erlr.a;
        baun0.d("preparing to lock device", new Object[0]);
        this.b.kF();
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 == null) {
            baun0.m("activity not attached", new Object[0]);
            return;
        }
        hygx hygx0 = hygx.a;
        if(hygx0.b().A()) {
            baun0.d("Locking device with GmsBiometricPrompt", new Object[0]);
            cjbx cjbx0 = cjbx.b(this, new erlj(this));
            if(cjbx.h(xnz0)) {
                all0 = cjbx.a(xnz0);
            }
            else {
                all0 = new all();
                all0.d = "Verify it\'s you";
                all0.f = this.ag;
                all0.i = 0x80FF;
            }
            if(hyis.A() && jys.d()) {
                all0.a = 0x7F080493;  // drawable:googleg_standard_color_48_vd
                all0.c = this.getString(0x7F152E38);  // string:smartdevice_application_label "Device Setup"
            }
            cjbx0.e(all0.a());
            return;
        }
        if(hygx0.b().m() && jys.d() && this.c != null) {
            int v = cjit.a(xnz0);
            baun0.d("Mandatory biometrics status is %d", new Object[]{v});
            if(v == 0) {
                new BiometricPrompt.Builder(xnz0).setAllowedAuthenticators(0x10000).setTitle("Verify it\'s you").setDescription("Identity Check is on and requires a biometric").setLogoRes(0x7F080493).setLogoDescription(this.getString(0x7F152E38)).setNegativeButton(this.getString(0x7F1507F2), new bblp(1, 9), new erli(this)).build().authenticate(new CancellationSignal(), new bblp(1, 9), new erlm(this, xnz0));  // drawable:googleg_standard_color_48_vd
                return;
            }
            if(v == 7 || v == 9) {
                cjit.d(xnz0, new erlg(this)).show();
                return;
            }
            if(v != 20 && v != 21) {
                cjit.c(xnz0, new erlh(this)).show();
                return;
            }
        }
        if(hygx0.b().z() && this.c != null) {
            baun0.d("Locking device with AndroidX library", new Object[0]);
            all all1 = new all();
            all1.d = this.getString(0x7F152EDC);  // string:smartdevice_user_verification_title "Verify it\'s you"
            all1.f = this.ag;
            all1.i = 0x80FF;
            if(hyis.A() && jys.d()) {
                all1.a = 0x7F080493;  // drawable:googleg_standard_color_48_vd
                all1.c = this.getString(0x7F152E38);  // string:smartdevice_application_label "Device Setup"
            }
            new alo(this, new bblp(1, 9), new erln(this)).c(all1.a());
            return;
        }
        Context context0 = this.getContext();
        if(context0 != null) {
            BiometricManager biometricManager0 = (BiometricManager)context0.getSystemService(BiometricManager.class);
            if(biometricManager0 != null && biometricManager0.canAuthenticate() == 0 && this.c != null) {
                baun0.d("locking screen on R+ device.", new Object[0]);
                new BiometricPrompt.Builder(xnz0).setAllowedAuthenticators(0x800F).setTitle(this.ag).setDescription(this.ag).build().authenticate(new CancellationSignal(), new bblp(1, 10), new erlo(this));
                return;
            }
        }
        baun0.d("locking screen on L+ device", new Object[0]);
        KeyguardManager keyguardManager0 = (KeyguardManager)xnz0.getSystemService("keyguard");
        if(keyguardManager0 != null) {
            Intent intent0 = keyguardManager0.createConfirmDeviceCredentialIntent(null, this.ag);
            if(intent0 != null) {
                this.startActivityForResult(intent0, 5);
                if(bbqa.d()) {
                    baun0.d("Apply new transition in Android U+", new Object[0]);
                    gaiy.b(xnz0.getContainerActivity(), 2);
                    return;
                }
                xnz0.overridePendingTransition(0x7F0100C2, 0x7F0100C3);  // anim:slide_next_in
                return;
            }
            baun0.f("Received null intent from KeyguardManager.", new Object[0]);
            this.b.C();
            return;
        }
        baun0.f("Keyguard manager was null.", new Object[0]);
        this.b.C();
    }
}

