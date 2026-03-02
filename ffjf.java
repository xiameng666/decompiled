import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffjf extends ffee {
    final fdiy c;
    final fflv d;

    public ffjf(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("endCall");
    }

    @Override  // ffee
    public final void a() {
        try {
            TelecomManager telecomManager0 = this.d.o;
            if(telecomManager0 == null) {
                Status status0 = new Status(10);
                this.c.a(status0);
                return;
            }
            telecomManager0.endCall();
            Status status1 = new Status(0);
            this.c.a(status1);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "endCall: exception during processing", exception0);
            Status status2 = new Status(8);
            this.c.a(status2);
        }
    }
}

