import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class ftzk implements iau {
    final gra a;

    public ftzk(gra gra0) {
        this.a = gra0;
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
        int v1;
        ibuq.f(iax0, "$this$Layout");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        Iterator iterator0 = list0.iterator();
        while(true) {
            v1 = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            arrayList0.add(((ias)object0).e(jkq.k(0, jkp.b(v), 0, 13)));
        }
        gra gra0 = this.a;
        int v2 = 0;
        for(Object object1: arrayList0) {
            v2 += ((ibq)object1).a;
        }
        gra0.b(Boolean.valueOf(v2 + iax0.ei(8.0f) * (arrayList0.size() - 1) > jkp.b(v)));
        if(ftzl.a(gra0)) {
            for(Object object2: arrayList0) {
                v1 += ((ibq)object2).b;
            }
            int v3 = v1 + iax0.ei(0.0f) * (arrayList0.size() - 1);
            return iaw.b(iax0, jkp.b(v), Math.min(v3, jkp.a(v)), new ftzj(arrayList0, v3, gra0));
        }
        Iterator iterator3 = arrayList0.iterator();
        if(!iterator3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object3 = iterator3.next();
        int v4 = ((ibq)object3).b;
        while(iterator3.hasNext()) {
            Object object4 = iterator3.next();
            int v5 = ((ibq)object4).b;
            if(v4 < v5) {
                v4 = v5;
            }
            continue;
        }
        return iaw.b(iax0, jkp.b(v), Math.min(v4, jkp.a(v)), new ftzj(arrayList0, v4, gra0));
    }
}

