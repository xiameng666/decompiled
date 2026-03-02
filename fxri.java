import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class fxri implements evpz {
    final PendingIntent a;
    final NearbyAlertRequest b;
    final fxrk c;

    public fxri(fxrk fxrk0, PendingIntent pendingIntent0, NearbyAlertRequest nearbyAlertRequest0) {
        this.a = pendingIntent0;
        this.b = nearbyAlertRequest0;
        Objects.requireNonNull(fxrk0);
        this.c = fxrk0;
        super();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(evql0.n()) {
            this.c.c = 0;
            return;
        }
        fxqw.f("Registration for Nearby Alerts failed.");
        fxrk fxrk0 = this.c;
        if(fxrk0.b == null) {
            fxqw.c("GCoreUlr", a.D(hzek.h(), "Retrying again in ", " seconds"));
            fxrj fxrj0 = new fxrj(fxrk0, this.a, this.b);
            long v = hzek.h();
            fxrk0.b = fxrk0.a.g(fxrj0, v, TimeUnit.SECONDS);
        }
    }
}

