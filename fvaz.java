import android.location.GnssClock;
import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssMeasurementsEvent;
import android.os.SystemClock;
import j..util.Objects;

final class fvaz extends GnssMeasurementsEvent.Callback {
    final fvbb a;

    public fvaz(fvbb fvbb0) {
        Objects.requireNonNull(fvbb0);
        this.a = fvbb0;
        super();
    }

    @Override  // android.location.GnssMeasurementsEvent$Callback
    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent0) {
        this.a.g = true;
        gnssMeasurementsEvent0.getMeasurements();
        this.a.h.b = gnssMeasurementsEvent0;
        GnssClock gnssClock0 = gnssMeasurementsEvent0.getClock();
        this.a.h.a = gnssClock0 == null || !gnssClock0.hasElapsedRealtimeNanos() ? SystemClock.elapsedRealtimeNanos() : gnssClock0.getElapsedRealtimeNanos();
        this.a.p.run();
    }
}

