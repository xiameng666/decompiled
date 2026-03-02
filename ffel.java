import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
import java.util.Set;

public final class ffel {
    public static CapabilityInfoParcelable a(String s, Set set0) {
        ArrayList arrayList0 = new ArrayList(set0.size());
        for(Object object0: set0) {
            arrayList0.add(ffel.b(((fdyo)object0)));
        }
        return new CapabilityInfoParcelable(s, arrayList0);
    }

    public static NodeParcelable b(fdyo fdyo0) {
        int v = fdyo0.b;
        boolean z = fdxu.v(fdyo0.a, v);
        return new NodeParcelable(fdyo0.a.a, fdyo0.a.b, v, z);
    }
}

