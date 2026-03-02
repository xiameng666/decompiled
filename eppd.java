import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;

final class eppd extends ibsl implements ibtw {
    Object a;
    final eppe b;

    public eppd(eppe eppe0, ibrl ibrl0) {
        this.b = eppe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eppd)this.c(((List)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eppd(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        List list0 = (List)this.a;
        eppe eppe0 = this.b;
        synchronized(eppe0.a) {
            ArrayMap arrayMap0 = eppe0.f;
            arrayMap0.clear();
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: list0) {
                if((((epng)object2).b & 2) != 0) {
                    arrayList0.add(object2);
                }
            }
            for(Object object3: arrayList0) {
                arrayMap0.put(((epng)object3).c, new epoq(((epng)object3)));
            }
            eppe0.F();
        }
        return ibom.a;
    }
}

