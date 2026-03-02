import java.util.ArrayList;
import java.util.List;

final class fuex implements iau {
    final boolean a;
    final boolean b;
    final boolean c;

    public fuex(boolean z, boolean z1, boolean z2) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        super();
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
        ibuq.f(iax0, "$this$Layout");
        int v1 = iax0.ei(16.0f);
        int v2 = iax0.ei(4.0f);
        int v3 = 0;
        int v4 = ((ias)list0.get(0)).b(jkp.a(v));
        int v5 = ((ias)list0.get(1)).b(jkp.a(v));
        int v6 = ((ias)list0.get(2)).b(jkp.a(v));
        int v7 = ((ias)list0.get(3)).b(jkp.a(v));
        boolean z = this.a;
        if(Math.max(v4, v5) + Math.max(v6, v7) + (z || this.b ? v1 : 0) > jkp.b(v)) {
            List list1 = ibpo.g(new ibq[]{((ias)list0.get(0)).e(jkq.k(0, jkp.b(v), 0, 13)), ((ias)list0.get(1)).e(jkq.k(0, jkp.b(v), 0, 13)), ((ias)list0.get(2)).e(jkq.k(0, jkp.b(v), 0, 13)), ((ias)list0.get(3)).e(jkq.k(0, jkp.b(v), 0, 13))});
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list1) {
                if(((ibq)object0).b > 0) {
                    arrayList0.add(object0);
                }
            }
            int v8 = jkp.b(v);
            for(Object object1: arrayList0) {
                v3 += ((ibq)object1).b;
            }
            return iaw.b(iax0, v8, v3 + (arrayList0.size() - 1) * v2, new fuev(list1, v2));
        }
        ibq[] arr_ibq = new ibq[4];
        arr_ibq[0] = ((ias)list0.get(0)).e(jkq.k(0, jkp.b(v) - v4 - (z ? v1 : 0), 0, 13));
        ias ias0 = (ias)list0.get(1);
        int v9 = jkp.b(v) - v7;
        if(!this.b) {
            v1 = 0;
        }
        arr_ibq[1] = ias0.e(jkq.k(0, v9 - v1, 0, 13));
        arr_ibq[2] = ((ias)list0.get(2)).e(jkq.k(0, v6, 0, 13));
        arr_ibq[3] = ((ias)list0.get(3)).e(jkq.k(0, v7, 0, 13));
        List list2 = ibpo.g(arr_ibq);
        if(!this.c && !z) {
            v2 = 0;
        }
        return iaw.b(iax0, jkp.b(v), Math.max(((ibq)list2.get(0)).b, ((ibq)list2.get(2)).b) + Math.max(((ibq)list2.get(1)).b, ((ibq)list2.get(3)).b) + v2, new fuew(list2, v2, v));
    }
}

