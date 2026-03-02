import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class depi implements ibts {
    public final ShareTarget a;

    public depi(ShareTarget shareTarget0) {
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
            if(dffg0.a == shareTarget0.a) {
                dffg0 = dffg.a(dffg0, null, true, 0x6FF);
            }
            ((Collection)object1).add(dffg0);
        }
        return object1;
    }
}

