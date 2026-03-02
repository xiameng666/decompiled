import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffio extends ffee {
    final String c;
    final String d;
    final fdiy e;
    final fflv f;

    public ffio(fflv fflv0, String s, String s1, fdiy fdiy0) {
        this.c = s;
        this.d = s1;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("removeConfig");
    }

    @Override  // ffee
    public final void a() {
        try {
            this.f.k.k(this.c, this.d, true);
            Status status0 = new Status(0);
            this.e.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "removeConfig: exception during processing: " + this.c, exception0);
            Status status1 = new Status(8);
            this.e.a(status1);
        }
    }
}

