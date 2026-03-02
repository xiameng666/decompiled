import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class depb implements ibts {
    public final ShareTarget a;

    public depb(ShareTarget shareTarget0) {
        this.a = shareTarget0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((List)object0), "$this$modifyAllDevices");
        Object object1 = new ArrayList();
        for(Object object2: ((List)object0)) {
            if(((dffg)object2).a != this.a.a) {
                ((Collection)object1).add(object2);
            }
        }
        return object1;
    }
}

