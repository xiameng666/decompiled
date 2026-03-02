import android.app.PendingIntent;
import j..util.Objects;
import java.util.concurrent.ScheduledFuture;

public final class fxrh implements Runnable {
    final PendingIntent a;
    final fxrk b;

    public fxrh(fxrk fxrk0, PendingIntent pendingIntent0) {
        this.a = pendingIntent0;
        Objects.requireNonNull(fxrk0);
        this.b = fxrk0;
        super();
    }

    @Override
    public final void run() {
        fxrk fxrk0 = this.b;
        ScheduledFuture scheduledFuture0 = fxrk0.b;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
            fxrk0.b = null;
        }
        fxrk0.c = 0;
        fxrk0.d.a().e(this.a);
        this.a.cancel();
    }
}

