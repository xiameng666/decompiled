import android.app.KeyguardManager;
import android.content.Context;

public final class esfh {
    public static boolean a(Context context0) {
        Object object0 = context0.getSystemService("keyguard");
        batl.s(object0);
        return ((KeyguardManager)object0).isDeviceSecure();
    }

    public static boolean b(Context context0) {
        boolean z;
        synchronized(esfh.class) {
            z = esfh.a(context0);
            cjpa cjpa0 = new eubv(context0).c.c();
            cjpa0.e("was_password_sufficient", z);
            cjpd.f(cjpa0);
        }
        return z;
    }
}

