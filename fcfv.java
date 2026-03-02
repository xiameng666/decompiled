import android.util.Log;
import com.google.android.gms.wearable.AppTheme;
import j..util.DesugarCollections;
import j..util.Objects;

public final class fcfv implements gmbg {
    final String a;
    final evqp b;
    final fcfw c;

    public fcfv(fcfw fcfw0, String s, evqp evqp0) {
        this.a = s;
        this.b = evqp0;
        Objects.requireNonNull(fcfw0);
        this.c = fcfw0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.c.d.a(0L, 1L, ayvf.b);
        AppTheme appTheme0 = fczo.d();
        this.b.b(appTheme0);
        if(Log.isLoggable("ExperienceService", 5)) {
            Log.w("ExperienceService", "Unable to get theme", throwable0);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        fesl fesl0 = (fesl)DesugarCollections.unmodifiableMap(((fesy)object0).b).get(this.a);
        if(fesl0 == null) {
            this.c.c.a(0L, 1L, ayvf.b);
            AppTheme appTheme0 = fczo.d();
            this.b.b(appTheme0);
            return;
        }
        this.c.b.a(0L, 1L, ayvf.b);
        AppTheme appTheme1 = fcfw.a(fesl0);
        this.b.b(appTheme1);
    }
}

