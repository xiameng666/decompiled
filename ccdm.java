import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

final class ccdm {
    public static final Object a = null;
    public static bjia b = null;
    public static boolean c = false;

    static {
        ccdm.a = new Object();
    }

    public ccdm(Context context0) {
    }

    public static void a(Context context0, boolean z) {
        synchronized(ccdm.a) {
            if(ccdm.c) {
                return;
            }
            Intent intent0 = new Intent("com.google.android.gms.learning.REQUEST_FULL_FEATURE").setPackage("com.google.android.gms").putExtra("requester_package", "com.google.android.gms").putExtra("module_loaded_successfully", z);
            if(Build.VERSION.SDK_INT < 34) {
                context0.sendBroadcast(intent0);
            }
            else {
                context0.sendBroadcast(intent0, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }
    }
}

