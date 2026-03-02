import android.os.SystemClock;

final class audn {
    public long a;
    public long b;
    public long c;

    public audn() {
        this.a = 15000L;
    }

    public final long a() {
        if(Long.compare(this.c, 0L) != 0) {
            long v = SystemClock.elapsedRealtime();
            long v1 = this.b;
            if(v1 == 0L) {
                return 0L;
            }
            if(v - this.c >= this.a) {
                this.c = 0L;
                return -1L;
            }
            long v2 = 3000L - (v - v1);
            return v2 <= 0L ? 0L : v2;
        }
        return -1L;
    }

    public final boolean b() {
        long v = this.c;
        this.c = 0L;
        this.b = 0L;
        return v != 0L;
    }

    public final boolean c() {
        return this.c != 0L;
    }
}

