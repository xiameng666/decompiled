import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import java.util.concurrent.Callable;

public final class bvrq implements Callable {
    public final bvsd a;
    public final gqpr b;
    public final String c;

    public bvrq(bvsd bvsd0, gqpr gqpr0, String s) {
        this.a = bvsd0;
        this.b = gqpr0;
        this.c = s;
    }

    @Override
    public final Object call() {
        ActivityManager activityManager0 = (ActivityManager)this.a.a.getSystemService("activity");
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
        long v = activityManager$MemoryInfo0.totalMem;
        return bvsd.a((this.b.b == null ? gqpm.a : this.b.b)).s(Long.valueOf(v / 0x400L / 0x400L)) ? bvsc.c() : bvsc.a(this.c);
    }
}

