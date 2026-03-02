import android.content.Context;
import java.lang.ref.WeakReference;

public final class espm {
    public static volatile WeakReference a;

    static {
        espm.a = new WeakReference(null);
    }

    public static void a(Context context0) {
        espm.b(context0, 0);
    }

    public static void b(Context context0, int v) {
        cljp cljp0 = cljp.a(context0);
        clkn clkn0 = new clkn();
        clkn0.e(((long)v), ((long)(v + v + 1)));
        clkn0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        clkn0.q((v == 0 ? "globalactions.state.now" : "globalactions.state"));
        clkn0.y(2, 2);
        clkn0.x(0, 0);
        clkn0.v(0);
        cljp0.f(clkn0.a());
    }

    public static void c(espl espl0) {
        espm.a = new WeakReference(espl0);
    }
}

