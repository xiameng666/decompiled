import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.notification.SerializableNotification;
import java.util.Random;

public final class eqrk {
    public static final int a;
    private static final baun b;

    static {
        eqrk.b = new erqc(new String[]{"Utils", "NotificationUtils"});
    }

    public static void a(Context context0, int v, String s) {
        CharSequence charSequence1;
        CharSequence charSequence0;
        if(TextUtils.isEmpty(s)) {
            charSequence0 = "Device setup";
            charSequence1 = context0.getResources().getQuantityString(0x7F130098, v);  // plurals:smartdevice_d2d_source_notification_generic_text
        }
        else {
            charSequence0 = TextUtils.expandTemplate("^1 setup", new CharSequence[]{s});
            charSequence1 = TextUtils.expandTemplate(context0.getResources().getQuantityString(0x7F130099, v), new CharSequence[]{s});  // plurals:smartdevice_d2d_source_notification_text
        }
        long v1 = hyim.a.e().g();
        eqrk.b.j("Showing notification with duration %d", new Object[]{((long)0L)});
        eqrk.b.j("Delaying notification by %d", new Object[]{v1});
        SerializableNotification serializableNotification0 = new SerializableNotification();
        serializableNotification0.b = 0L;
        serializableNotification0.c = v1;
        serializableNotification0.d = charSequence1;
        serializableNotification0.f = charSequence1;
        serializableNotification0.g = charSequence0;
        serializableNotification0.e = Uri.parse(hyim.a.e().t());
        serializableNotification0.h = false;
        serializableNotification0.k = false;
        serializableNotification0.i = avyq.a(context0, 0x7F080D3E);
        serializableNotification0.l = true;
        serializableNotification0.j = charSequence0;
        bayn bayn0 = bayn.f(context0);
        bayn0.getClass();
        bbib bbib0 = new bbib(context0);
        int v2 = new Random().nextInt();
        if(serializableNotification0.b > 86400000L) {
            throw new IllegalArgumentException("Notification cannot have max duration exceeding 1 day.");
        }
        SerializableNotification serializableNotification1 = SerializableNotification.b(serializableNotification0.c());
        serializableNotification1.a = System.currentTimeMillis();
        equa.c("d2d", v2, serializableNotification1, bayn0, bbib0);
    }
}

