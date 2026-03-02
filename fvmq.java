import android.os.SystemClock;

final class fvmq {
    private long a;
    private long b;
    private long c;
    private long d;

    public fvmq() {
        this.a = 0x7FFFFFFFFFFFFFFFL;
        this.b = 0x7FFFFFFFFFFFFFFFL;
        this.c = 0x7FFFFFFFFFFFFFFFL;
        this.d = 0x7FFFFFFFFFFFFFFFL;
    }

    public final long a(long v, long v1) {
        synchronized(this) {
        }
        return v - this.d + (this.c - this.a) * 1000000L + v1;
    }

    public final long b(long v, long v1) {
        synchronized(this) {
        }
        return this.d - v + (v1 - this.c) * 1000000L;
    }

    public final long c() {
        synchronized(this) {
        }
        return this.a;
    }

    public final void d(long v, long v1) {
        synchronized(this) {
            if(this.d == 0x7FFFFFFFFFFFFFFFL) {
                this.d = v;
                this.c = v1;
            }
        }
    }

    public final void e(long v) {
        synchronized(this) {
            if(this.a == 0x7FFFFFFFFFFFFFFFL) {
                this.a = v;
            }
            this.b = v;
        }
    }

    public final long f() {
        long v1;
        synchronized(this) {
            v1 = this.b;
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                long v2 = SystemClock.elapsedRealtime();
                this.b = v2;
                return v2;
            }
        }
        return v1;
    }

    public final long g() {
        long v1;
        synchronized(this) {
            v1 = this.a;
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                long v2 = SystemClock.elapsedRealtime();
                this.a = v2;
                return v2;
            }
        }
        return v1;
    }
}

