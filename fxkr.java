import android.location.Location;
import com.google.android.gms.location.LocationResult;
import j..util.Objects;

final class fxkr extends cmoa {
    final fxkt a;

    public fxkr(fxkt fxkt0) {
        Objects.requireNonNull(fxkt0);
        this.a = fxkt0;
        super();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        for(Object object0: locationResult0.b) {
            ((Location)object0).getProvider();
            this.a.c(((Location)object0));
        }
    }
}

