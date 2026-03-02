import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.places.NearbyAlertRequest;
import java.util.concurrent.ScheduledFuture;

public final class fxrk {
    public final bbku a;
    public ScheduledFuture b;
    public int c;
    public final fxrf d;

    public fxrk(Context context0) {
        fxrf fxrf0 = new fxrf(context0);
        bbll bbll0 = new bbll(1, 10);
        super();
        this.c = 0;
        this.d = fxrf0;
        this.a = bbll0;
    }

    final void a(PendingIntent pendingIntent0, NearbyAlertRequest nearbyAlertRequest0) {
        if(pendingIntent0 != null) {
            this.d.a().g(nearbyAlertRequest0, pendingIntent0).z(new fxri(this, pendingIntent0, nearbyAlertRequest0));
            return;
        }
        fxqw.f("Invalid parameters given. Not registering for nearby alerts");
    }
}

