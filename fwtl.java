import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssMeasurementsEvent;

public final class fwtl extends GnssMeasurementsEvent.Callback {
    private GnssMeasurementsEvent a;

    public fwtl() {
        this.a = null;
    }

    public final GnssMeasurementsEvent a() {
        GnssMeasurementsEvent gnssMeasurementsEvent0;
        synchronized(this) {
            gnssMeasurementsEvent0 = this.a;
            this.a = null;
        }
        return gnssMeasurementsEvent0;
    }

    @Override  // android.location.GnssMeasurementsEvent$Callback
    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent0) {
        synchronized(this) {
            this.a = gnssMeasurementsEvent0;
        }
    }
}

