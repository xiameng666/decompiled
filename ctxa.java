import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;
import jeb.synthetic.FIN;

public final class ctxa extends ibsl implements ibtw {
    final NotificationSyncChimeraService a;
    final NotificationListenerChimeraService b;

    public ctxa(NotificationSyncChimeraService notificationSyncChimeraService0, NotificationListenerChimeraService notificationListenerChimeraService0, ibrl ibrl0) {
        this.a = notificationSyncChimeraService0;
        this.b = notificationListenerChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctxa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctxa(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ((ggtj)this.a.g.h()).x("Running Client Host");
        ctvm ctvm0 = this.a.k();
        if(hvns.c() && ctxh.a(ctvm0.d)) {
            __monitor_enter(ctvm0);
            int v = FIN.finallyOpen$NT();
            NotificationListenerChimeraService notificationListenerChimeraService0 = this.b;
            if(ctvm0.c != null) {
                ctvm0.f = notificationListenerChimeraService0;
                FIN.finallyExec$NT(v);
                return ibom.a;
            }
            ctvm0.c = iccl.b(ctvm0.a);
            ctvm0.f = notificationListenerChimeraService0;
            icck icck0 = ctvm0.c;
            if(icck0 != null) {
                icbb.b(icck0, null, null, new ctvj(ctvm0, null), 3);
                icck icck1 = ctvm0.c;
                if(icck1 != null) {
                    icbb.b(icck1, null, null, new ctvl(ctvm0, null), 3);
                    FIN.finallyCodeBegin$NT(v);
                    return ibom.a;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        return ibom.a;
    }
}

