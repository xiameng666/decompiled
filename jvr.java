import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public final class jvr {
    public static final Object a;
    public static String b;
    public static Set c;
    public final Context d;
    public final NotificationManager e;
    private static final Object f;
    private static jvq g;

    static {
        jvr.a = new Object();
        jvr.c = new HashSet();
        jvr.f = new Object();
    }

    public jvr(Context context0) {
        this.d = context0;
        this.e = (NotificationManager)context0.getSystemService("notification");
    }

    public final void a(int v) {
        this.b(null, v);
    }

    public final void b(String s, int v) {
        this.e.cancel(s, v);
    }

    public final void c() {
        this.e.cancelAll();
    }

    public final void d(NotificationChannel notificationChannel0) {
        this.e.createNotificationChannel(notificationChannel0);
    }

    public final void e(int v, Notification notification0) {
        this.f(null, v, notification0);
    }

    public final void f(String s, int v, Notification notification0) {
        if(notification0.extras != null && notification0.extras.getBoolean("android.support.useSideChannel")) {
            Context context0 = this.d;
            jvn jvn0 = new jvn("com.google.android.gms", v, s, notification0);
            Object object0 = jvr.f;
            synchronized(object0) {
                if(jvr.g == null) {
                    jvr.g = new jvq(context0.getApplicationContext());
                }
                jvr.g.a.obtainMessage(0, jvn0).sendToTarget();
            }
            this.e.cancel(s, v);
            return;
        }
        this.e.notify(s, v, notification0);
    }

    public final boolean g() {
        return this.e.areNotificationsEnabled();
    }
}

