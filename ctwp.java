import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import java.util.Iterator;

public final class ctwp extends ibsl implements ibtw {
    Object a;
    int b;
    final NotificationListenerChimeraService c;
    final StatusBarNotification d;
    final NotificationListenerService.RankingMap e;

    public ctwp(NotificationListenerChimeraService notificationListenerChimeraService0, StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        this.c = notificationListenerChimeraService0;
        this.d = statusBarNotification0;
        this.e = notificationListenerService$RankingMap0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctwp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctwp(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            object2 = this.c.b().iterator();
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            this.a = object2;
            this.b = 1;
            if(((ctws)object3).c(this.d, this.e, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

