import android.content.Context;
import android.os.Binder;
import java.util.List;

public final class cygn {
    public static boolean a(Context context0, int v, int v1, List list0) {
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            String s = (String)object0;
            if(context0.checkPermission(s, v, v1) != 0) {
                ((ggtj)cyjh.a.g().ar(7808)).B("Required permission (%s) missing.", s);
                return false;
            }
        }
        return true;
    }

    public static boolean b(Context context0, String s) {
        return cjbc.a(context0, Binder.getCallingUid(), s);
    }

    public static void c(String s) {
        ((ggtj)cyjh.a.d().ar(7809)).V("PermissionUtils: isPackageHomeAppOnWearable = %b from %s", false, s);
    }
}

