import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public final class criv {
    public final AtomicLong a;
    private static criv b;
    private final crkt c;
    private final batw d;

    private criv(Context context0, crkt crkt0) {
        this.a = new AtomicLong(-1L);
        this.d = new baul(context0, new batx("measurement:api"));
        this.c = crkt0;
    }

    static criv a(crkt crkt0) {
        if(criv.b == null) {
            criv.b = new criv(crkt0.a, crkt0);
        }
        return criv.b;
    }

    public final void b(int v, long v1, long v2, int v3) {
        synchronized(this) {
            long v5 = SystemClock.elapsedRealtime();
            if(this.a.get() != -1L && v5 - this.a.get() <= 1800000L) {
                return;
            }
            TelemetryData telemetryData0 = new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(36301, v, 0, v1, v2, null, null, 0, v3)}));
            this.d.b(telemetryData0).A(new criu(this, v5));
        }
    }
}

