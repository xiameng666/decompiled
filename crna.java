import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class crna implements Runnable {
    final AtomicReference a;
    final String b;
    final String c;
    final crni d;

    public crna(crni crni0, AtomicReference atomicReference0, String s, String s1) {
        this.a = atomicReference0;
        this.b = s;
        this.c = s1;
        Objects.requireNonNull(crni0);
        this.d = crni0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.d.y.n();
        croz0.n();
        croz0.a();
        AppMetadata appMetadata0 = croz0.q(false);
        croz0.x(new crop(croz0, this.a, this.b, this.c, appMetadata0));
    }
}

