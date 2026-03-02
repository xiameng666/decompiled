import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Map;

public final class dcie implements evqf {
    public final NotificationChimeraBroadcastReceiver a;
    public final ShareTarget b;

    public dcie(NotificationChimeraBroadcastReceiver notificationChimeraBroadcastReceiver0, ShareTarget shareTarget0) {
        this.a = notificationChimeraBroadcastReceiver0;
        this.b = shareTarget0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        for(Object object1: ((Map)object0).keySet()) {
            ShareTarget shareTarget0 = (ShareTarget)object1;
            TransferMetadata transferMetadata0 = (TransferMetadata)((Map)object0).get(this.b);
            if(transferMetadata0 != null && !transferMetadata0.e) {
                this.a.a.c(shareTarget0);
            }
        }
    }
}

