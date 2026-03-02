import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.google.android.chimera.IntentOperation;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import com.google.android.location.quake.ealert.ux.NotificationListenerIntentOperation;
import java.util.Date;
import java.util.Locale;

public final class fxmr {
    public static final int a;

    static {
        bboh.c("EAlert", bbcu.g, "QNotS");
    }

    public static void a(Context context0) {
        bayn bayn0 = bayn.f(context0);
        batl.s(bayn0);
        fxmr.e(bayn0, "eew_system_update");
        fxmr.e(bayn0, "eew_system_alert");
        fxmr.e(bayn0, "eew_notification");
        fxmr.e(bayn0, "eew_alert");
        if(bayn0.d("Personal_Safety_Id") == null) {
            bayn0.q(new NotificationChannelGroup("Personal_Safety_Id", "Personal Safety"));
        }
        fxmr.f(context0, bayn0, "eew_update", 0x7F1527BE, false, null);  // string:quake_notification_low_importance_channel_name "Earthquake Early Warning 
                                                                         // Updates"
        fxmr.f(context0, bayn0, "eew_notification_v2", 0x7F1527BF, false, fxmr.c(context0));  // string:quake_notification_medium_importance_channel_name "Earthquake Early Warning 
                                                                                              // Notification"
        fxmr.f(context0, bayn0, "eew_alert_v2", 0x7F1527BD, true, fxmr.c(context0));  // string:quake_notification_high_importance_channel_name "Earthquake Early Warning 
                                                                                      // Alert"
    }

