import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;
import java.util.Map;

final class ctwk implements icih {
    final NotificationListenerChimeraService a;

    public ctwk(NotificationListenerChimeraService notificationListenerChimeraService0) {
        this.a = notificationListenerChimeraService0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(((Map)object0).get(ctnl.c) == ctnm.d) {
            NotificationListenerChimeraService notificationListenerChimeraService0 = this.a;
            if(!ctxh.b(notificationListenerChimeraService0.a())) {
                throw new IllegalStateException("Check failed.");
            }
            synchronized(notificationListenerChimeraService0) {
                if(notificationListenerChimeraService0.d) {
                    return ibom.a;
                }
                ctxc ctxc0 = notificationListenerChimeraService0.k();
                ctxc0.b = notificationListenerChimeraService0;
                if(ctxc0.a != null) {
                    notificationListenerChimeraService0.d();
                    NotificationSyncChimeraService notificationSyncChimeraService0 = ctxc0.a;
                    if(notificationSyncChimeraService0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    notificationSyncChimeraService0.m(notificationListenerChimeraService0);
                    notificationListenerChimeraService0.d = true;
                    return ibom.a;
                }
                notificationListenerChimeraService0.d = true;
            }
            return ibom.a;
        }
        this.a.f();
        return ibom.a;
    }
}

