import java.util.ArrayList;
import java.util.List;

final class ftus implements iau {
    public static final ftus a;

    static {
        ftus.a = new ftus();
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        return iat.a(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        return iat.b(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        return iat.c(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        return iat.d(this, hzg0, list0, v);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        ArrayList arrayList1;
        ibuq.f(iax0, "$this$Layout");
        int v1 = iax0.ei(16.0f);
        int v2 = 0;
        int v3 = 0;
        for(Object object0: list0) {
            v3 += ((ias)object0).b(jkp.a(v));
        }
        boolean z = v3 + (list0.size() - 1) * v1 <= jkp.b(v);
        if(z) {
            int v4 = (jkp.b(v) - (list0.size() - 1) * v1) / list0.size();
            int v5 = 0;
            for(Object object1: list0) {
                v5 = ibwt.g(v5, ((ias)object1).b(jkp.a(v)));
            }
            if(v5 < v4) {
                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                for(Object object2: list0) {
                    arrayList0.add(((ias)object2).e(jkq.k(v4, 0, 0, 14)));
                }
                arrayList1 = arrayList0;
            }
            else {
                int v6 = jkp.b(v);
                int v7 = (list0.size() - 1) * v1;
                ArrayList arrayList2 = new ArrayList(ibpo.q(list0, 10));
                for(Object object3: list0) {
                    arrayList2.add(((ias)object3).e(jkq.k(v6 - v5 - v7, jkp.b(v), 0, 12)));
                }
                arrayList1 = arrayList2;
            }
        }
        else {
            ArrayList arrayList3 = new ArrayList(ibpo.q(list0, 10));
            for(Object object4: list0) {
                arrayList3.add(((ias)object4).e(jkq.k(jkp.b(v), jkp.b(v), 0, 12)));
            }
            arrayList1 = arrayList3;
        }
        if(z) {
            return iaw.b(iax0, jkp.b(v), ((ibq)arrayList1.get(0)).b, new ftur(z, arrayList1, v1, v));
        }
        for(Object object5: arrayList1) {
            v2 += ((ibq)object5).b;
        }
        return iaw.b(iax0, jkp.b(v), (list0.size() - 1) * v1 + v2, new ftur(z, arrayList1, v1, v));
    }
}

