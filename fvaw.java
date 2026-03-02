import com.google.android.gms.location.LocationResult;
import j..util.Objects;
import java.util.concurrent.Executor;

final class fvaw extends cmoa {
    final Executor a;
    final fvbb b;

    public fvaw(fvbb fvbb0, Executor executor0) {
        this.a = executor0;
        Objects.requireNonNull(fvbb0);
        this.b = fvbb0;
        super();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        fvav fvav0 = new fvav(this, locationResult0);
        this.a.execute(fvav0);
    }
}

