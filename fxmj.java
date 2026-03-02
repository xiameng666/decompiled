import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.util.List;

public final class fxmj {
    private static Boolean a;

    static {
    }

    public static gmcd a(Context context0, gxol gxol0) {
        gmcd gmcd0 = fxme.a().a.b(new fxlz(gxol0), gmap.a);
        gmcd0.hB(() -> {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            if(activityManager0 != null) {
                List list0 = activityManager0.getRunningAppProcesses();
                if(list0 != null) {
                    for(Object object0: list0) {
                        if(((ActivityManager.RunningAppProcessInfo)object0).processName.equals("com.google.android.gms.ui")) {
                            Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.location.settings.EAlertSystemStateChangeIntentOperation", "com.google.android.location.settings.EALERT_SYSTEM_STATE_CHANGE");
                            if(intent0 != null) {
                                context0.startService(intent0);
                                return;
                            }
                            break;
                        }
                    }
                }
            }
        }, gmap.a);
        return gmcd0;
    }

    public static gxol b(int v) {
        switch(v) {
            case 5: {
                return gxol.c;
            }
            case 6: 
            case 8: {
                return gxol.d;
            }
            case 10: {
                return gxol.f;
            }
            case 1: 
            case 14: 
            case 15: 
            case 19: {
                return gxol.b;
            }
            default: {
                return gxol.e;
            }
        }
    }

    // Detected as a lambda impl.
    public static void c(Context context0) {
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        if(activityManager0 != null) {
            List list0 = activityManager0.getRunningAppProcesses();
            if(list0 != null) {
                for(Object object0: list0) {
                    if(((ActivityManager.RunningAppProcessInfo)object0).processName.equals("com.google.android.gms.ui")) {
                        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.location.settings.EAlertSystemStateChangeIntentOperation", "com.google.android.location.settings.EALERT_SYSTEM_STATE_CHANGE");
                        if(intent0 != null) {
                            context0.startService(intent0);
                            return;
                        }
                        break;
                    }
                }
            }
        }
    }

    public static void d(Context context0, int v) {
        gxol gxol0 = fxmj.b(v);
        if(gxol0 == gxol.a || !fxmj.i() && gxol0 != gxol.b) {
            return;
        }
        fxmj.a(context0, fxmj.b(v));
    }

    public static boolean e() {
        return huqb.F() && huqb.x() && huqb.w() && fxmg.a().c();
    }

    public static boolean f(Context context0) {
        return bbnp.k(context0);
    }

    public static boolean g() {
        huqb huqb0 = huqb.a;
        if(!huqb0.s().ax()) {
            if(huqb0.s().aw()) {
                return false;
            }
            Context context0 = AppContextProvider.a();
            if(!bbnp.i(context0) && !bbnp.d(context0) && !bbnp.e(context0) && !bbnp.h(context0)) {
                if(fxmj.a == null) {
                    fxmj.a = Boolean.valueOf(bbmn.s(AppContextProvider.a()));
                }
                return fxmj.a == null || !fxmj.a.booleanValue() ? false : fxmj.f(context0) || bbnp.n(context0);
            }
            return false;
        }
        return true;
    }

    public static boolean h() {
        return fxmj.g() && huqb.F() && !huqb.J() && !huqj.c();
    }

    public static boolean i() {
        return !fxmj.g() || !huqb.F() ? false : huqb.J() || huqj.c();
    }
}

