import android.os.SystemClock;

final class aqd {
    final aqg a;
    private final long b;
    private long c;

    public aqd(aqg aqg0, long v) {
        this.a = aqg0;
        super();
        this.c = -1L;
        this.b = v;
    }

    final int a() {
        if(!this.a.d()) {
            return 700;
        }
        long v = this.c();
        if(v <= 120000L) {
            return 1000;
        }
        return v > 300000L ? 4000 : 2000;
    }

    final int b() {
        long v = this.b;
        int v1 = Long.compare(v, 0L);
        if(!this.a.d()) {
            return v1 <= 0 ? 10000 : Math.min(((int)v), 10000);
        }
        return v1 <= 0 ? 1800000 : Math.min(((int)v), 1800000);
    }

    final long c() {
        long v = SystemClock.uptimeMillis();
        long v1 = this.c;
        if(v1 == -1L) {
            this.c = v;
            v1 = v;
        }
        return v - v1;
    }

    final void d() {
        this.c = -1L;
    }
}

