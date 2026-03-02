import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import j..util.Objects;

public class cqjj extends IntentOperation {
    private static boolean a;
    private final cqig b;

    protected cqjj(cqig cqig0) {
        this.b = cqig0;
    }

    public static void a(boolean z) {
        synchronized(cqjj.class) {
            cqjj.a = z;
            if(hxvi.s()) {
                cqix.q.d(Boolean.valueOf(z));
            }
        }
    }

    public static boolean b() {
        synchronized(cqjj.class) {
            if(!hxvi.s()) {
                return cqjj.a;
            }
            if(!cqjj.a && !((Boolean)cqix.q.c()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && Objects.equals(intent0.getAction(), "android.intent.action.USER_PRESENT") && cqjj.b()) {
            try {
                cqqa.j(this);
                cqqa.f(this);
                if(((Boolean)cqix.u.c()).booleanValue()) {
                    if(hxwm.q()) {
                        Intent intent1 = cqnf.b(this);
                        if(intent1 == null) {
                            cqqt.d("Null intent when notifying for QRL", new Object[0]);
                        }
                        else {
                            if(hxwm.j()) {
                                intent1 = intent1.putExtra("com.google.android.gms.settings.QRL_SETTINGS_EXTRA_OPEN_FROM_NOTIFICATION", true);
                            }
                            PendingIntent pendingIntent0 = cqjk.b(intent1, this);
                            cqqu.d(this);
                            juo juo0 = cqqu.c(this, "qrl_channel");
                            if(hxwm.j()) {
                                juo0.D("Screen was locked remotely");
                                juo0.k("If this is unexpected, you can set or change your security question for Remote Lock");
                            }
                            else {
                                juo0.D("Device was locked remotely");
                                juo0.k("Check the Remote Lock setting to make changes");
                            }
                            juo0.h = pendingIntent0;
                            juo0.m = 2;
                            juo0.B = "msg";
                            juo0.E = 1;
                            juo0.h(true);
                            Notification notification0 = juo0.a();
                            bayn bayn0 = bayn.f(this);
                            if(bayn0 == null) {
                                cqqt.d("Null NotificationManager when notifying for QRL", new Object[0]);
                            }
                            else {
                                bayn0.y("mdm.notification_qrl", 1, evuh.cq, notification0);
                            }
                        }
                    }
                    cqqn.c(cqrb.a(this, hgzp.dt));
                }
                String s = cqix.o.a(this);
                boolean z = cqqg.a(this);
                this.b.a(new hltz[]{hltz.x}, null, null, null, s, null, z);
            }
            finally {
                cqjj.a(false);
                cqix.u.d(Boolean.valueOf(false));
                cqix.o.b(this, "");
            }
        }
    }
}

