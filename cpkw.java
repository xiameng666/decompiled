import android.app.ActivityManager;
import android.content.Context;

public final class cpkw implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Context context0 = (Context)object0;
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        Object object1 = context0.getSystemService("activity");
        ibuq.d(object1, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager)object1).clearApplicationUserData();
        return ibom.a;
    }
}

