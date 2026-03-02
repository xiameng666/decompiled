import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class depj implements ibts {
    public final ShareTarget a;

    public depj(ShareTarget shareTarget0) {
        this.a = shareTarget0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((List)object0), "$this$modifyAllDevices");
        ibuq.f(((List)object0), "<this>");
        ShareTarget shareTarget0 = this.a;
        ibuq.f(shareTarget0, "shareTarget");
        Object object1 = new ArrayList(ibpo.q(((List)object0), 10));
        for(Object object2: ((List)object0)) {
            dffg dffg0 = (dffg)object2;
            if(dffg0.a == shareTarget0.a && (dffg0.h instanceof dffq)) {
                dffg0 = dffg.a(dffg0, new dffq(true), false, 0x77F);
            }
            ((Collection)object1).add(dffg0);
        }
        return object1;
    }
}

