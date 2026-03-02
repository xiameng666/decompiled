import android.os.SystemClock;

final class absq {
    private long a;

    public absq() {
    }

    public absq(long v) {
        this.a = v;
    }

    public final void a() {
        this.a = 0L;
    }

    public final void b() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c(long v) {
        return Long.compare(this.a, 0L) == 0 ? true : SystemClock.elapsedRealtime() - this.a > v;
    }
}

