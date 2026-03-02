import android.location.GnssStatus.Callback;
import android.location.Location;
import j..util.Objects;

final class fvyl extends GnssStatus.Callback {
    final fvym a;

    public fvyl(fvym fvym0) {
        Objects.requireNonNull(fvym0);
        this.a = fvym0;
        super();
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onFirstFix(int v) {
        fvym fvym0 = this.a;
        synchronized(fvym0.a) {
            fvym0.f = v;
            Location location0 = fvym0.h;
            if(location0 != null) {
                fvym0.e(location0);
            }
        }
    }

    @Override  // android.location.GnssStatus$Callback
    public final void onStarted() {
        fvym fvym0 = this.a;
        Location location0 = fvym0.c.getLastKnownLocation("gps");
        if(location0 != null) {
            synchronized(fvym0.a) {
                fvym0.g = location0.getElapsedRealtimeNanos();
            }
        }
    }
}

