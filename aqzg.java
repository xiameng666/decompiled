import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.concurrent.ExecutionException;

public final class aqzg {
    public static final baun a;
    public static final ggfp b;
    public static final ggfp c;
    public static final ggfp d;

    static {
        aqzg.a = aqql.a("EligibilityFilter");
        aqzg.b = ggfp.K("com.android.calllogbackup", "com.android.providers.blockednumber");
        aqzg.c = ggfp.O("com.android.providers.settings", "android", "com.android.wallpaperbackup", "com.google.android.apps.nexuslauncher", "com.google.android.googlequicksearchbox", "com.google.android.launcher", new String[0]);
        aqzg.d = new ggoh("com.android.providers.telephony");
    }

    public static aqzf a(Context context0, PackageInfo packageInfo0) {
        if(!aqjl.a.m(context0)) {
            aqzg.a.m("Rejecting backup of %s. Full data backup does not have consent", new Object[]{packageInfo0.packageName});
            return aqzf.g;
        }
        if(!aqzg.h(context0, packageInfo0.packageName)) {
            aqzg.a.m("Rejecting backup of %s. Package does not have consent.", new Object[]{packageInfo0.packageName});
            return aqzf.h;
        }
        aqzf aqzf0 = aqzg.b(context0, packageInfo0);
        return aqzf0 == aqzf.a ? aqzf.a : aqzf0;
    }

    public static aqzf b(Context context0, PackageInfo packageInfo0) {
        String s = packageInfo0.packageName;
        hqlt hqlt0 = hqlt.a;
        if(hqlt0.o().an()) {
            for(Object object0: hqlt0.o().B().b) {
                asdr asdr0 = (asdr)object0;
                if(!asdr0.b.equals(packageInfo0.packageName)) {
                    continue;
                }
                long v = packageInfo0.getLongVersionCode();
                long v1 = asdr0.c;
                baun baun0 = aqzg.a;
                baun0.h("Checking if installed version of %s (%d) > min allowed (%d) for full-data backup", new Object[]{packageInfo0.packageName, v, v1});
                if(v < v1) {
                    break;
                }
                baun0.h(a.a(s, "Accepting ", ", version allowed for full-data backup."), new Object[0]);
                return aqzf.a;
            }
        }
        else if(aqzg.e(packageInfo0, (bbnp.d(context0) ? hqlt0.o().L() : hqlt0.o().H()))) {
            aqzg.a.h(a.a(s, "Accepting ", ", allowed for full-data backup."), new Object[0]);
            return aqzf.a;
        }
        if(aqzg.e(packageInfo0, hqlt.p())) {
            aqzg.a.h(a.a(s, "Rejecting ", ", denied for full-data backup."), new Object[0]);
            return aqzf.b;
        }
        if(!bbnp.d(context0)) {
            if(hqlt0.o().ab() && (s.startsWith("com.google.") || s.startsWith("com.android.") || hqlt0.o().ac() && s.startsWith("com.fitbit."))) {
                aqzg.a.h(a.a(s, "Rejecting ", ", it\'s a first party app."), new Object[0]);
                return aqzf.i;
            }
            int v2 = (int)hqlt.e();
            if(v2 != 0 && packageInfo0.applicationInfo != null && 36 < v2) {
                aqzg.a.j(a.a(s, "Rejecting ", ", targetSdkVersion too low."), new Object[0]);
                return aqzf.c;
            }
            return aqzf.a;
        }
        aqzg.a.h(a.a(s, "Rejecting ", ", current device is a sidewinder device."), new Object[0]);
        return aqzf.f;
    }

    public static aqzf c(Context context0, PackageInfo packageInfo0) {
        aqzf aqzf0 = aqzg.d(context0, packageInfo0);
        aqzf aqzf1 = aqzf.a;
        if(aqzf0 != aqzf1) {
            return aqzf0;
        }
        return aqzg.h(context0, packageInfo0.packageName) ? aqzf1 : aqzf.h;
    }

    public static aqzf d(Context context0, PackageInfo packageInfo0) {
        String s = packageInfo0.packageName;
        if(!aqzg.e(packageInfo0, (bbnp.d(context0) ? hqlt.a.o().M() : hqlt.a.o().K()))) {
            if(aqzg.e(packageInfo0, hqlt.p())) {
                aqzg.a.j(a.a(s, "Rejecting ", ", denied for key-value backup."), new Object[0]);
                return aqzf.b;
            }
            return bbnp.d(context0) ? aqzf.f : aqzf.a;
        }
        aqzg.a.j(a.a(s, "Accepting ", ", allowed for key-value backup."), new Object[0]);
        return aqzf.a;
    }

    public static boolean e(PackageInfo packageInfo0, String s) {
        String s1 = packageInfo0.packageName;
        return bbnh.h(s.split(",")).contains(s1);
    }

    public static boolean f(PackageInfo packageInfo0) {
        return packageInfo0.applicationInfo == null ? false : packageInfo0.applicationInfo.backupAgentName != null && (packageInfo0.applicationInfo.flags & 0x4000000) == 0;
    }

    public static boolean g(Context context0, PackageInfo packageInfo0, int v) {
        int v1;
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("TargetProtoDataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)aqhz.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        try {
            v1 = (int)(((Integer)((glyq)aqka.a(frli0)).u()));
        }
        catch(InterruptedException | ExecutionException exception0) {
            aqzg.a.n("Failed to get target device SDK version from proto data store", exception0, new Object[0]);
            v1 = -1;
        }
        aqzg.a.h("Checking target sdk version %d for package %s (requires minsdk %d)", new Object[]{v1, packageInfo0.packageName, v});
        return v1 < v;
    }

    public static boolean h(Context context0, String s) {
        aqjl aqjl0 = aqjl.a;
        if(s.equals("com.android.providers.telephony")) {
            return aqjl0.n(context0);
        }
        if(s.equals("com.android.calllogbackup") && !aqjl0.k(context0)) {
            if(aqjl0.m(context0)) {
                aqjl0.b(context0, true);
                return true;
            }
            return false;
        }
        return true;
    }
}

