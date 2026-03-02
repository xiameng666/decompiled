import android.util.Log;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Set;

final class ffit extends ffee {
    final fdiy c;
    final fflv d;

    public ffit(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getConnectedNodes");
    }

    @Override  // ffee
    public final void a() {
        ArrayList arrayList0;
        try {
            fflv fflv0 = this.d;
            if(fflv0.v) {
                Set set0 = fflv0.i.b();
                arrayList0 = new ArrayList(set0.size());
                for(Object object0: set0) {
                    fdyo fdyo0 = (fdyo)object0;
                    if(fdyo0.b > 0 && !Objects.equals(fdyo0.a.a, "cloud")) {
                        arrayList0.add(ffel.b(fdyo0));
                    }
                }
            }
            else {
                arrayList0 = new ArrayList(1);
                fdxn fdxn0 = fflv0.n.a();
                if(fdxn0 != null) {
                    arrayList0.add(new NodeParcelable(fdxn0.a, fdxn0.b, 1, true));
                }
            }
            GetConnectedNodesResponse getConnectedNodesResponse0 = new GetConnectedNodesResponse(0, arrayList0);
            this.c.B(getConnectedNodesResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getConnectedNodes: exception during processing", exception0);
            GetConnectedNodesResponse getConnectedNodesResponse1 = new GetConnectedNodesResponse(8, null);
            this.c.B(getConnectedNodesResponse1);
        }
    }
}

