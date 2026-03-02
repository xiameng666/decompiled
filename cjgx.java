import android.content.Context;
import android.location.LocationManager;
import com.google.android.gms.libs.location.validation.platform.GnssLocationListener;
import java.util.concurrent.Executor;

public final class cjgx {
    public final Context a;
    public final LocationManager b;
    public final Executor c;
    public final ibts d;
    public GnssLocationListener e;

    public cjgx(Context context0, LocationManager locationManager0, Executor executor0, GnssLocationListener gnssLocationListener0) {
        ibuq.f(locationManager0, "locationManager");
        super();
        this.a = context0;
        this.b = locationManager0;
        this.c = executor0;
        this.d = new cjgw(this);
        this.e = gnssLocationListener0;
    }
}

