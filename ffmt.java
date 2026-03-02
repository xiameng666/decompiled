import android.os.SystemClock;
import android.util.Log;
import java.util.Random;

public final class ffmt {
    private final String a;
    private final Random b;
    private long c;
    private long d;
    private long e;

    public ffmt(Random random0) {
        this.b = random0;
        this.a = "CloudNode";
        this.d();
    }

    public final long a() {
        synchronized(this) {
        }
        return this.c * 1000L;
    }

    public final long b() {
        synchronized(this) {
        }
        return this.d + this.c * 1000L;
    }

    public final void c() {
        long v = hzzi.a.i().n();
        long v1 = hzzi.a.i().r();
        long v2 = hzzi.a.i().o();
        synchronized(this) {
            this.d = SystemClock.elapsedRealtime();
            long v4 = this.c;
            if(v4 == 0L) {
                this.c = v;
            }
            else if(this.e == 0L) {
                long v5 = (long)(((int)Math.round(((double)v1) + this.b.nextDouble() * ((double)v1))));
                this.e = v5;
                this.c = v5;
            }
            else {
                this.c = Math.min(v4 + v4, v2);
            }
            String s = this.a;
            if(Log.isLoggable(s, 2)) {
                Log.v(s, "RateLimiter: onError, next retry delay is " + this.c);
            }
        }
    }

    public final void d() {
        synchronized(this) {
            String s = this.a;
            if(Log.isLoggable(s, 2)) {
                Log.v(s, "RateLimiter: reset");
            }
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
        }
    }
}

