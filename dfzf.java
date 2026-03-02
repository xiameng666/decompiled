import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;

final class dfzf {
    public final String a;
    final dfzz b;
    private cumn c;
    private final ScheduledExecutorService d;

    public dfzf(dfzz dfzz0, ScheduledExecutorService scheduledExecutorService0) {
        Objects.requireNonNull(dfzz0);
        this.b = dfzz0;
        super();
        this.c = null;
        this.d = scheduledExecutorService0;
        this.a = "mutual acceptance timeout";
    }

    final void a() {
        synchronized(this) {
            cumn cumn0 = this.c;
            if(cumn0 != null) {
                cumn0.b();
                this.c = null;
            }
        }
    }

    final void b(ShareTarget shareTarget0, dfum dfum0, dcnp dcnp0, long v) {
        synchronized(this) {
            this.a();
            this.c = cumn.d(dcvz.a, new dfze(this, v, dcnp0, shareTarget0, dfum0), v, this.d);
        }
    }
}

