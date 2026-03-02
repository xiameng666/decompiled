import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;

public final class aknv {
    public static final Intent a;

    static {
        aknv.a = new Intent().setPackage("com.android.vending").setAction("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");
    }

    public static int a(Context context0) {
        try {
            return bbms.b(context0, "com.android.vending");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return 0;
        }
    }
}

