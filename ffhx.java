import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffhx extends ffee {
    final boolean c;
    final String d;
    final fdiy e;
    final fflv f;

    public ffhx(fflv fflv0, boolean z, String s, fdiy fdiy0) {
        this.c = z;
        this.d = s;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("setCloudSyncSetting");
    }

    @Override  // ffee
    public final void a() {
        try {
            boolean z = this.c;
            if(!z) {
                String s = this.d;
                if(s != null) {
                    Log.w("WearableService", "CloudSync is getting disabled by " + s);
                    this.f.t.u("CloudSync is getting disabled by " + s);
                }
            }
            this.f.t.z(z);
            Status status0 = new Status(0);
            this.e.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "setCloudSyncSetting: exception during processing", exception0);
            Status status1 = new Status(8);
            this.e.a(status1);
        }
    }
}

