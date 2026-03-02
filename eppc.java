import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;

final class eppc extends ibsl implements ibtw {
    Object a;
    final eppe b;

    public eppc(eppe eppe0, ibrl ibrl0) {
        this.b = eppe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eppc)this.c(((List)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eppc(this.b, ibrl0);
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
            azts azts0 = eppe0.h;
            evql evql0 = azts0.ad(eppe0.e);
            gmap gmap0 = gmap.a;
            evql0.v(gmap0, new eppa());
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: list0) {
                if((((epng)object2).b & 2) != 0) {
                    arrayList0.add(object2);
                }
            }
            for(Object object3: arrayList0) {
                arrayMap0.put(((epng)object3).c, new epoq(((epng)object3)));
                cmnk cmnk0 = new cmnk();
                cmni cmni0 = new cmni();
                cmni0.e(((epng)object3).c);
                hjij hjij0 = ((epng)object3).d;
                if(hjij0 == null) {
                    hjij0 = hjij.a;
                }
                double f = hjij0.b;
                hjij hjij1 = ((epng)object3).d;
                if(hjij1 == null) {
                    hjij1 = hjij.a;
                }
                cmni0.b(f, hjij1.c, ((epng)object3).e);
                cmni0.a = 11;
                cmnk0.c(cmni0.a());
                cmnk0.e(3);
                azts0.ac(cmnk0.b(), eppe0.e).v(gmap0, new eppb());
            }
            eppe0.F();
        }
        return ibom.a;
    }
}

