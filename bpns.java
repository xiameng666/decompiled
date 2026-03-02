import com.google.android.gms.findmydevice.spot.suw.SetupWizardChimeraActivity;
import java.util.concurrent.Executor;

public final class bpns implements Runnable {
    public final SetupWizardChimeraActivity a;
    public final gged_interceptors b;
    public final gged_interceptors c;
    public final Executor d;

    public bpns(SetupWizardChimeraActivity setupWizardChimeraActivity0, gged_interceptors gged0, gged_interceptors gged1, Executor executor0) {
        this.a = setupWizardChimeraActivity0;
        this.b = gged0;
        this.c = gged1;
        this.d = executor0;
    }

    @Override
    public final void run() {
        frag frag0 = fraf.a(this.a, this.a.l);
        int v = frad.a(this.a.k.a(), true);
        gmbu.t(frag0.a(frae.d, this.b, this.c, ggna.a, ggna.a, v), new bpoh(this.a), this.d);
    }
}

