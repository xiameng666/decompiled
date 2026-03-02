import android.content.Context;
import java.util.concurrent.Executor;

public final class gpgw {
    public Context a;
    public fgvt b;
    public Executor c;
    public Executor d;
    public Executor e;
    public gphv f;
    public gful_cronetEngineProvider g;
    public gful_cronetEngineProvider h;
    public gful_cronetEngineProvider i;
    public gful_cronetEngineProvider j;
    public gphg k;
    public int l;
    public long m;
    public long n;
    public byte o;
    public cmlu p;

    public final gpgx a() {
        if(this.o == 7) {
            Context context0 = this.a;
            if(context0 != null) {
                fgvt fgvt0 = this.b;
                if(fgvt0 != null) {
                    cmlu cmlu0 = this.p;
                    if(cmlu0 != null) {
                        Executor executor0 = this.c;
                        if(executor0 != null) {
                            Executor executor1 = this.d;
                            if(executor1 != null) {
                                Executor executor2 = this.e;
                                if(executor2 != null) {
                                    gful_cronetEngineProvider gful0 = this.g;
                                    if(gful0 != null) {
                                        gful_cronetEngineProvider gful1 = this.h;
                                        if(gful1 != null) {
                                            gful_cronetEngineProvider gful2 = this.i;
                                            if(gful2 != null) {
                                                gful_cronetEngineProvider gful3 = this.j;
                                                if(gful3 != null) {
                                                    gpgx gpgx0 = new gpgx(context0, fgvt0, cmlu0, executor0, executor1, executor2, this.f, gful0, gful1, gful2, gful3, this.k, this.l, this.m, this.n);
                                                    gftb.r(gpgx0.e == null || gpgx0.d != null, "If authContextManager is set, networkExecutor must be set.");
                                                    return gpgx0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" context");
        }
        if(this.b == null) {
            stringBuilder0.append(" clock");
        }
        if(this.p == null) {
            stringBuilder0.append(" transport");
        }
        if(this.c == null) {
            stringBuilder0.append(" lightweightExecutor");
        }
        if(this.d == null) {
            stringBuilder0.append(" backgroundExecutor");
        }
        if(this.e == null) {
            stringBuilder0.append(" blockingExecutor");
        }
        if(this.g == null) {
            stringBuilder0.append(" recordNetworkMetricsToPrimes");
        }
        if(this.h == null) {
            stringBuilder0.append(" recordCachingMetricsToPrimes");
        }
        if(this.i == null) {
            stringBuilder0.append(" recordBandwidthMetrics");
        }
        if(this.j == null) {
            stringBuilder0.append(" grpcIdleTimeoutMillis");
        }
        if((this.o & 1) == 0) {
            stringBuilder0.append(" maxMessageSize");
        }
        if((this.o & 2) == 0) {
            stringBuilder0.append(" grpcKeepAliveTimeMillis");
        }
        if((this.o & 4) == 0) {
            stringBuilder0.append(" grpcKeepAliveTimeoutMillis");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }
}

