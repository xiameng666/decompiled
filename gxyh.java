import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.location.LocationManager;

public final class gxyh {
    public static boolean a(PackageManager packageManager0, String s, String s1) {
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x1000);
            int v = 0;
            while(v < packageInfo0.requestedPermissions.length) {
                if(!packageInfo0.requestedPermissions[v].equals(s1)) {
                    ++v;
                    continue;
                }
                return (packageInfo0.requestedPermissionsFlags[v] & 0x10000) != 0;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean b(Context context0, String s, String s1) {
        baqr baqr0 = new baqr();
        baqr0.d = s;
        baqr0.a = bbmq.c(context0, s);
        return new bazk(context0, baqr0).a(s1) == 0;
    }

    public static boolean c(Context context0, String s, String s1, String s2) {
        return cjmf.c(context0, s, 0, bbmq.c(context0, s1), s1, s2) == 0;
    }

    public static boolean d(Context context0) {
        LocationManager locationManager0 = (LocationManager)context0.getSystemService("location");
        return locationManager0 != null && locationManager0.isLocationEnabled();
    }
}

