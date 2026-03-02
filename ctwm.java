import android.service.notification.StatusBarNotification;
import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import java.util.Iterator;
import java.util.List;

public final class ctwm extends ibsl implements ibtw {
    Object a;
    int b;
    final NotificationListenerChimeraService c;

    public ctwm(NotificationListenerChimeraService notificationListenerChimeraService0, ibrl ibrl0) {
        this.c = notificationListenerChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctwm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctwm(this.c, ibrl0);
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
            StatusBarNotification[] arr_statusBarNotification = this.c.getActiveNotifications();
            ibuq.e(arr_statusBarNotification, "getActiveNotifications(...)");
            List list0 = ibpg.N(arr_statusBarNotification);
            this.a = object2;
            this.b = 1;
            if(((ctws)object3).a(list0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

