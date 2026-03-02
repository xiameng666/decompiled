import android.content.Context;
import android.content.pm.PackageManager;

public final class bxjw implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        PackageManager packageManager0 = ((Context)object0).getPackageManager();
        return ((Boolean)bxjt.a.b()).booleanValue() ? packageManager0.hasSystemFeature("android.hardware.type.television") || packageManager0.hasSystemFeature("android.software.leanback") : false;
    }
}

