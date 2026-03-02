import android.util.Log;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

final class ffiw extends ffee {
    final int c;
    final fdiy d;
    final fflv e;

    public ffiw(fflv fflv0, int v, fdiy fdiy0) {
        this.c = v;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getAllCapabilities");
    }

    @Override  // ffee
    public final void a() {
        try {
            Map map0 = this.e.j.u(this.e.e, null, this.c);
            ArrayList arrayList0 = new ArrayList(map0.size());
            for(Object object0: map0.entrySet()) {
                arrayList0.add(ffel.a(((String)((Map.Entry)object0).getKey()), ((Set)((Map.Entry)object0).getValue())));
            }
            GetAllCapabilitiesResponse getAllCapabilitiesResponse0 = new GetAllCapabilitiesResponse(0, arrayList0);
            this.d.m(getAllCapabilitiesResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getConnectedCapabilities: exception during processing", exception0);
            GetAllCapabilitiesResponse getAllCapabilitiesResponse1 = new GetAllCapabilitiesResponse(8, null);
            this.d.m(getAllCapabilitiesResponse1);
        }
    }
}

