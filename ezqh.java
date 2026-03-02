import com.google.android.gms.chimera.modules.udc.AppContextProvider;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class ezqh {
    private static ayud a;
    private static ezqg b;
    private static final Random c;

    static {
        ezqh.c = new Random();
    }

    public static ezqg a() {
        synchronized(ezqh.class) {
            if(ezqh.a == null) {
                ezqh.a = new aytt(AppContextProvider.a(), "STREAMZ_UDC").a();
            }
            if(ezqh.b == null) {
                ayud ayud0 = ezqh.a;
                ScheduledExecutorService scheduledExecutorService0 = clhl.b.h(1, clhr.b);
                cdbi cdbi0 = hzdf.a.c().b() ? new cdbi(ciox.b) : new froz(ayud0, "STREAMZ_UDC");
                ezqh.b = new ezqg(scheduledExecutorService0, cdbi0);
            }
        }
        return ezqh.b;
    }

    public static void b(long v, TimeUnit timeUnit0) {
        synchronized(ezqh.class) {
            ayud ayud0 = ezqh.a;
            if(ayud0 == null) {
                return;
            }
            ayud0.e(v, timeUnit0);
        }
    }

    public static boolean c(long v) {
        return v > 0L && v < 0x7FFFFFFFL && ezqh.c.nextInt(((int)v)) == 0;
    }
}

