import android.util.Log;
import com.google.android.gms.wearable.consent.WearUsageAndDiagnosticsChimeraActivity;

public final class fdeh implements evpo {
    public final WearUsageAndDiagnosticsChimeraActivity a;
    public final ffco b;

    public fdeh(WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity0, ffco ffco0) {
        this.a = wearUsageAndDiagnosticsChimeraActivity0;
        this.b = ffco0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        Object object0;
        fdbf fdbf0 = this.a.a();
        if(!ffgp.m()) {
            throw new IllegalStateException("updateOptInConsentOnWatch should be called from watch only");
        }
        ffco ffco0 = this.b;
        if(fdci.b()) {
            if(Log.isLoggable("wearable.ConsentRecord", 3)) {
                Log.d("wearable.ConsentRecord", "ConsentsPerWatch is enabled, checking watch specific consents exits");
            }
            object0 = fdbf0.b.g().g(new fdbb(fdbf0)).e(new fdbc(fdbf0, ffco0));
        }
        else {
            if(Log.isLoggable("wearable.ConsentRecord", 3)) {
                Log.d("wearable.ConsentRecord", "ConsentsPerWatch is not enabled, updating global consents");
            }
            object0 = fdbf0.g(ffco0);
        }
        ((evql)object0).A(new fdef());
        return object0;
    }
}

