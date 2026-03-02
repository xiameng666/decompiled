import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Process;

public final class bbna {
    public static int a(PackageInfo packageInfo0) {
        if(packageInfo0 != null && packageInfo0.applicationInfo != null) {
            Bundle bundle0 = packageInfo0.applicationInfo.metaData;
            return bundle0 == null ? -1 : bundle0.getInt("com.google.android.gms.version", -1);
        }
        return -1;
    }

    public static int b(Context context0, String s) {
        return bbna.a(bbna.c(context0, s));
    }

    public static PackageInfo c(Context context0, String s) {
        try {
            return bbsr.b(context0).e(s, 0x80);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    public static boolean d() {
        return bajt.j() && bajt.b == Process.myUid();
    }

    public static boolean e(Context context0, String s) {
        if("com.google.android.gms".equals(s) && bbna.d()) {
            return false;
        }
        try {
            if((bbsr.b(context0).d(s, 0).flags & 0x200000) != 0) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }
}

