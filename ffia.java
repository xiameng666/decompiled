import android.util.Log;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import j..util.Objects;

final class ffia extends ffee {
    final fdiy c;
    final fflv d;

    public ffia(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getCloudSyncSetting");
    }

    @Override  // ffee
    public final void a() {
        try {
            boolean z = this.d.t.B();
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "CloudSync setting is enabled: " + z);
            }
            GetCloudSyncSettingResponse getCloudSyncSettingResponse0 = new GetCloudSyncSettingResponse(0, z);
            this.c.y(getCloudSyncSettingResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getCloudSyncSetting: exception during processing", exception0);
            GetCloudSyncSettingResponse getCloudSyncSettingResponse1 = new GetCloudSyncSettingResponse(8, false);
            this.c.y(getCloudSyncSettingResponse1);
        }
    }
}

