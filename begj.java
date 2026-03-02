import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class begj implements evpo {
    public final List a;
    public final begp b;

    public begj(List list0, begp begp0) {
        this.a = list0;
        this.b = begp0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(!evql0.n()) {
            a.ae(begp.a.j(), "fetching passkeys failed", evql0.i());
            return evrg.d(ggna.a);
        }
        List list0 = (List)((Pair)evql0.j()).first;
        boolean[] arr_z = (boolean[])((Pair)evql0.j()).second;
        gfuy.a(list0.size() == arr_z.length);
        ibuq.c(list0);
        ibwm ibwm0 = ibpo.k(list0);
        ArrayList arrayList0 = new ArrayList();
        ibpw ibpw0 = ibwm0.e();
        while(((ibwl)ibpw0).a) {
            Object object0 = ibpw0.next();
            if(!arr_z[((Number)object0).intValue()]) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object1: arrayList0) {
            int v = ((Number)object1).intValue();
            arrayList1.add(new ibns(bedg.f(((hery)list0.get(v))), bedg.f(((hery)list0.get(v))).c));
        }
        int v1 = ibpo.q(arrayList1, 10);
        ArrayList arrayList2 = new ArrayList(v1);
        ArrayList arrayList3 = new ArrayList(v1);
        for(Object object2: arrayList1) {
            arrayList2.add(((ibns)object2).a);
            arrayList3.add(((ibns)object2).b);
        }
        ibns ibns0 = new ibns(arrayList2, arrayList3);
        List list1 = (List)ibns0.a;
        List list2 = (List)ibns0.b;
        HashSet hashSet0 = new HashSet();
        for(Object object3: list1) {
            ibuq.e(((bedg)object3).f, "castNonNull(...)");
            gfuy.a(hashSet0.add(Pair.create(((bedg)object3).f.g, ((bedg)object3).f.h)));
        }
        gged_interceptors gged0 = ggdx.a(list1);
        this.a.add(gged0);
        gged_interceptors gged1 = ggdx.a(list2);
        return this.b.e.b(gged1);
    }
}

