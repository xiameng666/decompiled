import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class ggfq extends ggez {
    public final ggft a() {
        Map map0 = this.a;
        if(map0 == null) {
            return ggbz.a;
        }
        Set set0 = map0.entrySet();
        if(set0.isEmpty()) {
            return ggbz.a;
        }
        ggek ggek0 = new ggek(set0.size());
        int v = 0;
        for(Object object0: set0) {
            Object object1 = ((Map.Entry)object0).getKey();
            ggfp ggfp0 = ggfp.G(((ggfn)((Map.Entry)object0).getValue()).h());
            if(!ggfp0.isEmpty()) {
                ggek0.i(object1, ggfp0);
                v += ggfp0.size();
            }
        }
        return new ggft(ggek0.b(), v);
    }

    public final void b(Object object0, Object object1) {
        super.j(object0, object1);
    }

    public final void c(Map.Entry map$Entry0) {
        super.g(map$Entry0);
    }

    @Override  // ggez
    public final ggdr d(int v) {
        return ggfp.D(v);
    }

    @Override  // ggez
    public final int i(Iterable iterable0) {
        return (iterable0 instanceof Set) ? Math.max(4, ((Set)iterable0).size()) : 4;
    }

    public final void k(Object object0, Iterable iterable0) {
        super.h(object0, iterable0);
    }

    public final void l(Object object0, Object[] arr_object) {
        super.h(object0, Arrays.asList(arr_object));
    }
}

