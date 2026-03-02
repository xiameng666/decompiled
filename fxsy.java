import com.google.android.location.reporting.service.ReportingAndroidChimeraService;
import j..util.Objects;

public final class fxsy implements Runnable {
    final ReportingAndroidChimeraService a;

    public fxsy(ReportingAndroidChimeraService reportingAndroidChimeraService0) {
        Objects.requireNonNull(reportingAndroidChimeraService0);
        this.a = reportingAndroidChimeraService0;
        super();
    }

    @Override
    public final void run() {
        fxva.g(this.a);
        this.a.a = fxtr.b(this.a);
        this.a.b = fxtt.a(this.a);
    }
}

