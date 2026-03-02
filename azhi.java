import android.util.Log;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import java.util.concurrent.TimeUnit;

public final class azhi {
    public final cljp a;
    public final Object b;
    public boolean c;
    private static azhi d;
    private static long e;
    private static long f;
    private static boolean g;
    private static long h;

    public azhi(cljp cljp0) {
        this.b = new Object();
        this.a = cljp0;
    }

    public static azhi a() {
        synchronized(azhi.class) {
            if(azhi.d == null) {
                azhi.k();
                azhi azhi0 = new azhi(cljp.a(AppContextProvider.a()));
                azhi.d = azhi0;
                azhi0.d(0L);
                azhi0.c();
                azhi0.j();
            }
            if(azhi.k()) {
                if(Log.isLoggable("CCTQosScheduler", 4)) {
                    Log.i("CCTQosScheduler", "intervals changed, updating periodic schedulers");
                }
                azhi azhi1 = azhi.d;
                azhi1.c();
                azhi1.j();
            }
        }
        return azhi.d;
    }

    public static clkn b(String s) {
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        clkn0.t(s);
        return clkn0;
    }

    public final void c() {
        long v = Math.max(30L, azhi.i(azhi.g()));
        long v1 = azhi.f(v);
        clkq clkq0 = new clkq();
        clkq0.t("qos_default_periodic");
        clkq0.j = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        clkq0.a = v;
        clkq0.b = v1;
        clkq0.x(0, 1);
        clkq0.y(0, 0);
        clkq0.i(hraz.i());
        clkq0.v(2);
        clkr clkr0 = clkq0.a();
        this.a.f(clkr0);
    }

    public final void d(long v) {
        synchronized(this.b) {
            long v2 = (long)azie.b(((gful_cronetEngineProvider)new azhh()), "qos_oneoff_start_min_millis", Long.valueOf(5000L));
            if(v < v2) {
                v = v2;
            }
            long v3 = azhi.i(v);
            clkn clkn0 = azhi.b("qos_oneoff");
            clkn0.e(v3, TimeUnit.DAYS.toSeconds(100L));
            clkn0.x(0, 0);
            clkn0.y(0, 0);
            clkn0.i(false);
            clkn0.v(0);
            clko clko0 = clkn0.a();
            this.a.f(clko0);
            this.c = true;
        }
    }

    public static int e(String s) {
        switch(s.hashCode()) {
            case -1146690621: {
                return s.equals("qos_default_periodic") ? 5 : 1;
            }
            case 760599219: {
                return s.equals("qos_oneoff") ? 4 : 1;
            }
            case 0x5F171615: {
                return s.equals("qos_unmetered_periodic") ? 6 : 1;
            }
            default: {
                return 1;
            }
        }
    }

    private static long f(long v) {
        return hraz.d() <= 0L ? Math.min(v, Math.max(60L, -60L + v)) : hraz.d();
    }

    private static long g() {
        return (long)azie.b(((gful_cronetEngineProvider)new azhg()), "qos_default_task_interval_millis", Long.valueOf(3600000L));
    }

    private static long h() {
        return (long)azie.b(((gful_cronetEngineProvider)new azhf()), "qos_unmetered_task_interval_millis", Long.valueOf(3600000L));
    }

    private static long i(long v) {
        return TimeUnit.SECONDS.convert(v, TimeUnit.MILLISECONDS);
    }

    private final void j() {
        long v = Math.max(30L, azhi.i(azhi.h()));
        long v1 = azhi.f(v);
        clkq clkq0 = new clkq();
        clkq0.t("qos_unmetered_periodic");
        clkq0.j = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        clkq0.a = v;
        clkq0.b = v1;
        clkq0.v(1);
        clkq0.x(0, 1);
        clkq0.y(1, 1);
        clkq0.i(false);
        clkr clkr0 = clkq0.a();
        this.a.f(clkr0);
    }

    private static boolean k() {
        synchronized(azhi.class) {
            long v1 = azhi.e;
            long v2 = azhi.g();
            azhi.e = v2;
            long v3 = azhi.h;
            long v4 = azhi.h();
            azhi.h = v4;
            long v5 = azhi.f;
            long v6 = azhi.f(azhi.i(azhi.e));
            azhi.f = v6;
            boolean z = azhi.g;
            boolean z1 = hraz.i();
            azhi.g = z1;
            if(((Long.compare(v2, v1) == 0 ? 0 : 1) | (v4 == v3 ? 0 : 1) | (v6 == v5 ? 0 : 1) | (z1 == z ? 0 : 1)) == 0) {
                return false;
            }
        }
        return true;
    }
}

