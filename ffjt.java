import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffjt extends ffee {
    final fdiy c;
    final int d;
    final fflv e;

    public ffjt(fflv fflv0, fdiy fdiy0, int v) {
        this.c = fdiy0;
        this.d = v;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("doAncsPositiveAction");
    }

    @Override  // ffee
    public final void a() {
        try {
            this.e.r.mr();
            Log.e("WearableService", "AncsHandler is not set up");
            Status status0 = new Status(8);
            this.c.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "sendPositiveAction: exception during processing: " + this.d, exception0);
            Status status1 = new Status(8);
            this.c.a(status1);
        }
    }
}

