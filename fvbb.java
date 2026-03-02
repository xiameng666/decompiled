import android.content.Context;
import android.location.GnssMeasurementsEvent.Callback;
import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback;
import com.google.android.location.bluesky.BlueskyLocationManager.1;
import java.util.concurrent.Executor;

public final class fvbb {
    public static final bboh a;
    public final fyad b;
    public final cmnh c;
    public final Executor d;
    public final fyal e;
    public GnssMeasurementsEvent.Callback f;
    public boolean g;
    public final fvba h;
    public Location i;
    public Location j;
    public cjhf k;
    public volatile boolean l;
    public final TracingGnssStatusCallback m;
    public final cmoa n;
    public final LocationListener o;
    public final Runnable p;

    static {
        fvbb.a = bboh.a("BlueSkyLocationManager");
    }

    public fvbb(Context context0, Executor executor0, Runnable runnable0, Runnable runnable1, cmnh cmnh0, fyal fyal0) {
        this.g = true;
        this.h = new fvba();
        this.d = executor0;
        this.b = fyad.a(context0);
        this.c = cmnh0;
        this.p = runnable0;
        this.m = new BlueskyLocationManager.1(this, context0, runnable0);
        this.e = fyal0;
        this.n = new fvaw(this, executor0);
        this.o = new fvay(this, executor0, runnable1, runnable0);
    }
}

