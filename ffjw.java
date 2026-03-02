import android.util.Log;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import j..util.Objects;

final class ffjw extends ffee {
    final fdiy c;
    final String d;
    final fflv e;

    public ffjw(fflv fflv0, fdiy fdiy0, String s) {
        this.c = fdiy0;
        this.d = s;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getConfigs");
    }

    @Override  // ffee
    public final void a() {
        try {
            GetConfigsResponse getConfigsResponse0 = new GetConfigsResponse(0, fczr.b(this.e.k.v(this.d)));
            this.c.A(getConfigsResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getConfigs: exception during processing", exception0);
            GetConfigsResponse getConfigsResponse1 = new GetConfigsResponse(8, null);
            this.c.A(getConfigsResponse1);
        }
    }
}

