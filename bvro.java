import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import java.util.concurrent.Callable;

public final class bvro implements Callable {
    public final bvsd a;
    public final gqpe b;
    public final String c;

    public bvro(bvsd bvsd0, gqpe gqpe0, String s) {
        this.a = bvsd0;
        this.b = gqpe0;
        this.c = s;
    }

    @Override
    public final Object call() {
        gqpe gqpe0 = this.b;
        String s = this.c;
        PackageManager packageManager0 = this.a.a.getPackageManager();
        try {
            boolean z = false;
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(gqpe0.b, 0);
            boolean z1 = bvsd.a((gqpe0.e == null ? gqpm.a : gqpe0.e)).s(Long.valueOf(packageInfo0.versionCode));
            if(packageInfo0.applicationInfo != null && packageInfo0.applicationInfo.enabled) {
                z = true;
            }
            return !gqpe0.c || !z1 || gqpe0.d != z ? bvsc.a(s) : bvsc.c();
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return gqpe0.c ? bvsc.a(s) : bvsc.c();
        }
    }
}

