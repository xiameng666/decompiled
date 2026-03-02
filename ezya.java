import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.update.SystemUpdateStatus;

public abstract class ezya {
    public static final baun a;
    public static final fagq b;
    public static final fagl c;
    public static final fage d;
    protected final Context e;
    public final bayn f;
    public final bbib g;
    public final fagt h;
    public final ezyb i;

    static {
        ezya.a = fabk.d("NotificationControl");
        ezya.b = new fagq("control.notification.notified_at");
        ezya.c = new fagl("control.notification.last_notified_status", ((int)-1));
        ezya.d = new ezxz();
    }

    protected ezya(Context context0) {
        this.e = context0;
        bayn bayn0 = bayn.f(context0);
        bayn0.getClass();
        this.f = bayn0;
        this.g = new bbib(context0);
        this.h = (fagt)fagt.a.b();
        this.i = new ezyb(context0);
    }

    protected abstract Notification a(SystemUpdateStatus arg1, boolean arg2);

    public final void c() {
        this.f.o("com.google.android.gms.update.control.NotificationControl", 1, evuh.bl);
    }

    public final void d(long v) {
        PendingIntent pendingIntent0 = ezye.a(this.e, 1);
        this.g.d("NotificationControl-Alarm", 1, v, pendingIntent0, null);
    }
}

