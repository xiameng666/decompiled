import java.util.ArrayList;
import java.util.List;

final class fuet implements iau {
    public static final fuet a;

    static {
        fuet.a = new fuet();
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
        int v1 = iax0.ei(4.0f);
        int v2 = iax0.ei(16.0f);
        ias ias0 = (ias)list0.get(0);
        ias ias1 = (ias)list0.get(1);
        ias ias2 = (ias)list0.get(2);
        ibq ibq0 = ((ias)list0.get(3)).e(jkq.k(0, jkp.b(v), 0, 13));
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ibpo.g(new ibq[]{ias0.e(jkq.k(0, jkp.b(v), 0, 13)), ias1.e(jkq.k(0, jkp.b(v), 0, 13)), ias2.e(jkq.k(0, jkp.b(v), 0, 13))})) {
            if(((ibq)object0).b > 0) {
                arrayList0.add(object0);
            }
        }
        int v3 = jkp.b(v);
        int v4 = 0;
        for(Object object1: arrayList0) {
            v4 += ((ibq)object1).b;
        }
        int v5 = v4 + (arrayList0.size() - 1) * v1;
        int v6 = ibq0.b;
        return v6 <= 0 ? iaw.b(iax0, v3, Math.max(v5, 0), new fues(arrayList0, v1, ibq0, v2)) : iaw.b(iax0, v3, Math.max(v5 + (v6 - v2 + v1), 0), new fues(arrayList0, v1, ibq0, v2));
    }
}

