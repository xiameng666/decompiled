import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;
import java.util.concurrent.TimeUnit;

public final class bpok implements gfsi {
    public final DeviceSyncService a;

    public bpok(DeviceSyncService deviceSyncService0) {
        this.a = deviceSyncService0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return Boolean.valueOf(!((gfsx)object0).i() || this.a.d.d().toEpochMilli() - hfyn.b(((hfwn)((gfsx)object0).d())) > TimeUnit.HOURS.toMillis(hsxv.x()));
    }
}

