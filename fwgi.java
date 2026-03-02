import android.os.SystemClock;
import j..time.Instant;

public final class fwgi implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        return Math.abs(SystemClock.elapsedRealtime() - ((fxbw)object0).e - (Instant.now().toEpochMilli() - ((fxbw)object0).d)) >= 60000L ? fxbw.a : ((fxbw)object0);
    }
}

