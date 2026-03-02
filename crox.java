import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

final class crox implements Runnable {
    final ConnectionResult a;
    final croy b;

    public crox(croy croy0, ConnectionResult connectionResult0) {
        this.a = connectionResult0;
        Objects.requireNonNull(croy0);
        this.b = croy0;
        super();
    }

    @Override
    public final void run() {
        croz croz0 = this.b.c;
        croz0.b = null;
        if(this.a.c == 7777) {
            if(croz0.d == null) {
                croz0.d = Executors.newScheduledThreadPool(1);
            }
            croz0.d.schedule(new crow(this), ((Long)crif.Y.a()).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        croz0.t();
    }
}

