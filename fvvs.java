import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.chimera.IntentOperation;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import com.google.android.location.quake.ealert.ux.NotificationListenerIntentOperation;
import java.util.Date;

public final class fvvs {
    public static void a(Context context0, EAlertUxArgs eAlertUxArgs0) {
        String s23;
        String s1;
        String s;
        if(fxmj.e()) {
            int v = eAlertUxArgs0.k;
            switch(v) {
                case 8: {
                    s = context0.getString(fxvv.b().a.g);
                    break;
                }
                case 9: {
                    s = context0.getString(fxvv.b().a.h);
                    break;
                }
                case 10: {
                    s = context0.getString(fxvv.b().a.n);
                    break;
                }
                case 11: {
                    s = context0.getString(fxvv.b().a.o);
                    break;
                }
                default: {
                    if(eAlertUxArgs0.g) {
                        throw new IllegalArgumentException("AlertUi " + v);
                    }
                    s = "";
                    break;
                }
            }
            switch(v) {
                case 8: {
                    String s2 = context0.getString(fxvv.b().a.i);
                    String s3 = fvvs.b(context0, eAlertUxArgs0.i);
                    s1 = String.format(s2, eAlertUxArgs0.o, s3);
                    break;
                }
                case 9: {
                    String s4 = context0.getString(fxvv.b().a.j);
                    String s5 = fvvs.b(context0, eAlertUxArgs0.i);
                    s1 = String.format(s4, eAlertUxArgs0.o, s5);
                    break;
                }
                case 10: {
                    String s6 = context0.getString(fxvv.b().a.l);
                    String s7 = fvvs.b(context0, eAlertUxArgs0.i);
                    s1 = String.format(s6, eAlertUxArgs0.o, s7);
                    break;
                }
                case 11: {
                    String s8 = context0.getString(fxvv.b().a.m);
                    String s9 = fvvs.b(context0, eAlertUxArgs0.i);
                    s1 = String.format(s8, eAlertUxArgs0.o, s9);
                    break;
                }
                default: {
                    if(eAlertUxArgs0.g) {
                        throw new IllegalArgumentException("AlertUi " + v);
                    }
                    s1 = "";
                    break;
                }
            }
            boolean z = eAlertUxArgs0.g;
            if(z) {
                s1 = "Test " + s1;
                s = "Test " + s;
            }
            Intent intent0 = new Intent("com.google.android.location.settings.ArwEAlertSettingsActivity");
            intent0.setFlags(0x10000000);
            intent0.setClassName("com.google.android.gms", "com.google.android.location.settings.ArwEAlertSettingsActivity");
            fvwo fvwo0 = new fvwo();
            fvwo0.g(false);
            fvwo0.f = -1;
            fvwo0.p = (byte)(fvwo0.p | 4);
            fvwo0.c(true);
            fvwo0.h = "";
            fvwo0.a("");
            fvwo0.j = 3;
            fvwo0.p = (byte)(fvwo0.p | 16);
            fvwo0.f(-1);
            fvwo0.m = "";
            Uri uri0 = fvwp.a;
            if(uri0 == null) {
                throw new NullPointerException("Null soundUri");
            }
            fvwo0.k = uri0;
            fvwo0.d("");
            fvwo0.b(-1);
            if(s1 == null) {
                throw new NullPointerException("Null notificationText");
            }
            fvwo0.b = s1;
            if(s == null) {
                throw new NullPointerException("Null notificationTitle");
            }
            fvwo0.a = s;
            fvwo0.m = "com.google.android.gms.location.EALERT_NOTIFICATION_DISMISS";
            fvwo0.e(0x7F08038E);  // drawable:ealert_notif_icon
            fvwo0.g(true);
            fvwo0.f(((int)eAlertUxArgs0.j));
            String s10 = eAlertUxArgs0.h;
            fvwo0.d(s10);
            fvwo0.d = fqaw.a(context0, 0, intent0, 0x14000000);
            switch(v) {
                case 8: 
                case 10: {
                label_71:
                    fvwo0.h = "arw_system_alert3";
                    fvwo0.e(0x7F080467);
                    fvwo0.b(0x7F060D66);  // color:notification_icon_red
                    fvwo0.c(true);
                    fvwo0.a("Air Raid Alerts");
                    break;
                }
                case 9: 
                case 11: {
                    fvwo0.h = "arw_system_all_clear3";
                    fvwo0.e(0x7F080467);
                    fvwo0.b(0x7F060D65);  // color:notification_icon_blue
                    fvwo0.c(false);
                    fvwo0.a("Air Raid All Clear");
                    break;
                }
                default: {
                    if(z) {
                        throw new IllegalArgumentException("AlertUi " + v);
                    }
                    goto label_71;
                }
            }
            if(fvwo0.p == 0x7F) {
                String s11 = fvwo0.a;
                if(s11 != null) {
                    String s12 = fvwo0.b;
                    if(s12 != null) {
                        String s13 = fvwo0.h;
                        if(s13 != null) {
                            String s14 = fvwo0.i;
                            if(s14 != null) {
                                Uri uri1 = fvwo0.k;
                                if(uri1 != null) {
                                    String s15 = fvwo0.m;
                                    if(s15 != null) {
                                        String s16 = fvwo0.o;
                                        if(s16 != null) {
                                            fvwp fvwp0 = new fvwp(s11, s12, fvwo0.c, fvwo0.d, fvwo0.e, fvwo0.f, fvwo0.g, s13, s14, fvwo0.j, uri1, fvwo0.l, s15, fvwo0.n, s16);
                                            String s17 = fvwp0.b;
                                            batl.r(s17, "wrong notification title");
                                            String s18 = fvwp0.c;
                                            batl.r(s18, "wrong notification text");
                                            String s19 = fvwp0.h;
                                            batl.r(s19, "Empty notification channel id for O+");
                                            String s20 = fvwp0.i;
                                            batl.r(s20, "Empty notification channel name for O+");
                                            String s21 = fvwp0.m;
                                            batl.r(s21, "Wrong notification event Id");
                                            if(fxmj.e()) {
                                                bayn bayn0 = bayn.f(context0);
                                                batl.s(bayn0);
                                                Bundle bundle0 = new Bundle();
                                                bundle0.putString("android.substName", context0.getString(fxvv.b().a.k));
                                                juo juo0 = new juo(context0);
                                                juo0.s(avyq.a(context0, fvwp0.f));
                                                juo0.D(s17);
                                                juo0.k(s18);
                                                juo0.e(bundle0);
                                                juo0.h(true);
                                                juo0.D = context0.getColor((fvwp0.l == -1 ? 0x7F060D66 : fvwp0.l));  // color:notification_icon_red
                                                juo0.E = 1;
                                                PendingIntent pendingIntent0 = fvwp0.e;
                                                if(pendingIntent0 != null) {
                                                    juo0.h = pendingIntent0;
                                                }
                                                if(fvwp0.d) {
                                                    juk juk0 = new juk();
                                                    juk0.f(s17);
                                                    juk0.e(s18);
                                                    juo0.v(juk0);
                                                }
                                                String s22 = fvwp0.k;
                                                if(!TextUtils.isEmpty(s22) && s22.equals("com.google.android.gms.location.EALERT_NOTIFICATION_DISMISS")) {
                                                    Intent intent1 = IntentOperation.getStartIntent(context0, NotificationListenerIntentOperation.class, s22);
                                                    batl.s(intent1);
                                                    intent1.putExtra("EALERT_EVENT_ID", s21);
                                                    intent1.putExtra("EALERT_TAKE_ACTION_ARGS", eAlertUxArgs0);
                                                    int v1 = fvwp0.j;
                                                    if(v1 == -1) {
                                                        s23 = s10;
                                                    }
                                                    else {
                                                        s23 = s10;
                                                        intent1.putExtra("EALERT_NOTIFICATION_TTL", ((long)v1) + System.currentTimeMillis());
                                                    }
                                                    PendingIntent pendingIntent1 = fqaw.f(context0, 0, intent1, 0xC000000);
                                                    batl.s(pendingIntent1);
                                                    juo0.l(pendingIntent1);
                                                }
                                                else {
                                                    s23 = s10;
                                                }
                                                if(bayn0.c("Personal_Safety_Id") == null) {
                                                    bayn0.q(new NotificationChannelGroup("Personal_Safety_Id", "Personal Safety"));
                                                }
                                                NotificationChannel notificationChannel0 = new NotificationChannel(s19, s20, (v == 8 || v == 10 ? 4 : 2));
                                                notificationChannel0.enableVibration(fvwp0.g);
                                                notificationChannel0.setSound(null, null);
                                                notificationChannel0.setDescription(s20);
                                                notificationChannel0.setGroup("Personal_Safety_Id");
                                                bayn0.p(notificationChannel0);
                                                juo0.J = s19;
                                                int v2 = fvwp0.j;
                                                if(v2 != -1) {
                                                    juo0.N = (long)v2;
                                                }
                                                fxmt.b().a(s23, eAlertUxArgs0.i, v, 15);
                                                Notification notification0 = juo0.a();
                                                batl.s(notification0);
                                                bayn0.y("HWFwYYVsTmSTcek/T9xfiQ", 0, evuh.be, notification0);
                                                return;
                                            }
                                            fxmt.b().a(s10, eAlertUxArgs0.i, v, 14);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(fvwo0.a == null) {
                stringBuilder0.append(" notificationTitle");
            }
            if(fvwo0.b == null) {
                stringBuilder0.append(" notificationText");
            }
            if((fvwo0.p & 1) == 0) {
                stringBuilder0.append(" useBigTextStyle");
            }
            if((fvwo0.p & 2) == 0) {
                stringBuilder0.append(" smallIcon");
            }
            if((fvwo0.p & 4) == 0) {
                stringBuilder0.append(" bigIcon");
            }
            if((fvwo0.p & 8) == 0) {
                stringBuilder0.append(" enableVibration");
            }
            if(fvwo0.h == null) {
                stringBuilder0.append(" channelId");
            }
            if(fvwo0.i == null) {
                stringBuilder0.append(" channelName");
            }
            if((fvwo0.p & 16) == 0) {
                stringBuilder0.append(" notificationImportance");
            }
            if(fvwo0.k == null) {
                stringBuilder0.append(" soundUri");
            }
            if((fvwo0.p & 0x20) == 0) {
                stringBuilder0.append(" timeoutMs");
            }
            if(fvwo0.m == null) {
                stringBuilder0.append(" notificationDismissActionName");
            }
            if((fvwo0.p & 0x40) == 0) {
                stringBuilder0.append(" color");
            }
            if(fvwo0.o == null) {
                stringBuilder0.append(" eventId");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
    }

    private static String b(Context context0, long v) {
        return DateFormat.getTimeFormat(context0).format(new Date(v));
    }
}

