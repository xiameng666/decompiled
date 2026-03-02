import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class azqk {
    public static boolean a = false;
    public static boolean b = false;
    @Deprecated
    static final AtomicBoolean c;

    static {
        azqk.c = new AtomicBoolean();
        new AtomicBoolean();
    }

    @Deprecated
    public static int a(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static Context b(Context context0) {
        try {
            return context0.createPackageContext("com.google.android.gms", 3);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    public static Resources c(Context context0) {
        try {
            return context0.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    @Deprecated
    public static void d(Context context0) {
        if(!azqk.c.getAndSet(true)) {
            try {
                NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService("notification");
                if(notificationManager0 != null) {
                    notificationManager0.cancel(10436);
                }
            }
            catch(SecurityException unused_ex) {
            }
        }
    }

    public static boolean e(Context context0) {
        return azqk.h(context0) || !bbnp.p();
    }

    @Deprecated
    public static boolean f(Context context0, int v) {
        switch(v) {
            case 1: {
                return azqk.i(context0, "com.google.android.gms");
            }
            case 18: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean g(Context context0) {
        Object object0 = context0.getSystemService("user");
        batl.s(object0);
        Bundle bundle0 = ((UserManager)object0).getApplicationRestrictions("com.google.android.gms");
        return bundle0 != null && "true".equals(bundle0.getString("restricted_profile"));
    }

    public static boolean h(Context context0) {
        if(!azqk.b) {
            try {
                try {
                    PackageInfo packageInfo0 = bbsr.b(context0).e("com.google.android.gms", 0x8000040);
                    azql.c(context0);
                    azqk.a = packageInfo0 != null && !azql.j(packageInfo0, false) && azql.j(packageInfo0, true);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", packageManager$NameNotFoundException0);
                    azqk.b = true;
                    return azqk.a;
                }
            }
            catch(Throwable throwable0) {
                azqk.b = true;
                throw throwable0;
            }
            azqk.b = true;
            return azqk.a;
        }
        return azqk.a;
    }

    public static boolean i(Context context0, String s) {
        boolean z = s.equals("com.google.android.gms");
        if(z && bbna.d()) {
            return false;
        }
        try {
            List list0 = context0.getPackageManager().getPackageInstaller().getAllSessions();
        }
        catch(Exception unused_ex) {
            return false;
        }
        for(Object object0: list0) {
            if(s.equals(((PackageInstaller.SessionInfo)object0).getAppPackageName())) {
                return true;
            }
        }
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(s, 0x2000);
            if(z) {
                return applicationInfo0.enabled;
            }
            if(applicationInfo0.enabled && !azqk.g(context0)) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    @Deprecated
    public static boolean j(int v) {
        return v == 1 || v == 2 || v == 3 || v == 9;
    }

    @Deprecated
    public static void k(Context context0) {
        azpn azpn0 = azpn.d;
        int v = azpn0.m(context0);
        if(v != 0) {
            Intent intent0 = azpn0.k(context0, v, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + v);
            if(intent0 == null) {
                throw new azqi(v);
            }
            throw new azqj(v, "Google Play Services not available", intent0);
        }
    }
}

