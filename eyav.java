import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

final class eyav implements icih {
    final eyaz a;

    public eyav(eyaz eyaz0) {
        this.a = eyaz0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object1;
        eyaz eyaz0 = this.a;
        if(eyaz0.g) {
            ArrayList arrayList0 = new ArrayList(ibpo.q(((List)object0), 10));
            for(Object object2: ((List)object0)) {
                eyat.a(((exwv)object2).e);
                arrayList0.add(new eyat(((exwv)object2).e));
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList0, 10)), 16));
            for(Object object3: arrayList0) {
                linkedHashMap0.put(object3, Boolean.valueOf(eyaz0.i.isEnabled() && eyaz0.i.getRemoteDevice(((eyat)object3).a).isConnected()));
            }
            eyaz0.b(linkedHashMap0);
        }
        object1 = ibom.a;
        return object1 == ibrx.a ? object1 : ibom.a;
    }
}

