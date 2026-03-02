import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.GetLocalCapabilitiesResponse;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Set;

final class ffix extends ffee {
    final fdiy c;
    final fflv d;

    public ffix(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("getLocalCapabilities");
    }

    @Override  // ffee
    public final void a() {
        try {
            String s = this.d.j.k.a().a;
            Set set0 = this.d.j.E(this.d.e, s, 1);
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: set0) {
                fdqh fdqh0 = (fdqh)object0;
                if(fdqh0.d == fdqi.b) {
                    arrayList1.add(fdqh0.c);
                }
                else {
                    arrayList0.add(fdqh0.c);
                }
            }
            GetLocalCapabilitiesResponse getLocalCapabilitiesResponse0 = new GetLocalCapabilitiesResponse(0, arrayList0, arrayList1);
            this.c.H(getLocalCapabilitiesResponse0);
        }
        catch(NullPointerException | IllegalStateException | SQLiteException exception0) {
            Log.e("WearableService", "getLocalCapabilities: exception during processing", exception0);
            GetLocalCapabilitiesResponse getLocalCapabilitiesResponse1 = new GetLocalCapabilitiesResponse(8, ggna.a, ggna.a);
            this.c.H(getLocalCapabilitiesResponse1);
        }
    }
}

