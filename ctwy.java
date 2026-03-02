import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;
import j..util.DesugarCollections;
import java.util.List;

public final class ctwy extends ibsl implements ibtw {
    int a;
    final NotificationSyncChimeraService b;
    final StatusBarNotification c;
    final NotificationListenerService.RankingMap d;

    public ctwy(NotificationSyncChimeraService notificationSyncChimeraService0, StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        this.b = notificationSyncChimeraService0;
        this.c = statusBarNotification0;
        this.d = notificationListenerService$RankingMap0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctwy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctwy(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            StatusBarNotification statusBarNotification0 = this.c;
            ctye ctye0 = this.b.n();
            this.a = 1;
            if(ctye.c(this.b.f)) {
                synchronized(ctye0) {
                    ((ggtj)ctye0.a.h()).B("Notification removed: %s", statusBarNotification0);
                }
                icmn icmn0 = ctye0.b;
                cuaz cuaz0 = cuay.a(((ProtoLiteMessage)cuaq.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuas.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                List list0 = DesugarCollections.unmodifiableList(((cuas)hftp0.b_message).b);
                ibuq.e(list0, "getNotificationsList(...)");
                new hfxu(list0);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cuav.a).v_newBuilder();
                ibuq.f(hftp1, "builder");
                String s = statusBarNotification0.getPackageName();
                ibuq.e(s, "getPackageName(...)");
                ibuq.f(s, "value");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                cuav cuav0 = (cuav)hftp1.b_message;
                s.getClass();
                cuav0.b |= 1;
                cuav0.c = s;
                int v1 = statusBarNotification0.getId();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                cuav cuav1 = (cuav)hftp1.b_message;
                cuav1.b |= 2;
                cuav1.d = v1;
                if(statusBarNotification0.getTag() != null) {
                    String s1 = statusBarNotification0.getTag();
                    ibuq.e(s1, "getTag(...)");
                    ibuq.f(s1, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    cuav cuav2 = (cuav)hftp1.b_message;
                    s1.getClass();
                    cuav2.b |= 4;
                    cuav2.e = s1;
                }
                ProtoLiteMessage hftv0 = hftp1.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((cuav)hftv0), "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cuas cuas0 = (cuas)hftp0.b_message;
                ((cuav)hftv0).getClass();
                hfuo hfuo0 = cuas0.b;
                if(!hfuo0.c()) {
                    cuas0.b = ProtoLiteMessage.E(hfuo0);
                }
                cuas0.b.add(((cuav)hftv0));
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                ibuq.f(((cuas)hftv1), "value");
                ProtoLiteBuilder hftp2 = cuaz0.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                cuaq cuaq0 = (cuaq)hftp2.b_message;
                ((cuas)hftv1).getClass();
                cuaq0.c = (cuas)hftv1;
                cuaq0.b = 4;
                object2 = icmn0.a(cuaz0.a(), this);
                if(object2 != ibrx.a) {
                    object2 = ibom.a;
                }
            }
            else {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

