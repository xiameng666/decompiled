import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

public final class fcrl {
    public static final baun a;
    public final fcfe b;
    public final ScheduledExecutorService c;

    static {
        fcrl.a = new fcgf(new String[]{"RestoreWearClient"});
    }

    public fcrl(fcfe fcfe0, ScheduledExecutorService scheduledExecutorService0) {
        this.b = fcfe0;
        this.c = scheduledExecutorService0;
    }

    public static fcrl a(Context context0) {
        return new fcrl(fcfo.d(context0), new bbll(2, 9));
    }

    public final gmcd b(String s, Supplier supplier0) {
        return ghmx.e(((gful_cronetEngineProvider)new fcrf(supplier0)), new ghmf(glwy.a(hzyp.a.b().e())), new fcrg(s), this.c);
    }
}

