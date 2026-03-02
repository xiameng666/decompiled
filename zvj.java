import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zvj implements ibtw {
    public final ibtw a;

    public zvj(ibtw ibtw0) {
        this.a = ibtw0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0;
        ibuq.f(((icr)object0), "$this$SubcomposeLayout");
        float f = ((icr)object0).eg(16.0f);
        float f1 = ((icr)object0).eg(8.0f);
        List list0 = ((icr)object0).q(ibom.a, this.a);
        int v = 0;
        if(list0.isEmpty()) {
            return iaw.b(((icr)object0), 0, 0, new zvl());
        }
        int v1 = 0;
        for(Object object2: list0) {
            v1 += ((ias)object2).b(0);
        }
        long v2 = ((jkp)object1).a;
        if(Float.compare(((float)v1) + ibwt.d(((float)(list0.size() - 1)) * f, 0.0f), jkp.b(v2)) <= 0) {
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object3: list0) {
                arrayList0.add(((ias)object3).e(jkp.n(v2, 0, 0, 0, 0, 14)));
            }
            int v3 = 0;
            for(Object object4: arrayList0) {
                v3 += ((ibq)object4).a;
            }
            float f2 = ibwt.d(((float)(arrayList0.size() - 1)) * f, 0.0f);
            Iterator iterator3 = arrayList0.iterator();
            if(iterator3.hasNext()) {
                Object object5 = iterator3.next();
                Integer integer1 = (int)((ibq)object5).b;
                while(iterator3.hasNext()) {
                    Object object6 = iterator3.next();
                    Integer integer2 = (int)((ibq)object6).b;
                    if(integer1.compareTo(integer2) < 0) {
                        integer1 = integer2;
                    }
                }
                integer0 = integer1;
            }
            else {
                integer0 = null;
            }
            if(integer0 != null) {
                v = (int)integer0;
            }
            return iaw.b(((icr)object0), jkp.b(v2), v, new zvm(((jkp)object1), ((float)v3) + f2, arrayList0, f));
        }
        List list1 = ibpo.am(list0);
        ArrayList arrayList1 = new ArrayList(ibpo.q(list1, 10));
        for(Object object7: list1) {
            arrayList1.add(((ias)object7).e(jkp.n(v2, 0, 0, 0, 0, 14)));
        }
        for(Object object8: arrayList1) {
            v += ((ibq)object8).b;
        }
        return iaw.b(((icr)object0), jkp.b(v2), ((int)(((float)v) + ibwt.d(((float)(arrayList1.size() - 1)) * f1, 0.0f))), new zvn(arrayList1, ((jkp)object1), f1));
    }
}

