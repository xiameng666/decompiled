import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class cakg {
    private final List a;

    public cakg() {
        this.a = new ArrayList();
    }

    public final CancellationSignal a() {
        CancellationSignal cancellationSignal0;
        synchronized(this) {
            cancellationSignal0 = new CancellationSignal();
            this.a.add(cancellationSignal0);
        }
        return cancellationSignal0;
    }

    public final void b() {
        synchronized(this) {
            for(Object object0: this.a) {
                ((CancellationSignal)object0).cancel();
            }
        }
    }

    public final void c(gmcd gmcd0, Executor executor0) {
        gmcd0.hB(new cakf(this, gmcd0), executor0);
    }
}

