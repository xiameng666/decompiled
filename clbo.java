import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class clbo extends clfr {
    public final byte[] a;
    private final hnnr b;
    private List c;

    public clbo(hnnr hnnr0, byte[] arr_b) {
        this.b = hnnr0;
        this.a = arr_b;
    }

    @Override  // clfr
    public final int a() {
        return this.b.e;
    }

    @Override  // clfr
    public final long b() {
        return this.b.k;
    }

    @Override  // clfr
    public final String c() {
        return this.b.f;
    }

    @Override  // clfr
    public final String d() {
        return this.b.i;
    }

    @Override  // clfr
    public final String e() {
        return this.b.j;
    }

    @Override  // clfr
    public final String f() {
        return this.b.c;
    }

    @Override  // clfr
    public final List g() {
        if(this.c == null) {
            this.c = this.b.g;
        }
        List list0 = new ArrayList();
        for(Object object0: this.c) {
            list0.add(new AbstractMap.SimpleImmutableEntry(((hnnq)object0).c, ((hnnq)object0).d));
        }
        return list0;
    }

    @Override  // clfr
    public final List h() {
        return this.b.d;
    }

    @Override  // clfr
    public final Map i() {
        if(this.c == null) {
            this.c = this.b.g;
        }
        Map map0 = new HashMap();
        for(Object object0: this.c) {
            hnnq hnnq0 = (hnnq)object0;
            if(!map0.containsKey(hnnq0.c)) {
                map0.put(hnnq0.c, new ArrayList());
            }
            ((List)map0.get(hnnq0.c)).add(hnnq0.d);
        }
        return map0;
    }
}

