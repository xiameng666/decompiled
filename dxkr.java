import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.Iterator;
import java.util.Set;

public final class dxkr implements ibts {
    public final dxlm a;

    public dxkr(dxlm dxlm0) {
        this.a = dxlm0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1;
        dxlm dxlm0;
        ibuq.c(((fcee)object0));
        Set set0 = ((fcee)object0).b();
        ibuq.e(set0, "getNodes(...)");
        Iterator iterator0 = set0.iterator();
        do {
            dxlm0 = this.a;
            if(!iterator0.hasNext()) {
                goto label_9;
            }
            object1 = iterator0.next();
        }
        while(!ibuq.m(((NodeParcelable)object1).a, dxlm0.al));
        goto label_10;
    label_9:
        object1 = null;
    label_10:
        if(((NodeParcelable)object1) != null) {
            ibuq.e(((NodeParcelable)object1).b, "getDisplayName(...)");
            dxlm0.an.b(((NodeParcelable)object1).b);
            return ibom.a;
        }
        ((ggtj)dxlm.b.j()).x("Could not find watch name");
        return ibom.a;
    }
}

