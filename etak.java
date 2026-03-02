import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class etak extends eszx {
    final evqp a;

    public etak(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // eszx
    public final void x(Status status0, Bundle bundle0) {
        azzf.c((status0.d() ? Status.b : status0), status0.k, this.a);
    }
}

