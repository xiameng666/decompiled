import android.app.PendingIntent;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationAssigningIntentOperation;

public final class boyn implements glzn {
    public final LocationAssigningIntentOperation a;

    public boyn(LocationAssigningIntentOperation locationAssigningIntentOperation0) {
        this.a = locationAssigningIntentOperation0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        LocationAssigningIntentOperation locationAssigningIntentOperation0 = this.a;
        synchronized(locationAssigningIntentOperation0.d.b) {
        }
        if(locationAssigningIntentOperation0.d.d == 0) {
            bpaz bpaz0 = locationAssigningIntentOperation0.e;
            synchronized(bpaz0.b) {
                if(!bpaz0.c()) {
                    return gmbx.a;
                }
                PendingIntent pendingIntent0 = boxr.a(bpaz0.g, "NoPowerSightingsLocationUpdate");
                if(pendingIntent0 == null) {
                    return gmbx.a;
                }
                bpaz0.f.e(pendingIntent0);
                bpaz0.d = gfqx.a;
            }
            return gmbx.a;
        }
        return gmbx.a;
    }
}

