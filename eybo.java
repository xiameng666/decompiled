import com.google.android.gms.trustagent.activeunlock.common.data.communication.WearConnectionInfo;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
import java.util.Set;

public final class eybo implements evpo {
    public final exwv a;

    public eybo(exwv exwv0) {
        this.a = exwv0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            WearConnectionInfo wearConnectionInfo0 = this.a.d.a;
            String s = wearConnectionInfo0 == null ? null : wearConnectionInfo0.a;
            Set set0 = ((fcee)evql0.j()).b();
            ibuq.e(set0, "getNodes(...)");
            ArrayList arrayList0 = new ArrayList(ibpo.q(set0, 10));
            for(Object object0: set0) {
                arrayList0.add(((NodeParcelable)object0).a);
            }
            return Boolean.valueOf(arrayList0.contains(s));
        }
        return Boolean.valueOf(false);
    }
}

