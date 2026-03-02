import android.location.Location;
import com.google.android.gms.location.LocationResult;
import j..util.Objects;

final class fxef extends cmoa {
    final fxeg a;

    public fxef(fxeg fxeg0) {
        Objects.requireNonNull(fxeg0);
        this.a = fxeg0;
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

