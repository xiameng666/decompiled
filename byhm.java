import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public final class byhm implements ibtw {
    public final Map.Entry a;

    public byhm(Map.Entry map$Entry0) {
        this.a = map$Entry0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Object object2;
        ibuq.f(((Integer)object0), "<unused var>");
        Map.Entry map$Entry0 = this.a;
        if(((byhx)object1) == null) {
            object2 = (byhx)map$Entry0.getValue();
            return object2.a.isEmpty() ? null : object2;
        }
        List list0 = ((byhx)map$Entry0.getValue()).a;
        List list1 = ibpo.ak(((byhx)object1).a, list0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object3: list1) {
            if(hashSet0.add(((byhu)object3).b)) {
                arrayList0.add(object3);
            }
        }
        object2 = byhx.a(((byhx)object1), arrayList0, null, 2);
        return object2.a.isEmpty() ? null : object2;
    }
}

