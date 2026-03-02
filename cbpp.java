import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

public final class cbpp extends cbpb {
    private static final bboh g;
    private final Context h;

    static {
        cbpp.g = bboh.b("SupervisionCoreDownloadClient", bbcu.ac);
    }

    public cbpp(Context context0) {
        ibuq.f(context0, "context");
        ibuq.f(cclw.a, "highSpeedContext");
        super(context0, cclw.a);
        this.h = context0;
    }

    @Override  // cbpb
    public final Object d(Context context0, ibrl ibrl0) {
        return cbpp.j(this);
    }

    public static Object j(cbpp cbpp0) {
        int v;
        PackageInfo packageInfo0;
        try {
            packageInfo0 = cbas.a().b(cbpp0.h);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            a.ae(cbpp.g.j(), "Separate APK hasn\'t been installed.", packageManager$NameNotFoundException0);
            packageInfo0 = null;
        }
        boolean z = true;
        if(packageInfo0 == null) {
            v = 1;
        }
        else {
            long v1 = packageInfo0.getLongVersionCode();
            huld huld0 = huld.a;
            if(v1 < huld0.b().a()) {
                v = 2;
            }
            else {
                v = packageInfo0.getLongVersionCode() >= huld0.b().b() ? 4 : 3;
            }
        }
        if(v == 1) {
            return Boolean.valueOf(false);
        }
        if(!cbpp0.k()) {
            if(huld.c()) {
                cbft.a(cbpp0.h).b("SupervisionCoreDownloadClient", 1);
            }
            else {
                cjmp.a(cbpp0.h, "com.google.android.gms.supervision", 1, 1);
            }
        }
        if(v != 4 || !cbpp0.k()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final boolean k() {
        return this.h.getPackageManager().getApplicationInfo("com.google.android.gms.supervision", 0).enabled;
    }
}

