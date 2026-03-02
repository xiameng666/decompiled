import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;

public final class azzr extends barh {
    public azzr(Context context0) {
        super(context0);
    }

    @Override  // barh
    public final boolean a(Thread thread0, Throwable throwable0) {
        String s1;
        try {
            String s = bbmu.b(bbmz.e(ModuleManager.get(this.b)).a());
            if(s == null) {
                s1 = "";
            }
            else {
                Iterable iterable0 = gfud.b(50).l(s);
                s1 = new gfss("\n").b(iterable0) + "\nGCore-Chimera-Crash";
            }
            Log.i("GCore-Chimera-Crash", s1);
        }
        catch(RuntimeException runtimeException0) {
            Log.e("GCore-Chimera-Crash", "Hit an exception while processing the UncaughtExceptionHandler:", runtimeException0);
        }
        return false;
    }
}

