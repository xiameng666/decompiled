import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class ekse {
    private static final TimeRange a;

    static {
        Long long0 = (long)0L;
        ekse.a = TimeRange.g(long0, long0);
    }

    public static int a(eksc eksc0) {
        int v = eksc0.o.o.c;
        int v1 = eksc0.o.o.d;
        int v2 = eksc0.o.o.b;
        hthh hthh0 = hthh.a;
        int v3 = (int)hthh0.c().c();
        int v4 = v3 < 0 ? v : Math.max(v3, v);
        int v5 = (int)hthh0.c().b();
        if(v5 > 0) {
            v = Math.max(v5, v);
        }
        int v6 = (int)hthh0.c().g();
        if(v6 != -1 && ekse.c(v6)) {
            v2 = v6;
        }
        int v7 = eksc0.i;
        if(!ekse.c(v2)) {
            Log.e("NetworkScheduler", "Invalid RetryStrategy policy: " + v2);
        }
        return v2 == 1 ? Math.max(v4, Math.min((v7 + 1) * v, v1)) : Math.max(v4, Math.min(((int)Math.scalb(v, v7)), v1));
    }

    public static TimeRange b(cllp cllp0, ekqa ekqa0) {
        TimeRange ggmr0;
        if((cllp0 instanceof clko)) {
            ggmr0 = TimeRange.g(Long.valueOf(TimeUnit.SECONDS.toMillis(((clko)cllp0).a)), Long.valueOf(TimeUnit.SECONDS.toMillis(((clko)cllp0).b)));
        }
        else {
            if((cllp0 instanceof clkr)) {
                long v = TimeUnit.SECONDS.toMillis((ekqa0.c > 0L ? ekqa0.c : ((clkr)cllp0).a));
                long v1 = TimeUnit.SECONDS.toMillis((ekqa0.d > 0L ? ekqa0.d : ((clkr)cllp0).b));
                hthh hthh0 = hthh.a;
                long v2 = TimeUnit.SECONDS.toMillis(hthh0.c().e());
                if(v < v2) {
                    v1 = (long)(((double)v2) / (((double)v) / ((double)v1)));
                    v = v2;
                }
                ggmr0 = TimeRange.g(Long.valueOf(v - Math.min(glxd.e(new long[]{v1, v / 20L, TimeUnit.SECONDS.toMillis(hthh0.c().d())}), v)), Long.valueOf(v));
                goto label_18;
            }
            if((cllp0 instanceof cljb)) {
                ggmr0 = ekse.a;
                goto label_18;
            }
            if(!(cllp0 instanceof clki)) {
                throw new IllegalArgumentException("Unknown task type.");
            }
            ggmr0 = ekse.a;
        }
    label_18:
        long v3 = ((long)(((Long)ggmr0.r()))) - ((long)(((Long)ggmr0.q())));
        long v4 = TimeUnit.SECONDS.toMillis(ekqa0.b);
        if((((double)v4) > ((double)v3))) {
            long v5 = ((long)(((Long)ggmr0.q()))) + v4;
            return TimeRange.g(((Long)ggmr0.q()), Long.valueOf(v5));
        }
        return ggmr0;
    }

    private static boolean c(int v) {
        return v == 0 || v == 1;
    }
}

