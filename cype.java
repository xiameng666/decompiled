import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import java.util.concurrent.ExecutorService;

public final class cype {
    public final Context a;
    public final ExecutorService b;
    Boolean c;
    public cust d;
    private final cwaa e;

    public cype(Context context0, cwaa cwaa0) {
        gmcg gmcg0 = cuui.d();
        super();
        this.d = cyjh.a;
        this.a = context0;
        this.b = gmcg0;
        this.e = cwaa0;
    }

    public final juo a() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("android.substName", "Devices");
        juo juo0 = new juo(this.a, "SASS_NOTIFICATION_CHANNEL2");
        juo0.s(avyq.a(this.a, 0x7F080D42));  // drawable:quantum_ic_headset_vd_theme_24
        juo0.y = true;
        juo0.n = true;
        juo0.e(bundle0);
        return juo0;
    }

    public final String b() {
        return cyfo.b(this.a);
    }

    public final String c(String s, Object[] arr_object) {
        return this.e.a(s, arr_object);
    }

    public final void d() {
        ((ggtj)this.d.f().ar(0x1F28)).x("SassNotificationManager: Create SASS debug notification channel.");
        NotificationChannel notificationChannel0 = new NotificationChannel("SASS_DEBUG_CHANNEL", "SASS debug", 3);
        notificationChannel0.setDescription("SASS debug");
        notificationChannel0.enableVibration(false);
        notificationChannel0.setSound(null, null);
        new cuqn(this.a).f(notificationChannel0);
    }

    public final void e() {
        Context context0 = this.a;
        cuqn cuqn0 = new cuqn(context0);
        if(this.c == null) {
            this.c = Boolean.valueOf(cuqn0.a("SASS_NOTIFICATION_CHANNEL2") != null);
        }
        if(!this.c.booleanValue()) {
            ((ggtj)this.d.d().ar(0x1F29)).x("SassNotificationManager: Create SASS notification channel.");
            NotificationChannel notificationChannel0 = new NotificationChannel("SASS_NOTIFICATION_CHANNEL2", this.c("fast_pair_sass_notification_channel_name", new Object[0]), 4);
            notificationChannel0.setDescription(this.c("fast_pair_sass_notification_channel_description", new Object[0]));
            notificationChannel0.enableVibration(false);
            Resources resources0 = context0.getResources();
            notificationChannel0.setSound(new Uri.Builder().scheme("android.resource").authority(resources0.getResourcePackageName(0x7F140137)).appendPath(resources0.getResourceTypeName(0x7F140137)).appendPath(resources0.getResourceEntryName(0x7F140137)).build(), Notification.AUDIO_ATTRIBUTES_DEFAULT);  // raw:discovery_silence
            cuqn0.f(notificationChannel0);
            this.c = Boolean.valueOf(true);
            if(cuqn0.a("SASS_NOTIFICATION_CHANNEL") != null) {
                cuqn0.h("SASS_NOTIFICATION_CHANNEL");
            }
        }
    }

    public final void f(int v) {
        ((ggtj)this.d.d().ar(0x1F2A)).z("SassNotificationManager: Cancel notification, id=%d.", v);
        new cuqn(this.a).d(v);
    }

    public final void g(int v, Notification notification0) {
        if(notification0.getChannelId().equals("SASS_NOTIFICATION_CHANNEL2")) {
            ((ggtj)this.d.d().ar(0x1F2B)).z("SassNotificationManager: Show notification, id=%d.", v);
        }
        new cuqn(this.a).i(v, notification0);
    }

    public final void h(cynb cynb0, String s, String s1) {
        this.d();
        RemoteViews remoteViews0 = new RemoteViews("com.google.android.gms", 0x1090003);
        remoteViews0.setTextColor(0x1020014, -1);
        remoteViews0.setTextViewText(0x1020014, Html.fromHtml(s1));
        juo juo0 = new juo(this.a, "SASS_DEBUG_CHANNEL");
        juo0.s(0x7F080597);  // drawable:gs_hourglass_empty_vd_theme_24
        juo0.H(cynb0.b);
        juo0.H = remoteViews0;
        juo0.D(cynb0.c());
        juo0.k(s);
        juo0.N = 3000L;
        juo0.n = true;
        juo0.h(true);
        juo0.y = true;
        juo0.e(cype.i(s1));
        Notification notification0 = juo0.a();
        this.g((cynb0.a.getAddress() + "_latency").hashCode(), notification0);
    }

    public static final Bundle i(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("sass.extra", s);
        return bundle0;
    }
}

