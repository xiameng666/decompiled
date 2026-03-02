import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.smartdevice.AppContextProvider;
import com.google.android.gms.smartdevice.notification.PersistentNotificationCancellationIntentOperation;
import com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation;
import com.google.android.gms.smartdevice.notification.SerializableNotification;

public final class equa {
    public static final baun a;

    static {
        equa.a = new erqc(new String[]{"Notification", "PersistentNotificationManager"});
    }

    public static cjpc a() {
        return cjqh.a(AppContextProvider.a(), "smartdevice", "SmartDevice.PersistentNotificationManager", 0);
    }

    public static String b(String s, int v) {
        return v + ":" + s;
    }

    public static final void c(String s, int v, SerializableNotification serializableNotification0, bayn bayn0, bbib bbib0) {
        baun baun0 = equa.a;
        Integer integer0 = v;
        baun0.j("doNotify(tag=%s, id=%s)", new Object[]{s, integer0});
        Context context0 = AppContextProvider.a();
        cjpa cjpa0 = equa.a().c();
        cjpa0.h(equa.b(s, v), serializableNotification0.c());
        cjpd.g(cjpa0);
        if(Long.compare(serializableNotification0.c, 0L) > 0) {
            batl.q(s);
            Intent intent0 = IntentOperation.getStartIntent(context0, PersistentNotificationDelayIntentOperation.class, "com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation.ACTION");
            batl.s(intent0);
            Intent intent1 = intent0.putExtra("tag", s).putExtra("id", v);
            Parcel parcel0 = Parcel.obtain();
            serializableNotification0.writeToParcel(parcel0, 0);
            parcel0.setDataPosition(0);
            Intent intent2 = intent1.putExtra("notification_bytes", parcel0.marshall());
            intent2.setData(Uri.parse(intent2.toUri(1)));
            PendingIntent pendingIntent0 = IntentOperation.getPendingIntent(context0, PersistentNotificationDelayIntentOperation.class, intent2, 0, 0xA000000);
            if(pendingIntent0 == null) {
                baun0.m("Unable to set timer to launch notification.", new Object[0]);
            }
            else {
                baun0.j("Setting timer to launch notification in %d ms", new Object[]{((long)serializableNotification0.c)});
                equa.e("PersistentNotificationManager", pendingIntent0, serializableNotification0.a + serializableNotification0.c, bbib0);
            }
        }
        else {
            baun0.j("Showing notification (tag=%s, id=%s)", new Object[]{s, integer0});
            if(hyid.c()) {
                Notification notification0 = serializableNotification0.a(context0);
                bayn0.y(s, v, evuh.U, notification0);
            }
            else {
                bayn0.x(s, v, serializableNotification0.a(context0));
            }
        }
        if(serializableNotification0.b > 0L) {
            Intent intent3 = new Intent().setAction("com.google.android.gms.smartdevice.notification.CANCEL").putExtra("tag", s).putExtra("id", v);
            intent3.setData(Uri.parse(intent3.toUri(1)));
            String s1 = "Notification cancel Intent data: " + intent3.getDataString();
            PersistentNotificationCancellationIntentOperation.a.j(s1, new Object[0]);
            PendingIntent pendingIntent1 = IntentOperation.getPendingIntent(context0, PersistentNotificationCancellationIntentOperation.class, intent3, 0, 0xA000000);
            gfuy.e(pendingIntent1);
            baun0.j("Setting timer to cancel notification in %d ms", new Object[]{((long)serializableNotification0.b)});
            equa.e("PersistentNotificationManager.CANCELATION", pendingIntent1, serializableNotification0.a + serializableNotification0.c + serializableNotification0.b, bbib0);
        }
    }

    public static final void d(String s, int v, bayn bayn0) {
        if(hyid.c()) {
            bayn0.o(s, v, evuh.U);
        }
        else {
            bayn0.n(s, v);
        }
        cjpa cjpa0 = equa.a().c();
        cjpa0.j(equa.b(s, v));
        cjpd.g(cjpa0);
    }

    private static final void e(String s, PendingIntent pendingIntent0, long v, bbib bbib0) {
        bbib0.d(s, 1, v, pendingIntent0, "com.google.android.gms");
    }
}

