import com.google.android.gms.location.LocationResult;
import j..util.Objects;

final class fvxk extends cmoa {
    final fvxn_FusionEngine a;

    public fvxk(fvxn_FusionEngine fvxn0) {
        Objects.requireNonNull(fvxn0);
        this.a = fvxn0;
        super();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        this.a.k(locationResult0.b);
    }
}

