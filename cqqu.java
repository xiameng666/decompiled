import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.graphics.drawable.Icon;

public final class cqqu {
    public static int a(Context context0) {
        return avyq.a(context0, 0x7F080B8B);  // drawable:quantum_gm_ic_google_vd_24
    }

    public static juo b(Context context0) {
        return cqqu.c(context0, "find_my_device");
    }

    public static juo c(Context context0, String s) {
        juo juo0 = new juo(context0, s);
        juo0.s(cqqu.a(context0));
        if(hxwi.a.c().h()) {
            juo0.O = 1;
        }
        juo0.n(Icon.createWithResource(context0, avyq.a(context0, 0x7F080A60)));
        return juo0;
    }

    public static void d(Context context0) {
        bayn bayn0 = bayn.f(context0);
        if(bayn0 != null) {
            NotificationChannel notificationChannel0 = new NotificationChannel("find_my_device", "Find Hub", 4);
            if(hxvi.m()) {
                notificationChannel0.setName("Location viewed");
                bayn0.q(new NotificationChannelGroup("finder", "Find Hub"));
                notificationChannel0.setGroup("finder");
                notificationChannel0.setDescription("Shown when Find Hub displays the location of one of your devices.");
            }
            else {
                bayn0.t("finder");
            }
            bayn0.p(notificationChannel0);
            bayn0.q(new NotificationChannelGroup("DEVICES_CHANNEL_GROUP_ID", "Nearby"));
            NotificationChannel notificationChannel1 = new NotificationChannel("DEVICES_REBRANDED", "Devices", 2);
            notificationChannel1.setGroup("DEVICES_CHANNEL_GROUP_ID");
            bayn0.p(notificationChannel1);
            if(hxwm.q()) {
                NotificationChannel notificationChannel2 = new NotificationChannel("qrl_channel", "Remote Lock", 4);
                notificationChannel2.setDescription("Get notified when your device is remotely locked with a phone number");
                if(hxvi.m()) {
                    notificationChannel2.setGroup("finder");
                }
                bayn0.p(notificationChannel2);
            }
        }
    }
}

