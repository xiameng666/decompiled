import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public final class fpwp {
    public static int a(PackageManager packageManager0, String s) {
        try {
            return packageManager0.getPackageInfo(s, 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ggsf.a.r(bbop.a, Integer.valueOf(0xE5));
            return -1;
        }
    }
}

