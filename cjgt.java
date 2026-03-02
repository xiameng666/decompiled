import com.google.android.gms.location.LocationResult;
import java.util.concurrent.Executor;

public final class cjgt extends cmoa {
    public final cmnh a;
    public final Executor b;
    private ibtw c;

    public cjgt(cmnh cmnh0, Executor executor0, ibtw ibtw0) {
        this.a = cmnh0;
        this.b = executor0;
        this.c = ibtw0;
    }

    public final void b() {
        synchronized(this) {
            ibtw ibtw0 = this.c;
            this.c = null;
        }
        if(ibtw0 != null) {
            this.a.f(this);
        }
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        ibtw ibtw0;
        ibuq.f(locationResult0, "result");
        synchronized(this) {
            ibtw0 = this.c;
        }
        if(ibtw0 != null) {
            ibuq.e(locationResult0.b, "getLocations(...)");
            ibtw0.a(this, cjhp.d(locationResult0.b));
        }
    }
}

