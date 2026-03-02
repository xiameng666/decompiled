import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssMeasurementsEvent;
import android.os.SystemClock;
import j..util.Objects;

final class fvmv extends GnssMeasurementsEvent.Callback {
    final fvmy a;

    public fvmv(fvmy fvmy0) {
        Objects.requireNonNull(fvmy0);
        this.a = fvmy0;
        super();
    }

    @Override  // android.location.GnssMeasurementsEvent$Callback
    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent0) {
        fvmy fvmy0 = this.a;
        if(fvmy0.h && !fvmy0.k()) {
            long v = SystemClock.elapsedRealtime();
            fvlj fvlj0 = new fvlj(fvmy0.m, gnssMeasurementsEvent0, v);
            fvmy0.m.post(fvlj0);
            fvmy0.i(fvns.q, v, null);
        }
    }

    @Override  // android.location.GnssMeasurementsEvent$Callback
    public final void onStatusChanged(int v) {
    }
}

