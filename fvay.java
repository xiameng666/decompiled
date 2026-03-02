import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import j..util.Objects;
import java.util.concurrent.Executor;

final class fvay implements LocationListener {
    final Executor a;
    final Runnable b;
    final Runnable c;
    final fvbb d;

    public fvay(fvbb fvbb0, Executor executor0, Runnable runnable0, Runnable runnable1) {
        this.a = executor0;
        this.b = runnable0;
        this.c = runnable1;
        Objects.requireNonNull(fvbb0);
        this.d = fvbb0;
        super();
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(Location location0) {
        if(location0 != null) {
            String s = location0.getProvider();
            if(s != null && s.equals("gps")) {
                fvax fvax0 = new fvax(this, this.b, location0, this.c);
                this.a.execute(fvax0);
            }
        }
    }

    @Override  // android.location.LocationListener
    public final void onProviderDisabled(String s) {
    }

    @Override  // android.location.LocationListener
    public final void onProviderEnabled(String s) {
    }

    @Override  // android.location.LocationListener
    public final void onStatusChanged(String s, int v, Bundle bundle0) {
    }
}

