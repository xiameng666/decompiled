import android.app.PendingIntent;
import com.google.android.gms.auth.proximity.Role;
import java.util.List;

final class algb {
    static boolean a(PendingIntent pendingIntent0, String s) {
        return pendingIntent0.getCreatorPackage().equals(s);
    }

    static boolean b(List list0, Role role0) {
        return list0 == null || list0.isEmpty() ? false : algb.c(role0);
    }

    static boolean c(Role role0) {
        return role0 != null && Role.f(role0.c) && role0.a() != 0;
    }
}

