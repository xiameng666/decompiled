import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;

public final class crmk implements Runnable {
    public final crni a;
    public final AtomicReference b;

    public crmk(crni crni0, AtomicReference atomicReference0) {
        this.a = crni0;
        this.b = atomicReference0;
    }

    @Override
    public final void run() {
        Bundle bundle0 = this.a.ap().m.a();
        croz croz0 = this.a.k();
        croz0.n();
        croz0.a();
        AppMetadata appMetadata0 = croz0.q(false);
        croz0.x(new croc(croz0, this.b, appMetadata0, bundle0));
    }
}

