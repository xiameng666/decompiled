import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.util.Base64;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class ailf {
    public final Context a;
    public static final baun b;
    private static ailf c;
    private final bayn d;

    static {
        ailf.b = new baun(new String[]{"TransactionStarter"});
    }

    private ailf(Context context0) {
        this.a = context0;
        this.d = bayn.f(context0);
    }

    public final PendingIntent a(long v) {
        Intent intent0 = new Intent("AUTHZEN_ACTIVITY_EXPIRED");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("creation_elapsed_time", v);
        intent0.addCategory("creation_elapsed_time:" + v);
        return PendingIntent.getBroadcast(this.a, 0, intent0, 0x42000000);
    }

    public static ailf b(Context context0) {
        if(ailf.c == null) {
            ailf.c = new ailf(context0);
        }
        return ailf.c;
    }

    static hhqb c(hhqx hhqx0, boolean z) {
        if(z && ((hhqx0.e == null ? hhqw.b : hhqx0.e).c & 0x1000) != 0) {
            hhqb hhqb0 = (hhqx0.e == null ? hhqw.b : hhqx0.e).o;
            return hhqb0 == null ? hhqb.a : hhqb0;
        }
        if(((hhqx0.e == null ? hhqw.b : hhqx0.e).c & 0x800) != 0) {
            hhqb hhqb1 = (hhqx0.e == null ? hhqw.b : hhqx0.e).n;
            return hhqb1 == null ? hhqb.a : hhqb1;
        }
        return null;
    }

    public static String d(hhqx hhqx0) {
        hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
        return "authzen:notificationTag:" + (hhqw0.g == null ? hhpt.a : hhqw0.g).b + ":" + (hhqw0.g == null ? hhpt.a : hhqw0.g).c;
    }

    public final void e(String s) {
        if(hpqx.g()) {
            this.d.o(s, 1, evuh.bt);
            return;
        }
        this.d.n(s, 1);
    }

    final void f(Intent intent0) {
        if(hpqx.h()) {
            ailf.b.d("Cancel dismiss notification task", new Object[0]);
            String s = ailf.d(aiko.o(intent0));
            cljp.a(this.a).d("dismiss:" + s, "com.google.android.gms.auth.authzen.AuthzenGcmTaskService");
            return;
        }
        aild.h(aiko.o(intent0).c.toByteArray(), 13, this.a);
        PendingIntent pendingIntent0 = this.i(intent0);
        new bbib(this.a).a(pendingIntent0);
    }

    public final void g(Intent intent0, String s) {
        if(cjok.a(this.a, 0, intent0, 0x62000000) != null && this.j(intent0) != null) {
            this.f(intent0);
            PendingIntent pendingIntent0 = this.j(intent0);
            if(pendingIntent0 != null) {
                try {
                    pendingIntent0.send();
                }
                catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                    ailf.b.i("PendingIntent cancelled", pendingIntent$CanceledException0, new Object[0]);
                }
            }
            this.e(s);
        }
    }

    public final void h(hhqx hhqx0, Intent intent0, long v, long v1, boolean z) {
        Notification notification0;
        String s2;
        hhpy hhpy0;
        intent0.putExtra("creation_elapsed_time", v);
        intent0.putExtra("creation_wall_time", v1);
        String s = ailf.d(hhqx0);
        intent0.addCategory(s);
        Intent intent1 = new Intent("AUTHZEN_REPLACE_ACTIVITY");
        intent1.setPackage("com.google.android.gms");
        intent1.putExtra("notification_tag", s);
        intent1.putExtra("transaction_id", hhqx0.c.toByteArray());
        Context context0 = this.a;
        context0.sendBroadcast(intent1);
        if(!z) {
            this.g(intent0, s);
        }
        hhqc hhqc0 = null;
        if(z && ((hhqx0.e == null ? hhqw.b : hhqx0.e).c & 0x40) != 0) {
            hhpy0 = hhpy.b((hhqx0.e == null ? hhqw.b : hhqx0.e).i);
            if(hhpy0 == null) {
                hhpy0 = hhpy.a;
            }
        }
        else if(((hhqx0.e == null ? hhqw.b : hhqx0.e).c & 0x20) == 0) {
            hhpy0 = null;
        }
        else {
            hhpy0 = hhpy.b((hhqx0.e == null ? hhqw.b : hhqx0.e).h);
            if(hhpy0 == null) {
                hhpy0 = hhpy.a;
            }
        }
        if(hhpy0 != hhpy.d) {
            hhqb hhqb0 = ailf.c(hhqx0, z);
            if(z && (hhqx0.b & 0x400) != 0) {
                hhqc0 = hhqx0.i;
                if(hhqc0 == null) {
                    hhqc0 = hhqc.a;
                }
            }
            else if((hhqx0.b & 0x200) != 0) {
                hhqc0 = hhqx0.h;
                if(hhqc0 == null) {
                    hhqc0 = hhqc.a;
                }
            }
            boolean z1 = true;
            if(this.m(hhpy0, hhqc0)) {
                PendingIntent pendingIntent0 = this.i(intent0);
                long v2 = intent0.getLongExtra("creation_elapsed_time", SystemClock.elapsedRealtime());
                long v3 = aild.f(hhqx0);
                if(v3 < 0L) {
                    v3 = 0L;
                }
                aild.h(hhqx0.c.toByteArray(), 7, context0);
                if(hpqx.h()) {
                    long v4 = TimeUnit.MILLISECONDS.toSeconds(v3);
                    String s1 = intent0.getStringExtra("account");
                    byte[] arr_b = intent0.getByteArrayExtra("encryption_key_handle");
                    hhqx hhqx1 = aiko.o(intent0);
                    s2 = s;
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("account", s1);
                    bundle0.putString("encryption_key_handle", Base64.encodeToString(arr_b, 2));
                    bundle0.putString("tx_request", Base64.encodeToString(hhqx1.toBytesArray(), 2));
                    String s3 = ailf.d(hhqx1);
                    clkn clkn0 = new clkn();
                    clkn0.j = "com.google.android.gms.auth.authzen.AuthzenGcmTaskService";
                    clkn0.t("dismiss:" + s3);
                    clkn0.p = true;
                    clkn0.e(v4, 60L + v4);
                    clkn0.v(1);
                    clkn0.u = bundle0;
                    clko clko0 = clkn0.a();
                    cljp.a(context0).f(clko0);
                    Object[] arr_object = {aild.b(hhqx0.c.toByteArray()), v4};
                    ailf.b.h("Scheduling Gcm task to dismiss notification (txId=%s) in %s seconds", arr_object);
                }
                else {
                    s2 = s;
                    new bbib(context0).i("AuthzenNotificationAlarm", 2, v2 + v3, pendingIntent0, "com.google.android.gms");
                    Object[] arr_object1 = {aild.b(hhqx0.c.toByteArray()), TimeUnit.MILLISECONDS.toSeconds(v3)};
                    ailf.b.h("Scheduling notification-based prompt (txId=%s) to be killed in %s seconds.", arr_object1);
                }
                if(bbqr.d(hpqx.f())) {
                label_102:
                    if(hhpy0 != hhpy.c && hhpy0 != hhpy.a) {
                        ailf.b.d("Starting notification-based prompt: interaction_type=%s", new Object[]{hhpy0});
                    }
                    else {
                        ailf.b.d("Starting activity-based prompt: interaction_type=%s", new Object[]{hhpy0});
                        context0.startActivity(intent0);
                    }
                    notification0 = this.o(intent0, hhqb0, hhqc0);
                }
                else {
                    UiModeManager uiModeManager0 = (UiModeManager)context0.getSystemService("uimode");
                    if(uiModeManager0 != null) {
                        int v5 = uiModeManager0.getCurrentModeType();
                        if(ccmc.a(hpqx.f(), Integer.toString(v5))) {
                            ailf.b.d("Starting notification-based prompt: interaction_type=%s", new Object[]{hhpy0});
                            notification0 = this.o(intent0, hhqb0, hhqc0);
                            goto label_109;
                        }
                    }
                    goto label_102;
                }
            label_109:
                if(hpqx.g()) {
                    this.d.y(s2, 1, evuh.bt, notification0);
                }
                else {
                    this.d.x(s2, 1, notification0);
                }
                aild.h(hhqx0.c.toByteArray(), 3, context0);
            }
            else {
                if(z) {
                    hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
                    if(this.m((hhpy.b(hhqw0.h) == null ? hhpy.a : hhpy.b(hhqw0.h)), (hhqx0.h == null ? hhqc.a : hhqx0.h))) {
                        if(hpqx.g()) {
                            this.d.o(s, 1, evuh.bt);
                        }
                        else {
                            this.d.n(s, 1);
                        }
                    }
                }
                hhqb hhqb1 = ailf.c(hhqx0, z);
                Uri uri0 = this.l(hhqb1);
                if(uri0 == null) {
                    z1 = z;
                }
                else if(!z) {
                    z1 = false;
                    RingtoneManager.getRingtone(context0, uri0).play();
                }
                else if(!uri0.equals(this.l(ailf.c(hhqx0, false)))) {
                    RingtoneManager.getRingtone(context0, uri0).play();
                }
                long[] arr_v = ailf.n(hhqb1);
                if(arr_v != null && (!z1 || !Arrays.equals(arr_v, ailf.n(ailf.c(hhqx0, false))))) {
                    ((Vibrator)context0.getSystemService("vibrator")).vibrate(arr_v, -1);
                }
                aild.h(hhqx0.c.toByteArray(), 4, context0);
                context0.startActivity(intent0);
            }
            if(z) {
                TransactionReplyIntentOperation.c(hhqx0.c.toByteArray());
            }
        }
    }

    private final PendingIntent i(Intent intent0) {
        Intent intent1 = new Intent(intent0);
        intent1.setAction("AUTHZEN_NOTIFICATION_EXPIRED");
        intent1.setClassName(this.a, "com.google.android.gms.auth.authzen.GcmReceiverService");
        return PendingIntent.getService(this.a, 0, intent1, 0x42000000);
    }

    private final PendingIntent j(Intent intent0) {
        return this.k(intent0, 0x62000000);
    }

    private final PendingIntent k(Intent intent0, int v) {
        Intent intent1 = new Intent(intent0);
        intent1.setAction("AUTHZEN_NOTIFICATION_DISMISSED");
        intent1.setClassName(this.a, "com.google.android.gms.auth.authzen.GcmReceiverService");
        return PendingIntent.getService(this.a, 0, intent1, v);
    }

    private final Uri l(hhqb hhqb0) {
        if(hhqb0 != null && (hhqb0.b & 4) != 0) {
            int v = hhqb0.c;
            int v1 = hhqa.a(v);
            int v2 = 1;
            if(v1 == 0) {
                v1 = 1;
            }
            switch(v1 - 1) {
                case 0: {
                    break;
                }
                case 2: 
                case 3: {
                    Uri uri0 = RingtoneManager.getDefaultUri(2);
                    return MediaStore.getRedactedUri(this.a.getContentResolver(), uri0);
                }
                default: {
                    int v3 = hhqa.a(v);
                    baun baun0 = ailf.b;
                    if(v3 != 0) {
                        v2 = v3;
                    }
                    baun0.m("Unknown sound type: " + Integer.toString(v2 - 1), new Object[0]);
                    return null;
                }
            }
        }
        return null;
    }

    private final boolean m(hhpy hhpy0, hhqc hhqc0) {
        if(hhqc0 == null) {
            return false;
        }
        if(bbqr.d(hhqc0.c)) {
            return false;
        }
        if(hhpy0 == hhpy.a) {
            return false;
        }
        if(hhpy0 == hhpy.b) {
            return true;
        }
        if(hhpy0 == hhpy.c) {
            return !new aiig(this.a).a();
        }
        ailf.b.f("Unknown interaction type: " + hhpy0, new Object[0]);
        return false;
    }

    private static long[] n(hhqb hhqb0) {
        if(hhqb0 != null && hhqb0.e.size() > 0) {
            hfui hfui0 = hhqb0.e;
            long[] arr_v = new long[hfui0.size()];
            int v = 0;
            for(Object object0: hfui0) {
                arr_v[v] = (long)(((Long)object0));
                ++v;
            }
            return arr_v;
        }
        return null;
    }

    private final Notification o(Intent intent0, hhqb hhqb0, hhqc hhqc0) {
        Intent intent1 = new Intent(intent0);
        intent1.setFlags(0x20000);
        int v = avyq.a(this.a, 0x7F08025A);
        juo juo0 = new juo(this.a);
        juo0.h(true);
        juo0.v = "authzen_notification_group";
        juo0.E = hhqb0.h;
        juo0.y = true;
        juo0.h = cjok.a(this.a, 0, intent1, 0x4A000000);
        juo0.l(this.k(intent1, 0x42000000));
        juo0.s(v);
        juo0.H(BitmapFactory.decodeResource(this.a.getResources(), 0x7F08025B));
        juo0.K(hhqb0.g);
        juo0.o = hhqb0.f;
        juo0.m = hhqb0.d;
        juo0.D(hhqc0.c);
        String s = null;
        if((hhqc0.b & 16) != 0 && (hhqc0.b & 4) != 0 && (hhqc0.b & 0x20) != 0) {
            String s1 = "authzen:" + hhqc0.f + ":";
            String s2 = hhqc0.e;
            int v1 = hhqc0.g;
            Integer integer0 = v1;
            int v2 = hhqc0.h;
            String s3 = s1 + v2;
            if(v2 != 0) {
                bayn bayn0 = this.d;
                for(Object object0: bayn0.i()) {
                    String s4 = ((NotificationChannel)object0).getId();
                    if(s4.startsWith(s1)) {
                        goto label_31;
                    }
                    continue;
                    try {
                    label_31:
                        int v3 = Integer.parseInt(s4.substring(s1.length()));
                        Integer.valueOf(v3).getClass();
                        if(v3 >= v2) {
                            continue;
                        }
                        bayn0.s(s4);
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
            integer0.getClass();
            NotificationChannel notificationChannel0 = new NotificationChannel(s3, s2, v1);
            Uri uri0 = this.l(hhqb0);
            if(uri0 != null) {
                notificationChannel0.setSound(uri0, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
            long[] arr_v = ailf.n(hhqb0);
            if(arr_v != null) {
                notificationChannel0.setVibrationPattern(arr_v);
            }
            this.d.p(notificationChannel0);
            s = s3;
        }
        if(s != null) {
            juo0.J = s;
        }
        if((hhqc0.b & 2) != 0) {
            juo0.k(hhqc0.d);
        }
        Uri uri1 = this.l(hhqb0);
        if(uri1 != null) {
            juo0.P(uri1);
        }
        long[] arr_v1 = ailf.n(hhqb0);
        if(arr_v1 != null) {
            juo0.x(arr_v1);
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("android.substName", "Google");
        juo0.e(bundle0);
        return juo0.a();
    }
}

