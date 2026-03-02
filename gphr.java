import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class gphr {
    public static final long a;
    public final URI b;
    public final Executor c;
    public final Executor d;
    public final Integer e;
    public final Integer f;
    public final long g;
    private final Context h;
    private final Executor i;
    private final gful_cronetEngineProvider j;
    private final gphg k;
    private final int l;
    private final long m;
    private final long n;

    static {
        gphr.a = TimeUnit.SECONDS.toMillis(20L);
    }

    public gphr() {
        throw null;
    }

    public gphr(Context context0, URI uRI0, Executor executor0, Executor executor1, Executor executor2, gful_cronetEngineProvider gful0, gphg gphg0, Integer integer0, Integer integer1, long v, int v1, long v2, long v3) {
        this.h = context0;
        this.b = uRI0;
        this.i = executor0;
        this.c = executor1;
        this.d = executor2;
        this.j = gful0;
        this.k = gphg0;
        this.e = integer0;
        this.f = integer1;
        this.g = v;
        this.l = v1;
        this.m = v2;
        this.n = v3;
    }

    public final int a() {
        return this.b.getPort();
    }

    public final String b() {
        return this.b.getHost();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof gphr) && this.h.equals(((gphr)object0).h) && this.b.equals(((gphr)object0).b) && this.i.equals(((gphr)object0).i) && this.c.equals(((gphr)object0).c) && this.d.equals(((gphr)object0).d) && this.j.equals(((gphr)object0).j)) {
            gphg gphg0 = this.k;
            if(gphg0 != null) {
                if(gphg0.equals(((gphr)object0).k)) {
                label_8:
                    Integer integer0 = this.e;
                    if(integer0 != null) {
                        if(integer0.equals(((gphr)object0).e)) {
                        label_13:
                            Integer integer1 = this.f;
                            if(integer1 == null) {
                                return ((gphr)object0).f == null ? this.g == ((gphr)object0).g && this.l == ((gphr)object0).l && this.m == ((gphr)object0).m && this.n == ((gphr)object0).n : false;
                            }
                            return integer1.equals(((gphr)object0).f) ? this.g == ((gphr)object0).g && this.l == ((gphr)object0).l && this.m == ((gphr)object0).m && this.n == ((gphr)object0).n : false;
                        }
                    }
                    else if(((gphr)object0).e == null) {
                        goto label_13;
                    }
                }
            }
            else if(((gphr)object0).k == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((((this.h.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 0x22CD8CDB ^ this.j.hashCode();
        int v1 = 0;
        int v2 = this.k == null ? 0 : this.k.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        Integer integer0 = this.f;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (((int)(this.n ^ this.n >>> 0x20)) ^ ((((((v * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003 ^ this.l) * 1000003 ^ ((int)(this.m ^ this.m >>> 0x20))) * 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "TransportConfig{applicationContext=" + this.h + ", uri=" + this.b + ", backgroundExecutor=" + this.i + ", blockingExecutor=" + this.c + ", lightweightExecutor=" + this.d + ", lightweightScheduledExecutorService=null, userAgentOverride=null, recordNetworkMetricsToPrimes=" + this.j + ", grpcServiceConfig=" + this.k + ", trafficStatsUid=" + this.e + ", trafficStatsTag=" + this.f + ", grpcIdleTimeoutMillis=" + this.g + ", maxMessageSize=" + this.l + ", grpcKeepAliveTimeMillis=" + this.m + ", grpcKeepAliveTimeoutMillis=" + this.n + ", channelCredentials=null}";
    }
}

