import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class ryn extends ryr {
    private final Map a;
    private final Map g;

    public ryn(rof rof0, Set set0, Set set1) {
        ibuq.f(set0, "activities");
        ibuq.f(set1, "tasks");
        super(new rym(rof0));
        this.a = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set0, 10)), 16));
        this.g = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set1, 10)), 16));
    }

    @Override  // rve
    public final Object j(Context context0, Object object0, ibrl ibrl0) {
        sct.c("PendingContractProvider", "Resolving PendingContract for " + ((ryj)object0).m());
        roo roo0 = ((ryj)object0).b;
        rjr rjr0 = (rjr)this.a.get(roo0);
        if(rjr0 != null) {
            Object object1 = rjr0.i(context0, rjr0.j(sdm.e(((ryj)object0).d).b()));
            Objects.toString(roo0);
            sct.c("PendingContractProvider", "Provided PendingContract.Activity for " + rol.a(roo0));
            return object1;
        }
        rvp rvp0 = (rvp)this.g.get(roo0);
        if(rvp0 != null) {
            Object object2 = rvp0.x(rvp0.a.fm(((ryj)object0).d));
            Objects.toString(roo0);
            sct.c("PendingContractProvider", "Provided PendingContract.Task for " + rol.a(roo0));
            return object2;
        }
        Objects.toString(roo0);
        sct.a("PendingContractProvider", "Failed to provide PendingContract for " + rol.a(roo0));
        throw new ruu("Node " + rol.a(roo0) + " is not recognised by this provider");
    }
}