    public static void b(Context context0, EAlertUxArgs eAlertUxArgs0) {
        String s3;
        String s2;
        boolean z1;
        String s1;
        PendingIntent pendingIntent1;
        int v = eAlertUxArgs0.k;
        String s = eAlertUxArgs0.h;
        long v1 = eAlertUxArgs0.i;
        Intent intent0 = fxmp.h(eAlertUxArgs0);
        PendingIntent pendingIntent0 = v == 7 ? cjok.a(context0, 0, intent0, 0x14000000) : fqaw.a(context0, 0, intent0, 0x14000000);
        if(huqb.B()) {
            Intent intent1 = IntentOperation.getStartIntent(context0, NotificationListenerIntentOperation.class, "com.google.android.gms.location.EALERT_NOTIFICATION_DISMISS");
            batl.s(intent1);
            intent1.putExtra("EALERT_TAKE_ACTION_ARGS", eAlertUxArgs0);
            intent1.putExtra("EALERT_NOTIFICATION_TTL", System.currentTimeMillis() + eAlertUxArgs0.j);
            pendingIntent1 = fqaw.f(context0, 0, intent1, 0xC000000);
        }
        else {
            Intent intent2 = IntentOperation.getStartIntent(context0, NotificationListenerIntentOperation.class, "com.google.android.gms.location.EALERT_NOTIFICATION_DISMISS");
            batl.s(intent2);
            intent2.putExtra("EALERT_TAKE_ACTION_ARGS", eAlertUxArgs0);
            intent2.putExtra("EALERT_NOTIFICATION_TTL", System.currentTimeMillis() + eAlertUxArgs0.j);
            pendingIntent1 = fqaw.f(context0, 0, intent2, 0xC000000);
        }
        batl.s(pendingIntent0);
        batl.s(pendingIntent1);
        switch(v) {
            case 1: 
            case 2: 
            case 3: {
                s1 = context0.getResources().getString(0x7F150E8B, new Object[]{DateFormat.getTimeFormat(context0).format(new Date(eAlertUxArgs0.a * 1000L))});  // string:ealert_notification_occurred_v2 "Earthquake at %1$s"
                break;
            }
            case 4: {
                s1 = "Earthquake nearby";
                break;
            }
            case 6: {
                s1 = "View official earthquake details";
                break;
            }
            case 7: {
                s1 = "Earthquake alert canceled";
                break;
            }
            default: {
                s1 = "Earthquake at %1$s";
            }
        }
        boolean z = eAlertUxArgs0.g;
        if(z) {
            s1 = "Test " + s1;
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(v == 4 || v == 6) {
            s2 = context0.getString(0x7F150E87, new Object[]{fxmr.d(context0, eAlertUxArgs0)});  // string:ealert_nearby_notification_text_v2 "Expect light shaking. %1$s"
        }
        else if(v == 7) {
            s2 = "Tap to learn more.";
        }
        else if(huqb.B()) {
            s2 = context0.getString(0x7F150E8D, new Object[]{fxmr.d(context0, eAlertUxArgs0), "Tap to learn more."});  // string:ealert_occurred_notification_text_v2 "You may have felt shaking. %1$s %2$s"
        }
        else {
            s2 = context0.getString(0x7F150E8D, new Object[]{fxmr.d(context0, eAlertUxArgs0), "Tap to learn more."});  // string:ealert_occurred_notification_text_v2 "You may have felt shaking. %1$s %2$s"
        }
        if(z1) {
            s2 = "Test " + s2;
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 6: {
                s3 = "eew_update";
                break;
            }
            case 4: 
            case 7: {
                if(eAlertUxArgs0.p) {
                    s3 = eAlertUxArgs0.q ? "eew_update" : "eew_notification_v2";
                }
                else {
                    s3 = "eew_alert_v2";
                }
                break;
            }
            default: {
                if(z) {
                    throw new IllegalArgumentException("AlertUi " + v);
                }
                s3 = "eew_update";
            }
        }
        juo juo0 = new juo(context0, s3);
        juo0.s(avyq.a(context0, 0x7F08038E));  // drawable:ealert_notif_icon
        juo0.h(true);
        juo0.D = context0.getColor(0x7F060D66);  // color:notification_icon_red
        juo0.E = 1;
        juo0.N = eAlertUxArgs0.j;
        Bundle bundle0 = new Bundle();
        bundle0.putString("android.substName", context0.getString((eAlertUxArgs0.m == 2 ? 0x7F151468 : 0x7F150E8C)));  // string:google_alert_source "Android Earthquake Alerts System"
        if(v == 3 || v == 4) {
            float f = eAlertUxArgs0.c;
            if((f > 0.0f)) {
                bundle0.putLong("TIME_OCCURRED_EXTRA", eAlertUxArgs0.a);
                bundle0.putFloat("MAGNITUDE_EXTRA", f);
                bundle0.putDouble("DISTANCE_EXTRA", eAlertUxArgs0.e);
            }
        }
        juo0.e(bundle0);
        juo0.D(s1);
        juo0.k(s2);
        juk juk0 = new juk();
        juk0.f(s1);
        juk0.e(s2);
        juo0.v(juk0);
        juo0.h = pendingIntent0;
        juo0.l(pendingIntent1);
        if(Build.VERSION.SDK_INT >= 35 && gfqz.e(Build.MANUFACTURER, "samsung") && huqb.a.s().as()) {
            Bundle bundle1 = new Bundle();
            bundle1.putBoolean("android.showSmallIcon", true);
            juo0.C = bundle1;
        }
        Notification notification0 = juo0.a();
        bayn bayn0 = bayn.f(context0);
        if(bayn0 != null) {
            bayn0.y("BmGrzDxTRr6j7/D96FBC/Q", 0, evuh.bd, notification0);
            fxmt.b().a(s, v1, v, 15);
        }
    }

    private static Uri c(Context context0) {
        return Uri.parse("android.resource://com.google.android.gms/raw/be_aware_alert_sound");
    }

    private static String d(Context context0, EAlertUxArgs eAlertUxArgs0) {
        if(eAlertUxArgs0.r) {
            Locale locale0 = Locale.getDefault();
            String s = fxmp.c(eAlertUxArgs0.e, locale0);
            return context0.getString(0x7F150E85, new Object[]{((float)eAlertUxArgs0.c), s});  // string:ealert_magnitude_info_v2 "Initial estimate M%1$.1f about %2$s away."
        }
        Locale locale1 = Locale.getDefault();
        return context0.getString(0x7F150E7D, new Object[]{fxmp.c(eAlertUxArgs0.e, locale1)});  // string:ealert_earthquake_info_no_mag "Epicenter estimated about %1$s away."
    }

    private static void e(bayn bayn0, String s) {
        if(bayn0.c(s) != null) {
            bayn0.s(s);
        }
    }

    private static void f(Context context0, bayn bayn0, String s, int v, boolean z, Uri uri0) {
        if(bayn0.c(s) == null) {
            NotificationChannel notificationChannel0 = new NotificationChannel(s, context0.getString(v), 4);
            notificationChannel0.enableVibration(z);
            if(uri0 == null) {
                notificationChannel0.setSound(null, null);
            }
            else {
                notificationChannel0.setSound(uri0, new AudioAttributes.Builder().setUsage(10).setContentType(4).build());
            }
            notificationChannel0.setDescription(context0.getString(v));
            notificationChannel0.setGroup("Personal_Safety_Id");
            notificationChannel0.setLockscreenVisibility(1);
            bayn0.p(notificationChannel0);
        }
    }
}

