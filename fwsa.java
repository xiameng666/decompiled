import android.os.SystemClock;

public final class fwsa {
    public boolean a;
    public long b;
    public long c;
    private long d;

    public fwsa(boolean z) {
        long v = SystemClock.elapsedRealtime();
        this.a = z;
        this.d = v;
        this.b = v;
        this.c = this.a();
    }

    public final long a() {
        return Math.max(this.d, this.b);
    }

    public final void b(boolean z) {
        this.a = z;
        this.d = SystemClock.elapsedRealtime();
        this.c = this.a();
    }
}

