import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;

public final class ctwx extends ibsl implements ibtw {
    int a;
    final NotificationSyncChimeraService b;
    final StatusBarNotification c;
    final NotificationListenerService.RankingMap d;

    public ctwx(NotificationSyncChimeraService notificationSyncChimeraService0, StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        this.b = notificationSyncChimeraService0;
        this.c = statusBarNotification0;
        this.d = notificationListenerService$RankingMap0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctwx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctwx(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctye ctye0 = this.b.n();
            this.a = 1;
            if(ctye0.d(this.c, this.b.f, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

