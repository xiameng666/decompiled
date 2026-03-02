import android.content.ComponentName;
import j..util.Objects;

final class crou implements Runnable {
    final croy a;

    public crou(croy croy0) {
        Objects.requireNonNull(croy0);
        this.a = croy0;
        super();
    }

    @Override
    public final void run() {
        this.a.c.v(new ComponentName(this.a.c.aj(), (this.a.c.al().a ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService")));
    }
}

