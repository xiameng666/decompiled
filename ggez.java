import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class ggez {
    Map a;

    public ggdr d(int v) {
        return gged_interceptors.e(v);
    }

    public final ggfd e() {
        Map map0 = this.a;
        if(map0 == null) {
            return ggby.a;
        }
        Set set0 = map0.entrySet();
        if(set0.isEmpty()) {
            return ggby.a;
        }
        ggek ggek0 = new ggek(set0.size());
        int v = 0;
        for(Object object0: set0) {
            Object object1 = ((Map.Entry)object0).getKey();
            gged_interceptors gged0 = ((ggdy)((Map.Entry)object0).getValue()).h();
            ggek0.i(object1, gged0);
            v += ((ggna)gged0).c;
        }
        return new ggef(ggek0.b(), v);
    }

    final Map f() {
        Map map0 = this.a;
        if(map0 == null) {
            map0 = new ggav();
            this.a = map0;
        }
        return map0;
    }

    public final void g(Map.Entry map$Entry0) {
        this.j(map$Entry0.getKey(), map$Entry0.getValue());
    }

    public final void h(Object object0, Iterable iterable0) {
        if(object0 == null) {
            throw new NullPointerException("null key in entry: null=" + gggq.s(iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(iterator0.hasNext()) {
            ggdr ggdr0 = (ggdr)this.f().get(object0);
            if(ggdr0 == null) {
                ggdr0 = this.d(this.i(iterable0));
                this.f().put(object0, ggdr0);
            }
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                ggag.a(object0, object1);
                ggdr0.c(object1);
            }
        }
    }

    public int i(Iterable iterable0) {
        return (iterable0 instanceof Collection) ? Math.max(4, ((Collection)iterable0).size()) : 4;
    }

    public final void j(Object object0, Object object1) {
        ggag.a(object0, object1);
        ggdr ggdr0 = (ggdr)this.f().get(object0);
        if(ggdr0 == null) {
            ggdr0 = this.d(4);
            this.f().put(object0, ggdr0);
        }
        ggdr0.c(object1);
    }
}

