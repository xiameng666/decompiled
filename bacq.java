import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class bacq {
    public static void a(Context context0) {
        if(bbqc.e()) {
            if(hrsw.e()) {
                bacq.b(context0, "com.google.android.gms.common.systemhealthutils.restart.GmsRestartGmsService", "scheduled-restart-gms");
            }
        }
        else if(bbqc.f() && hrsw.f()) {
            bacq.b(context0, "com.google.android.gms.common.systemhealthutils.restart.GmsRestartPersistentService", "scheduled-restart-persistent");
        }
    }

    private static void b(Context context0, String s, String s1) {
        cljp cljp0 = cljp.a(context0);
        long v = Math.max(TimeUnit.HOURS.toSeconds(12L), hrsw.b());
        long v1 = Math.max(1L + v, hrsw.a.c().d());
        clkn clkn0 = new clkn();
        clkn0.j = s;
        clkn0.e(v, v1);
        clkn0.f(0, 1);
        clkn0.g(2);
        clkn0.p = hrsw.a.c().f() ^ 1;
        clkn0.v(1);
        clkn0.t(s1);
        clkn0.x(0, 1);
        cljp0.f(clkn0.a());
    }
}

