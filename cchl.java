import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.libs.accountsettings.utils.DarkThemeManager.1;

public final class cchl implements lom {
    public static Boolean a;
    public static Boolean b;
    public final Activity c;
    public final boolean d;
    private final boolean e;
    private final BroadcastReceiver f;

    public cchl(Activity activity0, int v, int v1, gsac gsac0) {
        this.c = activity0;
        boolean z = false;
        if(gsac0 == gsac.b) {
            cchl.b = Boolean.valueOf(false);
        }
        else if(gsac0 == gsac.c) {
            cchl.b = Boolean.valueOf(true);
        }
        hoju.a.b().A();
        if(gsac0 != gsac.a) {
            z = true;
        }
        this.e = z;
        cchl.a = Boolean.valueOf(cchl.c());
        boolean z1 = cchl.d();
        this.d = z1;
        if(z1) {
            v = v1;
        }
        activity0.setTheme(v);
        DarkThemeManager.1 darkThemeManager$10 = new DarkThemeManager.1(this);
        this.f = darkThemeManager$10;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        activity0.registerReceiver(darkThemeManager$10, intentFilter0);
        ((lps)activity0).getLifecycle().c(this);
    }

    public static gsac a() {
        Boolean boolean0 = cchl.b;
        if(boolean0 == null) {
            return gsac.a;
        }
        return boolean0.booleanValue() ? gsac.c : gsac.b;
    }

    public static boolean b() {
        return (babh.a().getResources().getConfiguration().uiMode & 0x30) == 0x20;
    }

    public static boolean c() {
        return ((PowerManager)babh.a().getSystemService("power")).isPowerSaveMode();
    }

    public static boolean d() {
        synchronized(cchl.class) {
            if(cchl.a == null) {
                cchl.a = Boolean.valueOf(cchl.c());
            }
        }
        return cchl.e(cchl.a.booleanValue(), cchl.b());
    }

    public static boolean e(boolean z, boolean z1) {
        return cchl.b == null ? z1 || z : cchl.b.booleanValue();
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        this.c.unregisterReceiver(this.f);
        cchl.a = null;
        if(this.e) {
            cchl.b = null;
        }
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

