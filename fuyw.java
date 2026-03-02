import android.app.AutomaticZenRule;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fuyw {
    private final Context a;
    private final fuyy b;

    public fuyw(Context context0) {
        this.a = context0;
        this.b = new fuyy(context0);
    }

    public final void a() {
        if(hups.d()) {
            bayn bayn0 = bayn.f(this.a);
            if(bayn0 != null) {
                if(huue.v()) {
                    try {
                        long v = -1L;
                        fuyc fuyc0 = fuyc.a();
                        v = (long)(((Long)(huue.p() ? glzd.f(fuyc0.a.a(), new fuxx(), gmap.a) : gmbu.i(Long.valueOf(-1L))).get(2L, TimeUnit.SECONDS)));
                    }
                    catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
                    }
                    if(bayn0.B() && v + huue.a.f().a() > System.currentTimeMillis()) {
                        this.c();
                        return;
                    }
                }
                else if(huue.n()) {
                    this.c();
                    return;
                }
                if(hups.c()) {
                    Context context0 = this.a;
                    SharedPreferences sharedPreferences0 = context0.getSharedPreferences("dndNotificationSharedPreference", 0);
                    if(sharedPreferences0 != null) {
                        boolean z = sharedPreferences0.getBoolean("dndNotificationSent", false);
                        if(!bayn0.B()) {
                            if(!z) {
                                fuyt.a(context0).n(false, 2);
                                return;
                            }
                            if(huui.f()) {
                                fuyt.a(context0).l(6);
                            }
                        }
                        else if(z) {
                            bayn0.g(new AutomaticZenRule("Driving", new ComponentName("com.google.android.gms", "com.google.android.location.settings.DrivingConditionProvider"), new Uri.Builder().scheme("condition").authority("com.google.android.gms").appendPath(Boolean.toString(true)).appendPath(Integer.toString(((int)huue.b()))).appendQueryParameter("provider", "Driving").build(), ((int)huue.b()), true));
                            if(huui.f()) {
                                fuyt.a(context0).l(5);
                            }
                            Intent intent0 = new Intent();
                            intent0.setAction("com.google.android.location.settings.ACTIVITY_RECOGNITION_PERMISSION");
                            intent0.setFlags(0x10008000);
                            intent0.putExtra("ruleAdded", true);
                            context0.startActivity(intent0);
                        }
                    }
                }
            }
        }
    }

    public final void b(boolean z) {
        bayn bayn0;
        juo juo0;
        fuyx fuyx0;
        String s2;
        String s1;
        int v;
        huui huui0 = huui.a;
        if(huui0.b().f()) {
            Context context0 = this.a;
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("dndNotificationSharedPreference", 0);
            if(sharedPreferences0 != null && !sharedPreferences0.getBoolean("dndNotificationSent", false)) {
                if(!hups.d()) {
                    v = 1;
                }
                else if(hupy.c() && hqoi.e()) {
                    SharedPreferences sharedPreferences1 = context0.getSharedPreferences("driving_mode_frx_prefs", 0);
                    if(!sharedPreferences1.getBoolean("frx_completed", false) && !sharedPreferences1.getBoolean("gearhead_frx_completed", false) && !hqox.d()) {
                        v = 2;
                        goto label_17;
                    }
                    goto label_11;
                }
                else {
                label_11:
                    v = hups.c() && (!hupv.c() || hupv.c() && z) ? 3 : 1;
                }
            label_17:
                fuyy fuyy0 = this.b;
                Intent intent0 = new Intent();
                switch(v - 1) {
                    case 1: {
                        if(huui.g() && !TextUtils.isEmpty(huui.e()) && !TextUtils.isEmpty(huui.d())) {
                            String s = huui.e();
                            s1 = huui.d();
                            s2 = s;
                        }
                        else {
                            s2 = "Limit interruptions while driving";
                            s1 = "Turn on driving mode automatically";
                        }
                        String s3 = hqor.c() ? "com.google.android.location.drivingmode.DrivingModeFrxActivity" : "com.google.android.gms.carsetup.DrivingModeFrxActivity";
                        intent0.setComponent(new ComponentName(fuyy0.a, s3));
                        intent0.putExtra("com.google.android.location.activity.DRIVING_MODE_NOTIFICATION", true);
                        intent0.setFlags(0x24000000);
                        fuyx0 = new fuyx(s2, s1, avyq.a(fuyy0.a, 0x7F080CFB), cjok.a(fuyy0.a, 0, intent0, 0xA000000));
                        break;
                    }
                    case 2: {
                        intent0.setComponent(new ComponentName(fuyy0.a, "com.google.android.location.settings.ActivityRecognitionPermissionActivity"));
                        intent0.setFlags(0x24000000);
                        fuyx0 = new fuyx("Limit interruptions while driving", "Turn on Do Not Disturb automatically", avyq.a(fuyy0.a, 0x7F080CFB), cjok.a(fuyy0.a, 0, intent0, 0xA000000));
                        break;
                    }
                    default: {
                        fuyx0 = null;
                    }
                }
                evuh evuh0 = evuh.bV;
                if(fuyx0 != null) {
                    try {
                        Bundle bundle0 = new Bundle();
                        if(huui.g() && !TextUtils.isEmpty(huui.c())) {
                            bundle0.putString("android.substName", huui.c());
                        }
                        else {
                            bundle0.putString("android.substName", "System");
                        }
                        juo0 = new juo(context0);
                        juo0.D(fuyx0.a);
                        juo0.k(fuyx0.b);
                        juo0.s(fuyx0.c);
                        juo0.h(true);
                        juo0.h = fuyx0.d;
                        juo0.e(bundle0);
                        bayn0 = bayn.f(context0);
                        if(huui0.b().d()) {
                            goto label_54;
                        }
                        goto label_56;
                    }
                    catch(Exception unused_ex) {
                        return;
                    }
                    try {
                    label_54:
                        bayn0.p(new NotificationChannel("com.google.android.location.activity.dnd.notification.dndNotificationChannel", "New services", 3));
                    }
                    catch(Exception unused_ex) {
                    }
                    try {
                        juo0.J = "com.google.android.location.activity.dnd.notification.dndNotificationChannel";
                    label_56:
                        Notification notification0 = juo0.a();
                        int v1 = fuyv.a;
                        fuyv.a = v1 + 1;
                        bayn0.y("QKFO5tsEEemUURv0IK/OzQ", v1, evuh0, notification0);
                        SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("dndNotificationSharedPreference", 0).edit();
                        sharedPreferences$Editor0.putBoolean("dndNotificationSent", true);
                        sharedPreferences$Editor0.commit();
                        if(huui.f()) {
                            fuyt.a(context0).l(7);
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }
    }

    private final void c() {
        try {
            Intent intent0 = new Intent();
            intent0.setComponent(new ComponentName("com.google.android.gms", "com.google.android.location.settings.DrivingBehaviorSettingActivity"));
            intent0.setFlags(0x10008000);
            this.a.startActivity(intent0);
        }
        catch(ActivityNotFoundException unused_ex) {
        }
    }
}

