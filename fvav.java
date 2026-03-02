import android.location.Location;
import com.google.android.gms.location.LocationResult;

public final class fvav implements Runnable {
    public final fvaw a;
    public final LocationResult b;

    public fvav(fvaw fvaw0, LocationResult locationResult0) {
        this.a = fvaw0;
        this.b = locationResult0;
    }

    @Override
    public final void run() {
        fvbb fvbb0 = this.a.b;
        if(fvbb0.l) {
            Location location0 = this.b.a();
            if(location0 != null) {
                fvbb0.i = location0;
            }
        }
    }
}

