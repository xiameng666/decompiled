import android.content.Context;
import com.google.android.gms.httpflags.service.PeriodicTaskGmsTaskBoundService;

public final class bwjv {
    public static final int a;
    private static final String b;

    static {
        bboh.b("HttpflagsPeriodicTask", bbcu.fL);
        String s = new ibuk(PeriodicTaskGmsTaskBoundService.class).b();
        ibuq.c(s);
        bwjv.b = s;
    }

    public static final void a(Context context0) {
        htyo htyo0 = htyo.a;
        if(!htyo0.b().f()) {
            return;
        }
        long v = htyo0.b().c();
        long v1 = htyo0.b().b();
        cljp cljp0 = cljp.a(context0);
        clkn clkn0 = new clkn();
        clkn0.w(bwjv.b);
        clkn0.y(2, 2);
        clkn0.x(0, 1);
        clkn0.f(0, 1);
        clkn0.t("HttpflagsPeriodicTask");
        clkn0.v(1);
        clkn0.p = false;
        clkn0.e(v, v1);
        cljp0.f(clkn0.a());
    }
}

