import java.util.ArrayList;
import java.util.List;

final class ftuk implements iau {
    public static final ftuk a;

    static {
        ftuk.a = new ftuk();
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
        ArrayList arrayList0;
        boolean z = true;
        ibuq.f(iax0, "$this$Layout");
        int v1 = iax0.ei(16.0f);
        int v2 = list0.size();
        int v3 = (jkp.b(v) - (v2 - 1) * v1) / v2;
        int v4 = 0;
        if(list0.size() != 1 && !list0.isEmpty()) {
            for(Object object0: list0) {
                if(((ias)object0).b(30) > v3) {
                    z = false;
                    break;
                }
            }
        }
        if(list0.size() > 1 && z) {
            arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object1: list0) {
                arrayList0.add(((ias)object1).e(jkp.n(v, v3, v3, 0, 0, 12)));
            }
        }
        else {
            arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object2: list0) {
                arrayList0.add(((ias)object2).e(v));
            }
        }
        if(z) {
            return iaw.b(iax0, jkp.b(v), ((ibq)arrayList0.get(0)).b, new ftuj(z, arrayList0, v1, v));
        }
        for(Object object3: arrayList0) {
            v4 += ((ibq)object3).b;
        }
        return iaw.b(iax0, jkp.b(v), v4, new ftuj(z, arrayList0, v1, v));
    }
}

