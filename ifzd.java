import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;

public final class ifzd implements Runnable {
    public final int a;
    public final boolean b;
    public final int c;
    public final Runnable d;

    public ifzd(int v, boolean z, int v1, Runnable runnable0) {
        this.a = v;
        this.b = z;
        this.c = v1;
        this.d = runnable0;
    }

    @Override
    public final void run() {
        int v = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.a);
        Runnable runnable0 = this.d;
        boolean z = this.b;
        if(z) {
            ThreadStatsUid.set(this.c);
        }
        try {
            runnable0.run();
        }
        catch(Throwable throwable0) {
            if(z) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(v);
            throw throwable0;
        }
        if(z) {
            ThreadStatsUid.clear();
        }
        TrafficStats.setThreadStatsTag(v);
    }
}

