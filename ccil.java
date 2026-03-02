import android.content.Context;
import android.os.Build.VERSION;

public final class ccil {
    public static final ccim a(Context context0) {
        ccim ccim0;
        ibuq.f(context0, "context");
        synchronized(ccim.class) {
            ccim0 = ccim.a;
            if(ccim0 == null) {
                Context context1 = context0.getApplicationContext();
                ibuq.e(context1, "getApplicationContext(...)");
                ccim0 = new ccim(context1);
                ccim.a = ccim0;
            }
        }
        return ccim0;
    }

    public static final boolean b() {
        if(bbqa.a()) {
            if(Build.VERSION.SDK_INT < 36) {
                if(!au.a) {
                    au.b();
                }
                return au.b;
            }
            return true;
        }
        return false;
    }
}

