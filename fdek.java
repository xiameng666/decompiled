import com.google.android.gms.wearable.consent.WearUsageAndDiagnosticsChimeraActivity;

public final class fdek implements evqc {
    public final Throwable a;

    public fdek(Throwable throwable0) {
        this.a = throwable0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        WearUsageAndDiagnosticsChimeraActivity.j.g("failed to get both opt in from data item and from usage reporting client possibly because of the watch set up by iOS companion", exception0, new Object[]{this.a});
    }
}

