import android.content.Context;
import android.os.SystemClock;

public final class ezza extends ezyy {
    public static final fagl k;
    public static final fagp l;
    public static final fagp m;
    public static final fagg n;

    static {
        ezza.k = new fagl("retry_count", ((int)0));
        ezza.l = new fagp("initial_delay", ((long)86400000L));
        ezza.m = new fagp("minimum_delay", ((long)60000L));
        ezza.n = new fagg("divide_factor", ((double)1.5));
    }

    public ezza(Context context0, fagj fagj0) {
        super("delayed-auto-resume-execution", context0, fagj0);
    }

    @Override  // ezyy
    public final ezyi a() {
        ezxs ezxs0 = (ezxs)ezxs.l.b();
        return ezxs0.b().B || ezxs0.b().k ? super.a() : new ezyi(((String)this.c(ezyy.g)), ((fagj)this.c(ezyy.h)));
    }

    @Override  // ezyy
    protected final long f() {
        return SystemClock.elapsedRealtime() + Math.max(((long)(((Long)this.c(ezza.l)))) / ((long)Math.pow(((Double)this.c(ezza.n)).doubleValue(), ((Integer)this.c(ezza.k)).intValue())), ((Long)this.c(ezza.m)).longValue());
    }
}

