import android.content.Context;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.concurrent.TimeUnit;

public final class fxpy {
    public final Context a;
    public final fxts b;
    public final fxqn c;
    public final fxur d;
    public final fxsw e;
    public final bbng f;

    public fxpy(Context context0, fxts fxts0, fxqn fxqn0, fxur fxur0, fxsw fxsw0, bbng bbng0) {
        this.a = context0;
        this.b = fxts0;
        this.c = fxqn0;
        this.d = fxur0;
        this.e = fxsw0;
        this.f = bbng0;
    }

    public static long a(fxts fxts0) {
        return fxts0.h ? hzek.a.i().r() : hzek.e();
    }

    public static void b(ReportingConfig reportingConfig0, fxsw fxsw0) {
        reportingConfig0.f();
        fxsw0.f(reportingConfig0, "LocationReceiver.handleInactive");
    }

    public final boolean c(long v) {
        gzuh gzuh0 = this.b.i();
        return gzuh0 == null ? false : System.currentTimeMillis() - gzuh0.c < v;
    }

    public static final boolean d(long v, long v1, long v2) {
        return v2 - v1 < TimeUnit.MILLISECONDS.toNanos(v);
    }
}

