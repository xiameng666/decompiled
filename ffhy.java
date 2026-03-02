import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffhy extends ffee {
    final String c;
    final boolean d;
    final fdiy e;
    final fflv f;

    public ffhy(fflv fflv0, String s, boolean z, fdiy fdiy0) {
        this.c = s;
        this.d = z;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("setCloudSyncSettingByNode");
    }

    @Override  // ffee
    public final void a() {
        try {
            this.f.t.I(this.c, this.d);
            Status status0 = new Status(0);
            this.e.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "setCloudSyncSettingByNode: exception during processing", exception0);
            Status status1 = new Status(8);
            this.e.a(status1);
        }
    }
}

