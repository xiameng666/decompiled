import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class ftun implements iau {
    final ftuw a;

    public ftun(ftuw ftuw0) {
        this.a = ftuw0;
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
        int v2;
        ibuq.f(iax0, "$this$Layout");
        if(list0.size() > 2) {
            throw new IllegalArgumentException("ActionBar does not support more than 2 button items.");
        }
        int v1 = iax0.ei(16.0f);
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        Iterator iterator0 = list0.iterator();
        while(true) {
            v2 = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            arrayList0.add(((ias)object0).e(jkq.k(0, jkp.b(v), 0, 13)));
        }
        int v3 = 0;
        for(Object object1: arrayList0) {
            v3 += ((ibq)object1).a;
        }
        if(v3 <= jkp.b(v)) {
            Iterator iterator2 = arrayList0.iterator();
            if(!iterator2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object2 = iterator2.next();
            int v4 = ((ibq)object2).b;
            while(iterator2.hasNext()) {
                Object object3 = iterator2.next();
                int v5 = ((ibq)object3).b;
                if(v4 < v5) {
                    v4 = v5;
                }
            }
            ibvb ibvb0 = new ibvb();
            return iaw.b(iax0, jkp.b(v), v4, new ftul(this.a, arrayList0, ibvb0, v1, v));
        }
        for(Object object4: arrayList0) {
            v2 += ((ibq)object4).b;
        }
        ibvb ibvb1 = new ibvb();
        return iaw.b(iax0, jkp.b(v), (arrayList0.size() - 1) * v1 + v2, new ftum(arrayList0, this.a, v, ibvb1, v1));
    }
}

