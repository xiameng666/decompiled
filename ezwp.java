import android.content.Context;
import android.os.UserManager;

public final class ezwp {
    public static final boolean a(Context context0) {
        ibuq.f(context0, "context");
        if(hvzk.a.b().a()) {
            return bbmn.x(context0) ? true : bbmn.s(context0);
        }
        return bbmn.u(context0);
    }

    public static final boolean b() {
        return !bbqa.d() || !UserManager.isHeadlessSystemUserMode() ? false : hvzk.d() || hvzk.c();
    }
}

