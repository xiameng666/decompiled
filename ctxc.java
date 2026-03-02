import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;
import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;
import java.util.List;

public final class ctxc implements ctws {
    public NotificationSyncChimeraService a;
    public NotificationListenerChimeraService b;
    private final bboh c;

    public ctxc() {
        this.c = ctnb.a("NotificationSync", new ibuk(this.getClass()));
        ibuq.e(AppContextProvider.b(), "getApplicationContext(...)");
    }

    @Override  // ctws
    public final Object a(List list0, ibrl ibrl0) {
        NotificationSyncChimeraService notificationSyncChimeraService0 = this.a;
        if(notificationSyncChimeraService0 != null) {
            Object object0 = notificationSyncChimeraService0.a(list0, ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // ctws
    public final Object b(ibrl ibrl0) {
        NotificationSyncChimeraService notificationSyncChimeraService0 = this.a;
        if(notificationSyncChimeraService0 == null) {
            ((ggtj)this.c.j()).x("NotificationSyncChimeraService is not bound.");
            return ibom.a;
        }
        Object object0 = notificationSyncChimeraService0.b(ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // ctws
    public final Object c(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        statusBarNotification0.getKey();
        NotificationSyncChimeraService notificationSyncChimeraService0 = this.a;
        if(notificationSyncChimeraService0 == null) {
            ((ggtj)this.c.j()).x("NotificationSyncChimeraService is not bound.");
            return ibom.a;
        }
        Object object0 = notificationSyncChimeraService0.c(statusBarNotification0, notificationListenerService$RankingMap0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    @Override  // ctws
    public final Object d(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        statusBarNotification0.getKey();
        NotificationSyncChimeraService notificationSyncChimeraService0 = this.a;
        if(notificationSyncChimeraService0 == null) {
            ((ggtj)this.c.j()).x("NotificationSyncChimeraService is not bound.");
            return ibom.a;
        }
        Object object0 = notificationSyncChimeraService0.d(statusBarNotification0, notificationListenerService$RankingMap0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

