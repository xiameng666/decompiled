import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class deoz implements ibts {
    public final ShareTarget a;
    public final dffz b;

    public deoz(ShareTarget shareTarget0, dffz dffz0) {
        this.a = shareTarget0;
        this.b = dffz0;
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
                dffg0 = devq.d(shareTarget0, this.b, dffg0.i, null, 4);
            }
            ((Collection)object1).add(dffg0);
        }
        return object1;
    }
}

