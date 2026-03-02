import com.google.android.location.reporting.state.update.ReportingConfig;
import j..util.Objects;

final class fxsi implements Runnable {
    final fxsk a;

    public fxsi(fxsk fxsk0) {
        Objects.requireNonNull(fxsk0);
        this.a = fxsk0;
        super();
    }

    @Override
    public final void run() {
        fxqw.c("GCoreUlr", "Starting scheduled upload task");
        ReportingConfig reportingConfig0 = this.a.c.d();
        this.a.d(reportingConfig0, null);
    }
}

