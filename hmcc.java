import java.util.ArrayList;
import java.util.List;

public final class hmcc extends hmcb {
    @Override  // hmcb
    public final List a(hmgf hmgf0) {
        int v1;
        List list0 = new ArrayList();
        hmcs hmcs0 = hmgf0.p;
        hmgf0.h.e = true;
        long v = hmgf0.h.c.a();
        boolean z = Long.compare(v, 0L) >= 0 && v > hmcp.b;
        hmcp.b = v;
        if(z) {
            hmcp.a.a();
        }
        switch(hmgf0.e()) {
            case 1: {
                v1 = hmcs0.b.p;
                break;
            }
            case 2: {
                v1 = hmcs0.c.p;
                break;
            }
            default: {
                throw null;
            }
        }
        if(v1 == 0) {
            throw null;
        }
        if(v1 - 1 != 0) {
            return list0;
        }
        list0.addAll(hmcc.b(hmgf0));
        return list0;
    }

    private static final List b(hmgf hmgf0) {
        long v1;
        List list0 = new ArrayList();
        if(!hmgf0.h.e) {
            list0.add(hmhq.f);
            return list0;
        }
        int v = hmgf0.f();
        switch(v - 1) {
            case 0: {
                v1 = System.currentTimeMillis();
                break;
            }
            case 1: {
                v1 = System.currentTimeMillis();
                break;
            }
            default: {
                v1 = System.currentTimeMillis();
            }
        }
        int v2 = hmcp.a.b;
        if(!(v == 1 ? v2 >= 3 : v2 >= 3 || (hmcp.b < v1 - 300000L || hmcp.b < 0L))) {
            return list0;
        }
        list0.add(hmhq.d);
        return list0;
    }
}

