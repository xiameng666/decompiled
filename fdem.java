import com.google.android.gms.wearable.consent.WearUsageAndDiagnosticsChimeraActivity;
import java.util.concurrent.Callable;

public final class fdem implements Callable {
    public final WearUsageAndDiagnosticsChimeraActivity a;

    public fdem(WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity0) {
        this.a = wearUsageAndDiagnosticsChimeraActivity0;
    }

    @Override
    public final Object call() {
        fdbf fdbf0 = this.a.a();
        if(ffgp.m()) {
            return (ffco)evrg.n(fdbf0.b.g().g(new fdba(fdbf0)));
        }
        throw new IllegalStateException("readOptinConsentOnWatch should be called from watch only");
    }
}

