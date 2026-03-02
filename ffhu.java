import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffhu extends ffee {
    final boolean c;
    final fdiy d;
    final fflv e;

    public ffhu(fflv fflv0, boolean z, fdiy fdiy0) {
        this.c = z;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("optInCloudSync");
    }

    @Override  // ffee
    public final void a() {
        try {
            boolean z = this.c;
            this.e.t.t(z);
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "opt in CloudSync: " + z);
            }
            Status status0 = new Status(0);
            this.d.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "optInCloudSync: exception during processing", exception0);
            Status status1 = new Status(8);
            this.d.a(status1);
        }
    }
}

