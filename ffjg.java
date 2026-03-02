import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffjg extends ffee {
    final fdiy c;
    final fflv d;

    public ffjg(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("syncWifiCredentials");
    }

    @Override  // ffee
    public final void a() {
        try {
            if(this.d.p.j(true)) {
                Status status0 = new Status(0);
                this.c.a(status0);
                return;
            }
            Status status1 = new Status(4008);
            this.c.a(status1);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "syncWifiCredentials: exception during processing", exception0);
            Status status2 = new Status(8);
            this.c.a(status2);
        }
    }
}

