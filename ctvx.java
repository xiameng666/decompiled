import android.app.Notification;
import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ctvx implements ctws {
    public final Map a;
    public final Map b;
    public final bboh c;
    public final ctvw d;
    public NotificationListenerChimeraService e;
    private final Set f;

    public ctvx(ctvw ctvw0) {
        ibuq.f(ctvw0, "mirroredNotificationRenderer");
        super();
        this.d = ctvw0;
        this.f = new LinkedHashSet();
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = ctnb.a("NotificationSync", new ibuk(this.getClass()));
    }

    @Override  // ctws
    public final Object a(List list0, ibrl ibrl0) {
        return ibom.a;
    }

    @Override  // ctws
    public final Object b(ibrl ibrl0) {
        return ibom.a;
    }

    @Override  // ctws
    public final Object c(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        StatusBarNotification statusBarNotification1;
        Notification notification0 = statusBarNotification0.getNotification();
        ibuq.e(notification0, "getNotification(...)");
        if(!ctxi.a(notification0)) {
            NotificationListenerChimeraService notificationListenerChimeraService0 = this.e;
            Integer integer0 = null;
            if(notificationListenerChimeraService0 == null) {
                ibuq.j("localStatusBarNotificationManager");
                notificationListenerChimeraService0 = null;
            }
            StatusBarNotification[] arr_statusBarNotification = notificationListenerChimeraService0.i();
            for(int v = 0; true; ++v) {
                statusBarNotification1 = null;
                if(v >= arr_statusBarNotification.length) {
                    break;
                }
                statusBarNotification1 = arr_statusBarNotification[v];
                Notification notification1 = statusBarNotification1.getNotification();
                ibuq.e(notification1, "getNotification(...)");
                if(ctxi.a(notification1)) {
                    Notification notification2 = statusBarNotification1.getNotification();
                    ibuq.e(notification2, "getNotification(...)");
                    String s = ctwe.c(notification2);
                    Notification notification3 = statusBarNotification0.getNotification();
                    ibuq.e(notification3, "getNotification(...)");
                    if(ibuq.m(s, ctwe.c(notification3))) {
                        Notification notification4 = statusBarNotification1.getNotification();
                        ibuq.e(notification4, "getNotification(...)");
                        String s1 = ctwe.b(notification4);
                        Notification notification5 = statusBarNotification0.getNotification();
                        ibuq.e(notification5, "getNotification(...)");
                        if(ibuq.m(s1, ctwe.b(notification5))) {
                            break;
                        }
                    }
                }
            }
            if(statusBarNotification1 != null) {
                integer0 = new Integer(statusBarNotification1.getId());
            }
            if(integer0 != null) {
                Map map0 = this.a;
                ctwa ctwa0 = (ctwa)map0.get(integer0);
                if(ctwa0 != null) {
                    ctvz ctvz0 = new ctvz(ctwa0.a, ctwa0.b, ctwa0.c);
                    this.b.remove(ctvz0);
                }
                String s2 = statusBarNotification0.getTag();
                this.d.a(integer0.intValue(), s2);
                map0.remove(integer0);
                statusBarNotification0.getId();
            }
        }
        return ibom.a;
    }

    @Override  // ctws
    public final Object d(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        int v = statusBarNotification0.getId();
        Map map0 = this.a;
        ctwa ctwa0 = (ctwa)map0.get(new Integer(v));
        if(ctwa0 != null) {
            ctvz ctvz0 = new ctvz(ctwa0.a, ctwa0.b, ctwa0.c);
            this.b.remove(ctvz0);
            for(Object object0: this.f) {
                ((ctvy)object0).a();
            }
            map0.remove(new Integer(v));
        }
        return ibom.a;
    }

    public static final boolean e(StatusBarNotification statusBarNotification0, String s, String s1, String s2) {
        if(ibuq.m(statusBarNotification0.getPackageName(), s)) {
            Notification notification0 = statusBarNotification0.getNotification();
            ibuq.e(notification0, "getNotification(...)");
            if(ibuq.m(ctwe.c(notification0), s1)) {
                Notification notification1 = statusBarNotification0.getNotification();
                ibuq.e(notification1, "getNotification(...)");
                return ibuq.m(ctwe.b(notification1), s2);
            }
        }
        return false;
    }
}

