import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;
import java.util.Iterator;
import java.util.Map;

final class ctvk implements icih {
    final ctvm a;

    public ctvk(ctvm ctvm0) {
        this.a = ctvm0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctvt ctvt0 = ((ctvi)object0).a;
        cuaq cuaq0 = ((ctvi)object0).b;
        ctvm ctvm0 = this.a;
    alab1:
        switch(cuap.a(cuaq0.b).ordinal()) {
            case 0: {
                hfuo hfuo0 = (cuaq0.b == 1 ? ((cuaw)cuaq0.c) : cuaw.a).b;
                ibuq.e(hfuo0, "getNotificationsList(...)");
                for(Object object1: hfuo0) {
                    NotificationListenerChimeraService notificationListenerChimeraService0 = ctvm0.f;
                    if(notificationListenerChimeraService0 == null) {
                        ibuq.j("notificationListenerServiceCallback");
                        notificationListenerChimeraService0 = null;
                    }
                    ibuq.c(((cuao)object1));
                    notificationListenerChimeraService0.c(ctvt0, ((cuao)object1));
                }
                return ibom.a;
            }
            case 1: {
                break;
            }
            case 2: {
                hfuo hfuo1 = (cuaq0.b == 3 ? ((cuar)cuaq0.c) : cuar.a).b;
                ibuq.e(hfuo1, "getNotificationsList(...)");
                for(Object object2: hfuo1) {
                    NotificationListenerChimeraService notificationListenerChimeraService1 = ctvm0.f;
                    if(notificationListenerChimeraService1 == null) {
                        ibuq.j("notificationListenerServiceCallback");
                        notificationListenerChimeraService1 = null;
                    }
                    ibuq.c(((cuao)object2));
                    notificationListenerChimeraService1.c(ctvt0, ((cuao)object2));
                }
                return ibom.a;
            }
            case 3: {
                hfuo hfuo2 = (cuaq0.b == 4 ? ((cuas)cuaq0.c) : cuas.a).b;
                ibuq.e(hfuo2, "getNotificationsList(...)");
                Iterator iterator2 = hfuo2.iterator();
                while(true) {
                    if(!iterator2.hasNext()) {
                        break alab1;
                    }
                    Object object3 = iterator2.next();
                    NotificationListenerChimeraService notificationListenerChimeraService2 = ctvm0.f;
                    if(notificationListenerChimeraService2 == null) {
                        ibuq.j("notificationListenerServiceCallback");
                        notificationListenerChimeraService2 = null;
                    }
                    int v = ((cuav)object3).d;
                    String s = ((cuav)object3).e;
                    ctvx ctvx0 = notificationListenerChimeraService2.j();
                    ctvz ctvz0 = new ctvz(ctvt0.a, v, s);
                    Map map0 = ctvx0.b;
                    Integer integer0 = (Integer)map0.get(ctvz0);
                    if(integer0 == null) {
                        continue;
                    }
                    int v1 = (int)integer0;
                    Map map1 = ctvx0.a;
                    Object object4 = map1.get(integer0);
                    if(object4 == null) {
                        throw new IllegalStateException("Invariant violation: No metadata found for localId " + v1);
                    }
                    ctvx0.d.a(((ctwa)object4).d, ((ctwa)object4).c);
                    map1.remove(integer0);
                    map0.remove(ctvz0);
                    continue;
                }
            }
            default: {
                ((ggtj)ctvm0.b.j()).B("Unsupported notification sync message event: %s", cuap.a(cuaq0.b));
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

