import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;
import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class fxej extends fxov {
    private final Context a;
    private ScheduledExecutorService b;

    static {
        bboh.c("EQMon", bbcu.g, "MemRCL");
    }

    public fxej(Context context0, fxnw fxnw0) {
        super(fxnw0);
        this.a = context0;
    }

    public static int a(Context context0) {
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        if(activityManager0 == null) {
            return -1;
        }
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
        return (int)(activityManager$MemoryInfo0.availMem / 0x400L);
    }

    @Override  // fxov
    public final fxou b() {
        Context context0 = this.a;
        if(fxej.a(context0) < 0) {
            if(huwd.a.n().aO()) {
                return huwd.a.n().aQ() ? new fxou(1, 18) : new fxou(2, 18);
            }
        }
        else if(((long)fxej.a(context0)) < huwd.a.n().N()) {
            return huwd.a.n().aQ() ? new fxou(1, 18) : new fxou(2, 18);
        }
        return fxou.b;
    }

    @Override  // fxov
    public final void f() {
        bbll bbll0 = new bbll(1, 10);
        this.b = bbll0;
        fxnw fxnw0 = this.i;
        Objects.requireNonNull(fxnw0);
        bbll0.a(new fxei(fxnw0), huwd.i(), huwd.i(), TimeUnit.MILLISECONDS);
    }

    @Override  // fxov
    public final void g() {
        ScheduledExecutorService scheduledExecutorService0 = this.b;
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdownNow();
            this.b = null;
        }
    }
}

