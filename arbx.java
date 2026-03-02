import android.os.Bundle;
import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import j..util.Objects;
import java.util.concurrent.TimeoutException;

public final class arbx implements arkj {
    final arjx a;
    final byte[] b;
    final D2dEarlySourceChimeraService c;

    public arbx(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0, arjx arjx0, byte[] arr_b) {
        this.a = arjx0;
        this.b = arr_b;
        Objects.requireNonNull(d2dEarlySourceChimeraService0);
        this.c = d2dEarlySourceChimeraService0;
        super();
    }

    @Override  // arkj
    public final void a(Exception exception0) {
        D2dEarlySourceChimeraService d2dEarlySourceChimeraService0 = this.c;
        if(d2dEarlySourceChimeraService0.d.get()) {
            D2dEarlySourceChimeraService.a.d("Result fetch cancelled as cancellation was requested", new Object[0]);
            d2dEarlySourceChimeraService0.k.cancel(false);
            return;
        }
        if(!(exception0 instanceof TimeoutException)) {
            arjx arjx0 = this.a;
            if(arjx0.b()) {
                D2dEarlySourceChimeraService.a.d("Result fetch failed..retrying", new Object[0]);
                arjx0.a(new arbw(this, arjx0, this.b));
                return;
            }
        }
        D2dEarlySourceChimeraService.a.f("Result fetch failed", new Object[0]);
        d2dEarlySourceChimeraService0.e.a();
        d2dEarlySourceChimeraService0.k.q(null);
    }

    @Override  // arkj
    public final void b(Bundle bundle0) {
        aqql aqql0 = D2dEarlySourceChimeraService.a;
        aqql0.h("Successfully fetched compatible packages.", new Object[0]);
        if(bundle0.getBoolean("p2pdisconnectservice")) {
            this.c.e.a();
        }
        D2dEarlySourceChimeraService d2dEarlySourceChimeraService0 = this.c;
        if(d2dEarlySourceChimeraService0.d.get()) {
            aqql0.d("Find compatible packages cancelled as cancellation was requested", new Object[0]);
            d2dEarlySourceChimeraService0.k.cancel(false);
            return;
        }
        d2dEarlySourceChimeraService0.k.q(null);
    }
}

