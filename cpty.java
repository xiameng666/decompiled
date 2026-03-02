import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import java.util.concurrent.ExecutionException;

public final class cpty {
    public static final String a;

    static {
        cpty.a = bbpz.f("com.google.android.gms.matchstick");
    }

    public static void a(Context context0) {
        try {
            gmcd gmcd0 = figg.a(context0).b.a();
            fift fift0 = new fift();
            long v = hvdq.a.c().c();
            if(System.currentTimeMillis() - ((long)(((Long)((glyq)glzd.f(gmcd0, fift0, gmap.a)).u()))) > v) {
                SilentRegisterIntentOperation.d(new Intent("com.google.android.gms.matchstick.check_registration_with_lighter_action"), context0);
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            fihk.b("IntentHandler", exception0, "Failed to get last registration check value", new Object[0]);
            fijc.b(context0).d(0x8EB, 59);
        }
    }

    public static void b(Context context0) {
        cpty.g(context0, "com.google.android.gms.matchstick.ui.EntryActivity", true);
    }

    public static void c(Context context0) {
        int v = 0;
        try {
            if(context0.getPackageManager().getComponentEnabledSetting(new ComponentName("com.google.android.apps.messaging", "com.google.android.apps.messaging.lighterconversation.LighterEntryPointActivity")) == 1) {
                v = 1;
            }
        }
        catch(IllegalArgumentException unused_ex) {
        }
        cpty.g(context0, "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", ((boolean)(v ^ 1)));
    }

    public static void d(Context context0) {
        String[] arr_s = hvdb.c().split(",");
        String[] arr_s1 = hvdb.a.b().a().split(",");
        int v = 0;
        if(arr_s != null && arr_s1 != null && arr_s.length == arr_s1.length) {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s = arr_s[v1];
                try {
                    long v2 = Long.parseLong(arr_s1[v1]);
                }
                catch(NumberFormatException unused_ex) {
                    break;
                }
                if(fijd.a(context0, s, Long.valueOf(v2))) {
                    v = 1;
                    break;
                }
            }
        }
        cpty.g(context0, "com.google.android.gms.matchstick.ui.LighterMessageIntentActivity", ((boolean)(v ^ 1)));
    }

    public static void e(Context context0) {
        Intent intent0 = new Intent("com.google.android.apps.libraries.matchstick.action.POST_ALL_LIGHTER_CONVERSATION_NOTIFICATIONS");
        if(bbmq.a(context0, "com.google.android.gms.matchstick.net.MessagingService") == 1) {
            fifg fifg0 = MessagingService.a;
            fifg0.a(context0);
            if(!MessagingService.c(intent0, context0)) {
                fifg0.b();
                fihk.a("MessagingService", "Failed to start messaging service", new Object[0]);
            }
        }
        fijc.b(context0).h(0x5A0);
    }

    public static void f(Context context0, String s) {
        cpty.g(context0, s, true);
    }

    private static void g(Context context0, String s, boolean z) {
        try {
            if(hrqz.a.b().a()) {
                bbmq.J(s, z);
                return;
            }
            bbmq.G(context0, s, z);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            fihk.b("IntentHandler", illegalArgumentException0, "Component invalid", new Object[0]);
        }
    }
}

