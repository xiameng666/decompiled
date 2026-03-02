import android.util.Log;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import j..util.Objects;

final class ffhw extends ffee {
    final fdiy c;
    final fflv d;

    public ffhw(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getCloudSyncOptInStatus");
    }

    @Override  // ffee
    public final void a() {
        try {
            fceh fceh0 = this.d.t.a();
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", a.ab(fceh0, "CloudSync opt in/out status: "));
            }
            GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse0 = new GetCloudSyncOptInStatusResponse(0, fceh0.a, fceh0.b);
            this.c.x(getCloudSyncOptInStatusResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getCloudSyncOptInStatus: exception during processing", exception0);
            GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse1 = new GetCloudSyncOptInStatusResponse(8, false, false);
            this.c.x(getCloudSyncOptInStatusResponse1);
        }
    }
}

