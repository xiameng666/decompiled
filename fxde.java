import android.app.AppOpsManager.OpEntry;
import android.app.AppOpsManager.PackageOps;
import android.app.AppOpsManager;
import android.content.Context;

final class fxde {
    public static final int a;

    static {
        bboh.c("EQMon", bbcu.g, "AppOpps");
    }

    public static long a(AppOpsManager appOpsManager0, String s) {
        long v = -1L;
        for(Object object0: appOpsManager0.getPackagesForOps(new String[]{s})) {
            ((AppOpsManager.PackageOps)object0).getPackageName();
            for(Object object1: ((AppOpsManager.PackageOps)object0).getOps()) {
                v = Math.max(v, ((AppOpsManager.OpEntry)object1).getLastAccessTime(1));
                ((AppOpsManager.OpEntry)object1).getLastAccessTime(1);
            }
        }
        return v;
    }

    static long b(Context context0) {
        return fxde.a(((AppOpsManager)context0.getSystemService("appops")), "android:vibrate");
    }
}

