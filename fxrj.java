import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;
import j..util.Objects;

final class fxrj implements Runnable {
    final PendingIntent a;
    final NearbyAlertRequest b;
    final fxrk c;

    public fxrj(fxrk fxrk0, PendingIntent pendingIntent0, NearbyAlertRequest nearbyAlertRequest0) {
        this.a = pendingIntent0;
        this.b = nearbyAlertRequest0;
        Objects.requireNonNull(fxrk0);
        this.c = fxrk0;
        super();
    }

    @Override
    public final void run() {
        fxrk fxrk0 = this.c;
        fxrk0.b = null;
        if(((long)fxrk0.c) < hzek.a.i().G()) {
            ++fxrk0.c;
            fxrk0.a(this.a, this.b);
        }
    }
}

