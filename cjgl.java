import android.content.Context;
import android.location.LocationManager;

public final class cjgl {
    public final Context a;
    public final LocationManager b;
    public final cmwk c;

    public cjgl(Context context0) {
        this.a = context0;
        Object object0 = context0.getSystemService("location");
        ibuq.d(object0, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager0 = (LocationManager)object0;
        this.b = locationManager0;
        this.c = new cmwk(context0, locationManager0);
        ibuq.f(locationManager0, "locationManager");
        new cmvy(locationManager0);
    }
}

