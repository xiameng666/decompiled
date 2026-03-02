import android.location.Location;
import com.google.android.gms.location.LocationResult;
import j..util.Objects;

final class bgso extends cmoa {
    final bgsq a;

    public bgso(bgsq bgsq0) {
        Objects.requireNonNull(bgsq0);
        this.a = bgsq0;
        super();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        Location location0 = locationResult0.a();
        if(location0 != null) {
            location0.getProvider();
            this.a.c(location0);
        }
    }
}

