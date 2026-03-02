import android.content.Context;
import android.hardware.biometrics.BiometricPrompt.Builder;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;

public final class ered extends erby {
    public erec ag;
    public alo ah;
    public cjbx ai;
    public int aj;
    private BiometricPrompt ak;
    public static final erqc d;

    static {
        ered.d = new erqc(new String[]{"UserVerificationFragment"});
    }

    public ered() {
        this.aj = 0;
    }

    public final void A(Context context0, cjbx cjbx0) {
        all all0;
        this.aj = 0;
        if(cjbx0 == null) {
            throw new IllegalStateException("gmsBiometricPrompt is null.");
        }
        if(cjbx.h(context0)) {
            all0 = cjbx.a(context0);
        }
        else {
            all0 = new all();
            all0.d = "Verify it\'s you";
            all0.f = "Unlock this device to copy your Google Accounts, settings, and more";
            all0.i = 0x80FF;
        }
        if(hyis.A() && jys.d()) {
            all0.a = 0x7F080493;  // drawable:googleg_standard_color_48_vd
            all0.c = "Device Setup";
        }
        cjbx0.e(all0.a());
    }

    public final void B(Context context0) {
        this.aj = 0;
        if(this.ak == null) {
            throw new IllegalStateException("Mandatory BiometricPrompt is null.");
        }
        ereb ereb0 = new ereb(this, context0);
        this.ak.authenticate(new CancellationSignal(), new bblp(1, 9), ereb0);
    }

    public static boolean C(Context context0) {
        return alh.c(context0).b(0x80FF) == 0;
    }

    public final boolean D() {
        if(hyis.o()) {
            Context context0 = this.getContext();
            batl.s(context0);
            return cjit.a(context0) == 0 && jys.d();
        }
        return false;
    }

    static void E(ered ered0) {
        ered0.aj = 2;
    }

    @Override  // eqor
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        try {
            this.ag = (erec)context0;
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Containing activity must implement UserVerificationFragment.Listener", classCastException0);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        ered.d.d("onCreate", new Object[0]);
        super.onCreate(bundle0);
        this.getParentFragmentManager().af("BiometricsCancelConfirmationFragmentResult", this, new erdu(this));
    }

    @Override  // du
    public final void onPause() {
        erqc erqc0 = ered.d;
        erqc0.d("onPause", new Object[0]);
        super.onPause();
        if((hyis.B() && this.ai != null || hyis.o() && this.ak != null) && (!hyis.t() || this.aj != 2)) {
            erqc0.d("Wait for onResume to show CancelConfirmationFragment", new Object[0]);
            this.aj = 1;
        }
    }

    @Override  // du
    public final void onResume() {
        erqc erqc0 = ered.d;
        erqc0.d("onResume", new Object[0]);
        super.onResume();
        if((hyis.B() && this.ai != null || hyis.o() && this.ak != null) && this.aj == 1) {
            erqc0.d("Showing CancelConfirmationFragment", new Object[0]);
            new erds().show(this.getParentFragmentManager(), "smartdevice.dialogfragment");
            if(hyis.t()) {
                this.aj = 2;
            }
        }
    }

    @Override  // eqor
    public final void onViewCreated(View view0, Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        Context context0 = this.getContext();
        batl.s(context0);
        if(hyis.B()) {
            if(ered.C(context0)) {
                cjbx cjbx0 = cjbx.b(this, new erdz(this));
                this.ai = cjbx0;
                this.A(context0, cjbx0);
                return;
            }
            this.ag.C(2);
            return;
        }
        if(this.D()) {
            Context context1 = this.getContext();
            batl.s(context1);
            BiometricPrompt.Builder biometricPrompt$Builder0 = new BiometricPrompt.Builder(context1).setAllowedAuthenticators(0x10000).setTitle("Verify it\'s you").setDescription("Identity Check is on and requires a biometric").setNegativeButton("Cancel", new bblp(1, 9), new erdv(this));
            if(hyis.A() && jys.d()) {
                biometricPrompt$Builder0.setLogoRes(0x7F080493);  // drawable:googleg_standard_color_48_vd
                biometricPrompt$Builder0.setLogoDescription("Device Setup");
            }
            this.ak = biometricPrompt$Builder0.build();
            this.B(context0);
            return;
        }
        if(ered.C(context0)) {
            erea erea0 = new erea(this);
            alo alo0 = new alo(this, new bblp(1, 9), erea0);
            this.ah = alo0;
            ered.z(context0, alo0);
            return;
        }
        this.ag.C(2);
    }

    public static void z(Context context0, alo alo0) {
        if(alo0 == null) {
            throw new IllegalStateException("Regular BiometricPrompt is null.");
        }
        all all0 = new all();
        all0.d = "Verify it\'s you";
        all0.f = "Unlock this device to copy your Google Accounts, settings, and more";
        all0.i = 0x80FF;
        if(hyis.A() && jys.d()) {
            all0.a = 0x7F080493;  // drawable:googleg_standard_color_48_vd
            all0.c = "Device Setup";
        }
        alo0.c(all0.a());
    }
}

