import android.location.Location;
import com.google.android.gms.location.LocationResult;
import j..util.Objects;

final class fvyt extends cmoa {
    final fvyu a;

    public fvyt(fvyu fvyu0) {
        Objects.requireNonNull(fvyu0);
        this.a = fvyu0;
        super();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        for(Object object0: locationResult0.b) {
            this.a.e(((Location)object0));
        }
    }
}

