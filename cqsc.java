import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class cqsc {
    public final cqwd a;
    public final gful_cronetEngineProvider b;
    public final ScheduledExecutorService c;
    public long d;
    public long e;
    public Future f;
    private final gful_cronetEngineProvider g;
    private final gmch h;

    public cqsc(ScheduledExecutorService scheduledExecutorService0) {
        this.a = new cqwd("MdnsQueryScheduler");
        this.g = gfus.a(((gful_cronetEngineProvider)new cqrz()));
        this.b = gfus.a(((gful_cronetEngineProvider)new cqsa()));
        this.f = null;
        this.c = scheduledExecutorService0;
        this.h = gmcn.b(scheduledExecutorService0);
        cqwc.b();
        this.e = 0L;
    }

    public final long a(long v) {
        return ((Boolean)this.g.mr()).booleanValue() ? Math.max(v, ((Long)this.b.mr()).longValue()) : v;
    }

    final void b(boolean z) {
        Future future0 = this.f;
        if(future0 != null) {
            future0.cancel(z);
            this.f = null;
        }
    }

    public final void c(long v, cqsv cqsv0) {
        this.a.b("Scheduling next query to run in %d mS", Long.valueOf(v));
        gmcf gmcf0 = this.h.g(cqsv0, v, TimeUnit.MILLISECONDS);
        this.f = gmcf0;
        gmbu.t(gmcf0, new cqsb(this), gmap.a);
    }

    public static final long d(Set set0) {
        long v = 0L;
        for(Object object0: set0) {
            cqse cqse0 = (cqse)object0;
            if(!cqse0.q()) {
                continue;
            }
            long v1 = cqse0.d().c(SystemClock.elapsedRealtime());
            int v2 = Long.compare(v1, 0L);
            if(v2 < 0 || v != 0L && v1 >= v) {
                continue;
            }
            if(v2 != 0) {
                v = v1;
                continue;
            }
            return 0L;
        }
        return (long)(((float)v) * 0.8f);
    }
}

