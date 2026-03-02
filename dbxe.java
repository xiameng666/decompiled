import android.app.slice.SliceManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;

public final class dbxe {
    public static final void a(String s, Context context0) {
        ibuq.f(s, "packageName");
        SliceManager sliceManager0 = (SliceManager)context0.getSystemService(SliceManager.class);
        try {
            if(dizt.a(context0, s) == 1) {
                dcvz.a.e().h("Unable to grant slice read permissions to %s because it\'s not a trusted app. Skipping.", s);
                return;
            }
            ggqk ggqk0 = diww.h.E();
            ibuq.e(ggqk0, "iterator(...)");
            while(ggqk0.hasNext()) {
                Uri uri0 = (Uri)ggqk0.next();
                ibuq.c(uri0);
                ibuq.f(s, "packageName");
                ibuq.f(uri0, "uri");
                sliceManager0.grantSlicePermission(s, uri0);
            }
            dcvz.a.b().h("Granted slice and uri permissions to %s", s);
        }
        catch(NullPointerException nullPointerException0) {
            dcvz.a.c().f(nullPointerException0).h("Failed to grant slice permission for %s", s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            dcvz.a.c().f(illegalArgumentException0).h("Failed to grant slice permission for %s", s);
        }
        catch(SecurityException securityException0) {
            dcvz.a.c().f(securityException0).h("Failed to grant slice permission for %s", s);
        }
    }

    public static final boolean b(PackageManager packageManager0, String s, long v) {
        if(Long.compare(v, 0L) < 0) {
            return false;
        }
        try {
            if(((long)packageManager0.getPackageInfo(s, 0).versionCode) >= v) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            dcvz.a.d().f(packageManager$NameNotFoundException0).h("Failed to check package version for %s.", s);
        }
        return false;
    }
}

