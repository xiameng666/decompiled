import android.app.Notification.MessagingStyle;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import j..util.DesugarCollections;
import java.util.List;

public final class ctye implements ykl {
    public final bboh a;
    public final icmn b;
    public final ctwf c;
    private final String d;

    public ctye() {
        this.d = "NotificationSyncRpcService";
    }

    public ctye(ctwf ctwf0) {
        this.d = "NotificationSyncRpcService";
        this.c = ctwf0;
        this.a = ctnb.a("NotificationSync", new ibuk(this.getClass()));
        this.b = icmu.e(0, 0, 0, 7);
    }

    @Override  // ykl
    public final ykk a(String s) {
        ibuq.f(s, "methodName");
        if(ibuq.m(s, "ReadNotificationShadeEvents")) {
            return new yki(new ctxz(this));
        }
        return !ibuq.m(s, "DismissNotification") ? null : new ykj(new ctya(this, null));
    }

    @Override  // ykl
    public final String b() {
        return this.d;
    }

    public static boolean c(Context context0) {
        return hvns.c() && ctxh.c(context0);
    }

    public final Object d(StatusBarNotification statusBarNotification0, Context context0, ibrl ibrl0) {
        ctwh ctwh0;
        if((ibrl0 instanceof ctwh)) {
            ctwh0 = (ctwh)ibrl0;
            int v = ctwh0.b;
            if((v & 0x80000000) == 0) {
                ctwh0 = new ctwh(this, ibrl0);
            }
            else {
                ctwh0.b = v - 0x80000000;
            }
        }
        else {
            ctwh0 = new ctwh(this, ibrl0);
        }
        Object object0 = ctwh0.a;
        Object object1 = ibrx.a;
        switch(ctwh0.b) {
            case 0: {
                ibnx.b(object0);
                if(ctye.c(context0)) {
                    boolean z = ibuq.m(statusBarNotification0.getNotification().extras.getString("android.template"), Notification.MessagingStyle.class.getName());
                    if(hvns.e() || z) {
                        Object object2 = this.c.a(statusBarNotification0, context0);
                        Throwable throwable0 = ibnw.a(object2);
                        if(throwable0 != null) {
                            synchronized(this) {
                                a.e(this.a.j(), "Failed to serialize notification: %s", statusBarNotification0, throwable0);
                            }
                        }
                        if(ibnw.b(object2)) {
                            icmn icmn0 = this.b;
                            cuaz cuaz0 = cuay.a(((ProtoLiteMessage)cuaq.a).v_newBuilder());
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuar.a).v_newBuilder();
                            ibuq.f(hftp0, "builder");
                            List list0 = DesugarCollections.unmodifiableList(((cuar)hftp0.b_message).b);
                            ibuq.e(list0, "getNotificationsList(...)");
                            new hfxu(list0);
                            ibuq.f(((cuao)object2), "value");
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            cuar cuar0 = (cuar)hftp0.b_message;
                            ((cuao)object2).getClass();
                            hfuo hfuo0 = cuar0.b;
                            if(!hfuo0.c()) {
                                cuar0.b = ProtoLiteMessage.E(hfuo0);
                            }
                            cuar0.b.add(((cuao)object2));
                            ProtoLiteMessage hftv0 = hftp0.N_build();
                            ibuq.e(hftv0, "build(...)");
                            ibuq.f(((cuar)hftv0), "value");
                            ProtoLiteBuilder hftp1 = cuaz0.a;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            cuaq cuaq0 = (cuaq)hftp1.b_message;
                            ((cuar)hftv0).getClass();
                            cuaq0.c = (cuar)hftv0;
                            cuaq0.b = 3;
                            cuaq cuaq1 = cuaz0.a();
                            ctwh0.b = 1;
                            if(icmn0.a(cuaq1, ctwh0) == object1) {
                                return object1;
                            }
                        }
                    }
                }
                return ibom.a;
            }
            case 1: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

