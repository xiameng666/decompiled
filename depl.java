import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class depl implements ibts {
    public final ShareTarget a;

    public depl(ShareTarget shareTarget0) {
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
                dffz dffz0 = dffg0.h;
                boolean z = !dffg0.k.q && shareTarget0.q && ((dffz0 instanceof dffq) || (dffz0 instanceof dffl) || (dffz0 instanceof dffp) || (dffz0 instanceof dffk));
                Boolean.valueOf(z).getClass();
                if(z) {
                    dffz0 = null;
                }
                if(dffz0 == null) {
                    dffz0 = new dffq(true);
                }
                dffg0 = devq.d(shareTarget0, dffz0, dffg0.i, null, 4);
            }
            ((Collection)object1).add(dffg0);
        }
        return object1;
    }
}

