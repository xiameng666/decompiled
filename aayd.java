import com.google.android.gms.actionlearner.internal.ParcelableAction;
import java.util.LinkedHashMap;
import java.util.List;

public final class aayd implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        ibuq.c(((List)object0));
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(((List)object0), 10)), 16));
        for(Object object1: ((List)object0)) {
            aaxk.a(((ParcelableAction)object1));
            aaxk aaxk0 = new aaxk(((ParcelableAction)object1));
            ibns ibns0 = new ibns(((ParcelableAction)object1).a, aaxk0);
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        return evrg.d(ibpz.e(linkedHashMap0));
    }
}

