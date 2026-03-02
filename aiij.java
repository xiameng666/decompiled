import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.Iterator;
import java.util.List;

public final class aiij implements evqf {
    public final aiiq a;

    public aiij(aiiq aiiq0) {
        this.a = aiiq0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        aiiq.j.h("Successfully retrieved nodes", new Object[0]);
        Iterator iterator0 = ((List)object0).iterator();
        while(iterator0.hasNext()) {
            aiiq aiiq0 = this.a;
            Object object1 = iterator0.next();
            NodeParcelable nodeParcelable0 = (NodeParcelable)object1;
            if(!aiiq0.g || nodeParcelable0.d) {
                String s = aiiq0.f;
                byte[] arr_b = aiiq0.h;
                if(aiiq0.d == null) {
                    aiiq0.d = fcfo.d(aiiq0.b);
                }
                evql evql0 = aiiq0.d.h(nodeParcelable0.a, s, arr_b);
                evql0.b(new aiil(s, nodeParcelable0));
                evql0.A(new aiim());
            }
        }
    }
}

