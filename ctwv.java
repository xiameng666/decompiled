import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class ctwv extends ibsl implements ibtw {
    int a;
    final NotificationSyncChimeraService b;
    final List c;

    public ctwv(NotificationSyncChimeraService notificationSyncChimeraService0, List list0, ibrl ibrl0) {
        this.b = notificationSyncChimeraService0;
        this.c = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctwv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctwv(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object5;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            List list0 = this.c;
            ctye ctye0 = this.b.n();
            this.a = 1;
            Context context0 = this.b.f;
            if(ctye.c(context0)) {
                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                for(Object object2: list0) {
                    StatusBarNotification statusBarNotification0 = (StatusBarNotification)object2;
                    Object object3 = null;
                    if(hvns.e()) {
                    label_19:
                        Object object4 = ctye0.c.a(statusBarNotification0, context0);
                        if(!(object4 instanceof ibnv)) {
                            object3 = object4;
                        }
                        object3 = (cuao)object3;
                    }
                    else {
                        Notification notification0 = statusBarNotification0.getNotification();
                        ibuq.e(notification0, "getNotification(...)");
                        if(ctwe.d(notification0) == 3) {
                            goto label_19;
                        }
                    }
                    arrayList0.add(object3);
                }
                List list1 = ibpo.ag(arrayList0);
                icmn icmn0 = ctye0.b;
                cuaz cuaz0 = cuay.a(((ProtoLiteMessage)cuaq.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuaw.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                List list2 = DesugarCollections.unmodifiableList(((cuaw)hftp0.b_message).b);
                ibuq.e(list2, "getNotificationsList(...)");
                new hfxu(list2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cuaw cuaw0 = (cuaw)hftp0.b_message;
                hfuo hfuo0 = cuaw0.b;
                if(!hfuo0.c()) {
                    cuaw0.b = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list1, cuaw0.b);
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((cuaw)hftv0), "value");
                ProtoLiteBuilder hftp1 = cuaz0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                cuaq cuaq0 = (cuaq)hftp1.b_message;
                ((cuaw)hftv0).getClass();
                cuaq0.c = (cuaw)hftv0;
                cuaq0.b = 1;
                object5 = icmn0.a(cuaz0.a(), this);
                if(object5 != object1) {
                    object5 = ibom.a;
                }
            }
            else {
                object5 = ibom.a;
            }
            if(object5 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

