import android.os.SystemClock;
import j..time.Duration;
import j..util.Objects;

public final class egzh implements AutoCloseable {
    public jqt a;
    public Runnable b;
    private long c;
    private int d;

    public egzh(egzi egzi0) {
        Objects.requireNonNull(egzi0);
        super();
        this.d = 1;
    }

    public final Duration a() {
        synchronized(this) {
            long v1 = hxbk.b() - this.e();
            if(v1 > 0L) {
                return Duration.ofMillis(v1);
            }
        }
        return Duration.ZERO;
    }

    public final boolean b() {
        synchronized(this) {
        }
        return this.d == 2;
    }

    public final boolean c() {
        synchronized(this) {
            if(this.b() && this.e() >= hxbk.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void close() {
        synchronized(this) {
            this.d = 1;
            jqt jqt0 = this.a;
            if(jqt0 != null) {
                jqt0.b(null);
                this.a = null;
            }
            if(hxbk.e()) {
                this.b = null;
            }
        }
    }

    public final void d(long v, Runnable runnable0) {
        synchronized(this) {
            this.d = 2;
            this.c = v;
            this.b = runnable0;
        }
    }

    private final long e() {
        long v1;
        synchronized(this) {
            v1 = SystemClock.elapsedRealtime();
        }
        return v1 - this.c;
    }
}

