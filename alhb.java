import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class alhb extends cjtm {
    private final azxs a;
    private final PendingIntent b;
    private final DeviceFilter c;
    private final String d;

    static {
        alis.a("UnregisterDeviceUpdates");
    }

    public alhb(azxs azxs0, PendingIntent pendingIntent0, DeviceFilter deviceFilter0, String s, azug azug0) {
        super(0x8E, "UnregisterForSyncedDevicesUpdates", azug0);
        this.a = azxs0;
        this.b = pendingIntent0;
        this.c = deviceFilter0;
        this.d = s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        PendingIntent pendingIntent0 = this.b;
        String s = this.d;
        if(!algb.a(pendingIntent0, s)) {
            this.a.a(Status.d);
            return;
        }
        SyncedDevicesUpdateSubscription syncedDevicesUpdateSubscription0 = new SyncedDevicesUpdateSubscription(pendingIntent0, this.c, s, -1);
        gmcd gmcd0 = algs.a().d(syncedDevicesUpdateSubscription0);
        try {
            Status status0 = (Status)gmcd0.get();
            this.a.a(status0);
        }
        catch(InterruptedException unused_ex) {
            throw new cjuh(14, "Interrupted while executing operation.");
        }
        catch(ExecutionException executionException0) {
            throw new RuntimeException(executionException0.getCause());
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

