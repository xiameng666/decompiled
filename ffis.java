import android.util.Log;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;

final class ffis extends ffee {
    final fdiy c;
    final fflv d;

    public ffis(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getLocalNode");
    }

    @Override  // ffee
    public final void a() {
        try {
            fdxn fdxn0 = this.d.t();
            GetLocalNodeResponse getLocalNodeResponse0 = new GetLocalNodeResponse(0, new NodeParcelable(fdxn0.a, fdxn0.b, 0, true));
            this.c.I(getLocalNodeResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getLocalNode: exception during processing", exception0);
            GetLocalNodeResponse getLocalNodeResponse1 = new GetLocalNodeResponse(8, null);
            this.c.I(getLocalNodeResponse1);
        }
    }
}

