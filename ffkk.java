import android.util.Log;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import j..util.Objects;

final class ffkk extends ffee {
    final fdiy c;
    final String d;
    final fflv e;

    public ffkk(fflv fflv0, fdiy fdiy0, String s) {
        this.c = fdiy0;
        this.d = s;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getRelatedConfigs");
    }

    @Override  // ffee
    public final void a() {
        try {
            GetConfigsResponse getConfigsResponse0 = new GetConfigsResponse(0, fczr.b(this.e.k.w(this.d)));
            this.c.A(getConfigsResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getRelatedConfigs: exception during processing", exception0);
            GetConfigsResponse getConfigsResponse1 = new GetConfigsResponse(8, null);
            this.c.A(getConfigsResponse1);
        }
    }
}

