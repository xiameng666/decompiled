import android.os.Build.VERSION;
import android.os.Process;
import com.google.android.gms.chimera.modules.platformconfigurator.AppContextProvider;

public final class eivn {
    public static final int a;

    static {
        bboh.b("PlatformConfigurator", bbcu.df);
    }

    public static String a(String s) {
        return "com.google.android.platform." + s;
    }

    public static boolean b() {
        if(hxoi.a.d().h()) {
            AppContextProvider.a();
            return Process.myUserHandle().isSystem();
        }
        return Process.myUserHandle().isOwner();
    }

    public static boolean c(eivi eivi0) {
        return hxon.c() && eivi0 != null && Build.VERSION.SDK_INT >= 35 && at.a();
    }
}

