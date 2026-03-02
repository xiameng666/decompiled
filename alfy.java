import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class alfy extends cjtm {
    private final azxs a;
    private final PendingIntent b;
    private final DeviceFilter c;
    private final String d;
    private final azug e;

    static {
        alis.a("RegisterDeviceUpdates");
    }

    public alfy(azxs azxs0, PendingIntent pendingIntent0, DeviceFilter deviceFilter0, String s, azug azug0) {
        super(0x8E, "RegisterForSyncedDevicesUpdates", azug0);
        this.a = azxs0;
        this.b = pendingIntent0;
        this.c = deviceFilter0;
        this.d = s;
        this.e = azug0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        PendingIntent pendingIntent0 = this.b;
        String s = this.d;
        if(algb.a(pendingIntent0, s)) {
            List list0 = alft.b(context0, false, this.e);
            int v = list0 == null ? -1 : SyncedDevicesUpdateSubscription.c(list0, this.c);
            SyncedDevicesUpdateSubscription syncedDevicesUpdateSubscription0 = new SyncedDevicesUpdateSubscription(pendingIntent0, this.c, s, v);
            gmcd gmcd0 = algs.a().b(syncedDevicesUpdateSubscription0);
            try {
                Status status0 = (Status)gmcd0.get();
                this.a.a(status0);
                return;
            }
            catch(InterruptedException unused_ex) {
                throw new cjuh(14, "Interrupted while executing operation.");
            }
            catch(ExecutionException executionException0) {
                throw new RuntimeException(executionException0.getCause());
            }
        }
        this.a.a(Status.d);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

