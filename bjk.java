import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.util.LinkedHashSet;
import java.util.Set;

public final class bjk {
    public final boolean a;
    public final bjj b;
    private final Context c;
    private final bab d;

    public bjk(Context context0, bab bab0) {
        ibuq.f(context0, "context");
        boolean z1;
        super();
        this.c = context0;
        this.d = bab0;
        boolean z = true;
        if(Build.VERSION.SDK_INT >= 34) {
            ibuq.f(context0, "context");
            z1 = context0.getDeviceId() != 0;
        }
        else {
            z1 = false;
        }
        this.a = z1;
        PackageManager packageManager0 = context0.getPackageManager();
        Integer integer0 = bab0 == null ? null : bab0.b();
        boolean z2 = packageManager0.hasSystemFeature("android.hardware.camera") && (integer0 == null || ((int)integer0) == 1);
        if(!packageManager0.hasSystemFeature("android.hardware.camera.front") || integer0 != null && ((int)integer0) != 0) {
            z = false;
        }
        this.b = new bjj(z2, z);
    }

    public static final boolean a(Set set0, bab bab0) {
        try {
            bab0.a(new LinkedHashSet(set0));
            return true;
        }
        catch(IllegalArgumentException unused_ex) {
            return false;
        }
    }
}

