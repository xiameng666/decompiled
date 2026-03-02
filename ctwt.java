import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;
import java.util.Map;

final class ctwt implements icih {
    final NotificationSyncChimeraService a;

    public ctwt(NotificationSyncChimeraService notificationSyncChimeraService0) {
        this.a = notificationSyncChimeraService0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(((Map)object0).get(ctnl.c) == ctnm.d) {
            NotificationSyncChimeraService notificationSyncChimeraService0 = this.a;
            if(!ctxh.b(notificationSyncChimeraService0.i())) {
                throw new IllegalStateException("Check failed.");
            }
            synchronized(notificationSyncChimeraService0) {
                if(notificationSyncChimeraService0.h) {
                    return ibom.a;
                }
                ibrt ibrt0 = notificationSyncChimeraService0.b;
                if(ibrt0 == null) {
                    ibuq.j("hostCoroutineContext");
                    ibrt0 = null;
                }
                notificationSyncChimeraService0.e = iccl.b(ibrt0);
                ctxc ctxc0 = notificationSyncChimeraService0.l();
                if(ctxc0.a == null) {
                    ctxc0.a = notificationSyncChimeraService0;
                    NotificationListenerChimeraService notificationListenerChimeraService0 = ctxc0.b;
                    if(notificationListenerChimeraService0 != null) {
                        if(ctxc0.a == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        notificationListenerChimeraService0.d();
                        NotificationSyncChimeraService notificationSyncChimeraService1 = ctxc0.a;
                        if(notificationSyncChimeraService1 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        NotificationListenerChimeraService notificationListenerChimeraService1 = ctxc0.b;
                        if(notificationListenerChimeraService1 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        notificationSyncChimeraService1.m(notificationListenerChimeraService1);
                    }
                    ((ggtj)notificationSyncChimeraService0.g.h()).x("NotificationSyncChimeraService registered successfully.");
                    if(ctxh.c(notificationSyncChimeraService0.f)) {
                        icck icck0 = notificationSyncChimeraService0.e;
                        if(icck0 == null) {
                            ibuq.j("hostCoroutineScope");
                            icck0 = null;
                        }
                        icbb.b(icck0, null, null, new ctwz(notificationSyncChimeraService0, null), 3);
                    }
                    notificationSyncChimeraService0.h = true;
                }
                else {
                    ((ggtj)notificationSyncChimeraService0.g.j()).x("Failed to register NotificationSyncChimeraService.");
                }
            }
            return ibom.a;
        }
        this.a.j();
        return ibom.a;
    }
}

