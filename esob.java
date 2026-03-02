import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class esob {
    private static final long a;
    private static final long b;

    static {
        esob.a = TimeUnit.DAYS.toSeconds(1L);
        esob.b = TimeUnit.HOURS.toSeconds(6L);
    }

    public static void a(Context context0) {
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        clkn0.q("immediate");
        clkn0.y(0, 0);
        clkn0.v(1);
        clkn0.e(0L, 1L);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }

    public static void b(Context context0) {
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        clkq0.q("periodic");
        clkq0.a = esob.a;
        clkq0.y(0, 1);
        clkq0.x(0, 1);
        clkq0.b = esob.b;
        clkq0.v(2);
        clkr clkr0 = clkq0.a();
        cljp.a(context0).f(clkr0);
    }
}

