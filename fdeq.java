import com.google.android.gms.wearable.consent.WearUsageAndDiagnosticsChimeraActivity;
import j..util.Objects;

final class fdeq implements bbrx {
    final ffco a;
    final String b;
    final WearUsageAndDiagnosticsChimeraActivity c;

    public fdeq(WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity0, ffco ffco0, String s) {
        this.a = ffco0;
        this.b = s;
        Objects.requireNonNull(wearUsageAndDiagnosticsChimeraActivity0);
        this.c = wearUsageAndDiagnosticsChimeraActivity0;
        super();
    }

    @Override  // bbrx
    public final void a(boolean z) {
        WearUsageAndDiagnosticsChimeraActivity wearUsageAndDiagnosticsChimeraActivity0 = this.c;
        if(wearUsageAndDiagnosticsChimeraActivity0.m == null) {
            wearUsageAndDiagnosticsChimeraActivity0.m = new bblp(1, 10);
        }
        wearUsageAndDiagnosticsChimeraActivity0.m.execute(new fdep(this, this.a, z, this.b));
    }
}

