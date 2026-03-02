import android.util.Log;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import j..util.Objects;

final class ffhv extends ffee {
    final fdiy c;
    final fflv d;

    public ffhv(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getCloudSyncOptInOutDone");
    }

    @Override  // ffee
    public final void a() {
        try {
            boolean z = this.d.t.A();
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "CloudSync opt in/out is done: " + z);
            }
            GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse0 = new GetCloudSyncOptInOutDoneResponse(0, z);
            this.c.w(getCloudSyncOptInOutDoneResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getCloudSyncOptInOutDone: exception during processing", exception0);
            GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse1 = new GetCloudSyncOptInOutDoneResponse(8, false);
            this.c.w(getCloudSyncOptInOutDoneResponse1);
        }
    }
}

