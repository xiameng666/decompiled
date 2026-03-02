import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffjk extends ffee {
    final fdiy c;
    final fflv d;

    public ffjk(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("silenceRinger");
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
            telecomManager0.silenceRinger();
            Status status1 = new Status(0);
            this.c.a(status1);
        }
        catch(Exception | NoSuchMethodError throwable0) {
            Log.e("WearableService", "silenceRinger: exception during processing", throwable0);
            Status status2 = new Status(8);
            this.c.a(status2);
        }
    }
}

