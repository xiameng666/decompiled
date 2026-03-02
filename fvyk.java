import android.location.Location;
import com.google.android.gms.location.LocationResult;
import j..util.Objects;

final class fvyk extends cmoa {
    final fvym a;

    public fvyk(fvym fvym0) {
        Objects.requireNonNull(fvym0);
        this.a = fvym0;
        super();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        for(Object object0: locationResult0.b) {
            this.a.onLocationChanged(((Location)object0));
        }
    }
}

