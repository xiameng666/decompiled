import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;

public final class gxvd {
    public final Context a;

    public gxvd(Context context0) {
        this.a = context0;
    }

    public final Bitmap a(int v) {
        return BitmapFactory.decodeResource(this.a.getResources(), v);
    }

    public static boolean b(bsaq bsaq0) {
        return hvqf.a.n().A() && bsaq0 != null && bsaq0.t();
    }

    public static boolean c(bsaq bsaq0) {
        return bsaq0 != null && bsaq0.v();
    }

    public static boolean d(Context context0, gxvc gxvc0) {
        boolean z = hvoz.a.f().F() ? gxvc0.d : !gxvc0.b && !gxvc0.c;
        return !hvoz.a.f().A() || Build.VERSION.SDK_INT < Math.max(19, ((int)hvoz.a.f().i())) || !z || gxvc0.a ? false : hvoz.a.f().w() || context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static boolean e(Context context0, gxvc gxvc0, bsaq bsaq0) {
        if(gxvd.d(context0, gxvc0)) {
            return gxvd.c(bsaq0) || gxvd.b(bsaq0) ? cjer_LocationSettings.p(context0) || hvoz.g() : false;
        }
        return false;
    }

    public final int f() {
        NetworkInfo networkInfo0 = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkInfo0 != null && networkInfo0.isConnectedOrConnecting()) {
            switch(networkInfo0.getType()) {
                case 0: {
                    return 4;
                }
                case 1: {
                    return 3;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }
}

