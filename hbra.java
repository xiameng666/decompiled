import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class hbra {
    public final AtomicLong a;
    private final batw b;

    public hbra(Context context0) {
        this.a = new AtomicLong(-1L);
        this.b = new baul(context0, new batx("mlkit:vision"));
    }

    public final void a(int v, int v1, long v2, long v3) {
        synchronized(this) {
            long v5 = SystemClock.elapsedRealtime();
            if(this.a.get() != -1L && v5 - this.a.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            TelemetryData telemetryData0 = new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(v, v1, 0, v2, v3, null, null, 0, -1)}));
            this.b.b(telemetryData0).A(new hbqz(this, v5));
        }
    }
}

