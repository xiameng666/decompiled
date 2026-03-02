import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;

public final class bghu implements evpo {
    public final bgia a;
    public final String b;
    public final int c;

    public bghu(bgia bgia0, String s, int v) {
        this.a = bgia0;
        this.b = s;
        this.c = v;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.i() == null && evql0.j() != null) {
            PendingIntent pendingIntent0 = (PendingIntent)evql0.j();
            bgmu bgmu0 = this.a.c;
            bayn bayn0 = bgmu0.c;
            if(bayn0 == null) {
                return evrg.d(bdij.f);
            }
            Context context0 = bgmu0.a;
            bgmb.a(bayn0, context0);
            NotificationChannel notificationChannel0 = bayn0.c("com.google.android.gms.notifications::SECURITY_ALERTS");
            if(notificationChannel0 == null) {
                NotificationChannel notificationChannel1 = new NotificationChannel("com.google.android.gms.notifications::SECURITY_ALERTS", "Security Alerts", 3);
                notificationChannel1.setGroup("CREDENTIAL_MANAGER_CHANNEL_GROUP_ID");
                bayn0.p(notificationChannel1);
            }
            else if(notificationChannel0.getGroup() == null) {
                notificationChannel0.setGroup("CREDENTIAL_MANAGER_CHANNEL_GROUP_ID");
            }
            int v = avyq.a(context0, 0x1080027);
            juo juo0 = new juo(context0, "com.google.android.gms.notifications::SECURITY_ALERTS");
            juo0.D("Critical security alert");
            juo0.k("Check your saved passwords");
            juo0.h = pendingIntent0;
            juo0.h(true);
            juo0.m = 0;
            juo0.s(v);
            juo0.E = 1;
            juo0.R(this.b);
            Notification notification0 = juo0.a();
            bayn0.y("password_checkup_alerts_notification_tag", this.c, evuh.l, notification0);
            return evrg.d(bdij.b);
        }
        return evrg.d(bdij.f);
    }
}

