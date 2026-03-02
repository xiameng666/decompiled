import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class gxxe {
    private final AtomicLong a;

    public gxxe() {
        this.a = new AtomicLong(0L);
    }

    public final void a() {
        long v = SystemClock.elapsedRealtime();
        this.a.set(v);
    }

    public final boolean b() {
        return Long.compare(this.a.get(), 0L) == 0 ? true : SystemClock.elapsedRealtime() - this.a.get() > TimeUnit.MINUTES.toMillis(hvpg.a.aY().aG());
    }
}

