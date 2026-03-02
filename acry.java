import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

final class acry {
    public final AtomicLong a;
    private final gful_cronetEngineProvider b;

    private acry(Context context0) {
        this.a = new AtomicLong(-1L);
        this.b = gfus.a(((gful_cronetEngineProvider)new acrw(context0, new batx("auth:gau"))));
    }

    public static acry a(Context context0) {
        fpim.e(context0);
        return new acry(context0);
    }

    public final void b(int v, int v1, long v2, long v3, long v4) {
        synchronized(this) {
            long v6 = SystemClock.elapsedRealtime();
            double f = hpiq.a.b().a();
            if(((double)new Random().nextFloat()) <= f && (this.a.get() == -1L || v6 - this.a.get() > TimeUnit.MINUTES.toMillis(30L))) {
                ((batw)this.b.mr()).b(new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(v, v1, 0, v2, v3, null, null, 0, ((int)(SystemClock.elapsedRealtime() - v4)))}))).A(new acrx(this, v6));
            }
        }
    }
}

