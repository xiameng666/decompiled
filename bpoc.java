import com.google.android.gms.findmydevice.spot.suw.SetupWizardChimeraActivity;
import com.google.android.setupdesign.items.RadioButtonItem;

public final class bpoc implements gahg {
    public final SetupWizardChimeraActivity a;

    public bpoc(SetupWizardChimeraActivity setupWizardChimeraActivity0) {
        this.a = setupWizardChimeraActivity0;
    }

    @Override  // gahg
    public final void a(boolean z) {
        if(z) {
            RadioButtonItem radioButtonItem0 = this.a.o;
            gftb.check(radioButtonItem0);
            radioButtonItem0.h(false);
            this.a.m.c(true);
            this.a.m(gtas.e);
        }
    }
}

