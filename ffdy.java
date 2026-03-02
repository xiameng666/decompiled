import android.app.usage.UsageStatsManager;
import android.os.Process;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ffdy {
    private final UsageStatsManager a;
    private final Method b;

    public ffdy(UsageStatsManager usageStatsManager0) {
        Method method0 = null;
        if(usageStatsManager0 == null) {
            this.a = null;
            this.b = null;
            return;
        }
        this.a = usageStatsManager0;
        if(usageStatsManager0 != null) {
            try {
                method0 = usageStatsManager0.getClass().getMethod("whitelistAppTemporarily", String.class, Long.TYPE, UserHandle.class);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("DozeInhibitor", "DozeInhibitor: methods not found, disabled");
            }
        }
        this.b = method0;
    }

    public final void a(String s) {
        if(!ffgp.k()) {
            Method method0 = this.b;
            if(method0 != null) {
                if(Log.isLoggable("DozeInhibitor", 2)) {
                    Log.v("DozeInhibitor", "temporarilyInhibit: whitelisting app from doze: " + s);
                }
                long v = hzzi.a.i().G();
                if(v > 0L) {
                    try {
                        method0.invoke(this.a, s, v, Process.myUserHandle());
                    }
                    catch(IllegalAccessException | InvocationTargetException exception0) {
                        Log.e("DozeInhibitor", "temporarilyInhibit: Error whitelisting app from doze, " + s, exception0);
                    }
                }
            }
            else if(Log.isLoggable("DozeInhibitor", 2)) {
                Log.v("DozeInhibitor", "temporarilyInhibit: not initialized, skipping");
            }
        }
        else if(Log.isLoggable("DozeInhibitor", 2)) {
            Log.v("DozeInhibitor", "temporarilyInhibit: local edition companion, skipping");
        }
    }
}

