import android.os.SystemClock;

public final class foty {
    public final long a;
    public final long b;

    public foty() {
        throw null;
    }

    public foty(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public static foty a(fgvt fgvt0) {
        return new foty(SystemClock.elapsedRealtime(), fgvt0.c().toMillis());
    }

    public static foty b() {
        return new foty(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foty) && this.a == ((foty)object0).a && this.b == ((foty)object0).b;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.b ^ this.b >>> 0x20)) ^ (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }
}

