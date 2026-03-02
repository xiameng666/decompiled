import android.content.Context;
import java.util.concurrent.Executor;

public final class gpgx {
    public final Context a;
    public final Executor b;
    public final Executor c;
    public final Executor d;
    public final gphv e;
    public final gful_cronetEngineProvider f;
    public final gful_cronetEngineProvider g;
    public final gful_cronetEngineProvider h;
    public final gful_cronetEngineProvider i;
    public final gphg j;
    public final int k;
    public final long l;
    public final long m;
    public final cmlu n;
    private final fgvt o;

    public gpgx() {
        throw null;
    }

    public gpgx(Context context0, fgvt fgvt0, cmlu cmlu0, Executor executor0, Executor executor1, Executor executor2, gphv gphv0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, gful_cronetEngineProvider gful2, gful_cronetEngineProvider gful3, gphg gphg0, int v, long v1, long v2) {
        this.a = context0;
        this.o = fgvt0;
        this.n = cmlu0;
        this.b = executor0;
        this.c = executor1;
        this.d = executor2;
        this.e = gphv0;
        this.f = gful0;
        this.g = gful1;
        this.h = gful2;
        this.i = gful3;
        this.j = gphg0;
        this.k = v;
        this.l = v1;
        this.m = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof gpgx) && this.a.equals(((gpgx)object0).a) && this.o.equals(((gpgx)object0).o) && this.n.equals(((gpgx)object0).n) && this.b.equals(((gpgx)object0).b) && this.c.equals(((gpgx)object0).c) && this.d.equals(((gpgx)object0).d)) {
            gphv gphv0 = this.e;
            if(gphv0 != null) {
                if(gphv0.equals(((gpgx)object0).e)) {
                label_8:
                    if(this.f.equals(((gpgx)object0).f) && this.g.equals(((gpgx)object0).g) && this.h.equals(((gpgx)object0).h) && this.i.equals(((gpgx)object0).i)) {
                        gphg gphg0 = this.j;
                        if(gphg0 == null) {
                            return ((gpgx)object0).j == null ? this.k == ((gpgx)object0).k && this.l == ((gpgx)object0).l && this.m == ((gpgx)object0).m : false;
                        }
                        return gphg0.equals(((gpgx)object0).j) ? this.k == ((gpgx)object0).k && this.l == ((gpgx)object0).l && this.m == ((gpgx)object0).m : false;
                    }
                }
            }
            else if(((gpgx)object0).e == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.o.hashCode()) * 1000003 ^ this.n.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 0xD5009D89 ^ (this.e == null ? 0 : this.e.hashCode())) * 0x22CD8CDB ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003;
        gphg gphg0 = this.j;
        if(gphg0 != null) {
            v = gphg0.hashCode();
        }
        return (((int)(this.m ^ this.m >>> 0x20)) ^ (((v1 ^ v) * 0xD5009D89 ^ this.k) * 1000003 ^ ((int)(this.l ^ this.l >>> 0x20))) * 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ChannelConfig{context=" + this.a + ", clock=" + this.o + ", transport=" + this.n + ", lightweightExecutor=" + this.b + ", backgroundExecutor=" + this.c + ", blockingExecutor=" + this.d + ", lightweightScheduledExecutor=null, authContextManager=" + this.e + ", rpcCacheProvider=null, userAgentOverride=null, recordNetworkMetricsToPrimes=" + this.f + ", recordCachingMetricsToPrimes=" + this.g + ", recordBandwidthMetrics=" + this.h + ", grpcIdleTimeoutMillis=" + this.i + ", grpcServiceConfig=" + this.j + ", consistencyTokenConfig=null, maxMessageSize=" + this.k + ", grpcKeepAliveTimeMillis=" + this.l + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null}";
    }
}

