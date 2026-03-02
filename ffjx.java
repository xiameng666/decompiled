import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffjx extends ffee {
    final fdiy c;
    final byte d;
    final fflv e;

    public ffjx(fflv fflv0, fdiy fdiy0, byte b) {
        this.c = fdiy0;
        this.d = b;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("sendAmsRemoteCommand");
    }

    @Override  // ffee
    public final void a() {
        try {
            this.e.s.mr();
            Log.e("WearableService", "AmsHandler is not set up");
            Status status0 = new Status(8);
            this.c.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "sendRemoteCommand: exception during processing: " + ((int)this.d), exception0);
            Status status1 = new Status(8);
            this.c.a(status1);
        }
    }
}

