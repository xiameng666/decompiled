import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.app.phone.settings.licenses.LicenseSourceWrapper;

public final class abua extends lny {
    public static final gged_interceptors a;
    public final lqi b;
    public final lqi c;

    static {
        abua.a = gged_interceptors.u(new Pair("com.google.android.apps.stargate", "Satellite Gateway"), new Pair("com.google.android.ims", "Carrier Service"), new Pair("com.google.android.apps.camera.services", "Pixel Camera Services"), new Pair("com.google.android.apps.restore", "Data Restore Tool"), new Pair("com.google.android.apps.pixelmigrate", "Data Transfer Tool"), new Pair("com.google.android.apps.turbo", "Device Health Services"), new Pair("com.google.android.gms.pay.sidecar", "Google Play Services for Google Pay"), new Pair("com.google.android.gms.supervision", "System Parental Controls"), new Pair("com.google.ambient.streaming", "Cross-Device Services"), new Pair("com.google.android.apps.pixel.dcservice", "Device Connectivity Service"));
    }

    public abua(Application application0) {
        bblp bblp0 = new bblp(1, 10);
        super(application0);
        this.b = new lqi();
        this.c = new lqi(Boolean.valueOf(false));
        bblp0.execute(new abtz(this));
    }

    public final void b(gged_interceptors gged0, ggfp ggfp0, ggdy ggdy0) {
        ApplicationInfo applicationInfo0;
        Application application0 = this.a();
        PackageManager packageManager0 = application0.getPackageManager();
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            String s = (String)gged0.get(v);
            if(!ggfp0.contains(s)) {
                try {
                    applicationInfo0 = packageManager0.getApplicationInfo(s, 0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    continue;
                }
                if(azqx.c(application0, s).b()) {
                    ggdy0.i(new LicenseSourceWrapper(s, applicationInfo0.loadLabel(packageManager0).toString(), s));
                }
            }
        }
    }
}

