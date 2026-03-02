import android.location.GnssNavigationMessage.Callback;
import android.location.GnssNavigationMessage;
import android.os.SystemClock;
import j..util.Objects;

final class fvmw extends GnssNavigationMessage.Callback {
    final fvmy a;

    public fvmw(fvmy fvmy0) {
        Objects.requireNonNull(fvmy0);
        this.a = fvmy0;
        super();
    }

    @Override  // android.location.GnssNavigationMessage$Callback
    public final void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage0) {
        fvmy fvmy0 = this.a;
        if(fvmy0.i && !fvmy0.k()) {
            long v = SystemClock.elapsedRealtime();
            fvlk fvlk0 = new fvlk(fvmy0.m, gnssNavigationMessage0, v);
            fvmy0.m.post(fvlk0);
            fvmy0.i(fvns.r, v, null);
        }
    }

    @Override  // android.location.GnssNavigationMessage$Callback
    public final void onStatusChanged(int v) {
    }
}

