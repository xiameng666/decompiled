import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public final class beml {
    private final gful_cronetEngineProvider a;

    public beml(PackageManager packageManager0) {
        this.a = gfus.a(((gful_cronetEngineProvider)new bemj(packageManager0)));
        gfus.a(((gful_cronetEngineProvider)() -> {
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.android.chrome", 0);
                if(packageInfo0 != null && packageInfo0.applicationInfo.enabled && !packageInfo0.versionName.isEmpty()) {
                    return gfsx.m(packageInfo0.versionName);
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            return gfqx.a;
        }));
    }

    public final gfsx a() {
        return (gfsx)this.a.mr();
    }

    // Detected as a lambda impl.
    public static gfsx b(PackageManager packageManager0) {
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.android.chrome", 0);
            if(packageInfo0 != null && packageInfo0.applicationInfo.enabled && !packageInfo0.versionName.isEmpty()) {
                return gfsx.m(packageInfo0.versionName);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return gfqx.a;
    }
}

