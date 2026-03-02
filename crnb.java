import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class crnb implements Runnable {
    final AtomicReference a;
    final String b;
    final String c;
    final boolean d;
    final crni e;

    public crnb(crni crni0, AtomicReference atomicReference0, String s, String s1, boolean z) {
        this.a = atomicReference0;
        this.b = s;
        this.c = s1;
        this.d = z;
        Objects.requireNonNull(crni0);
        this.e = crni0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.e.y.n();
        croz0.n();
        croz0.a();
        AppMetadata appMetadata0 = croz0.q(false);
        croz0.x(new croq(croz0, this.a, this.b, this.c, appMetadata0, this.d));
    }
}

