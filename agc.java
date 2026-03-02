import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class agc {
    public final Set a;
    public final Set b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final boolean h;
    public final int i;

    public agc(Set set0, Set set1, Map map0, Map map1, Map map2, Map map3, Map map4, boolean z, int v) {
        kay.i(set0);
        this.a = set0;
        kay.i(set1);
        this.b = set1;
        kay.i(map0);
        this.c = map0;
        kay.i(map1);
        this.d = map1;
        kay.i(map2);
        this.e = map2;
        kay.i(map3);
        this.f = map3;
        kay.i(map4);
        this.g = map4;
        this.h = z;
        this.i = v;
    }

    public static bxd a(Map map0) {
        bxd bxd0 = new bxd(((bzs)map0).d_num);
        for(Object object0: map0.entrySet()) {
            bxf bxf0 = new bxf();
            for(Object object1: ((Set)((Map.Entry)object0).getValue())) {
                bxf0.add(new bxf(((Set)object1)));
            }
            bxd0.put(((String)((Map.Entry)object0).getKey()), bxf0);
        }
        return bxd0;
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.g);
    }

    public final Map c() {
        return DesugarCollections.unmodifiableMap(this.e);
    }

    public final Map d() {
        return agc.a(this.d);
    }

    public final Map e() {
        Map map0 = new bxd();
        for(Object object0: this.f.entrySet()) {
            map0.put(((String)((Map.Entry)object0).getKey()), new bxf(((Collection)((Map.Entry)object0).getValue())));
        }
        return map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof agc) ? this.a.equals(((agc)object0).a) && this.b.equals(((agc)object0).b) && this.c.equals(((agc)object0).c) && this.d.equals(((agc)object0).d) && this.e.equals(((agc)object0).e) && this.f.equals(((agc)object0).f) && this.g.equals(((agc)object0).g) && this.h == ((agc)object0).h && this.i == ((agc)object0).i : false;
    }

    public final Map f() {
        Map map0 = new bxd();
        for(Object object0: this.c.entrySet()) {
            map0.put(((String)((Map.Entry)object0).getKey()), new bxf(((Collection)((Map.Entry)object0).getValue())));
        }
        return map0;
    }

    public final Set g() {
        return DesugarCollections.unmodifiableSet(this.a);
    }

    public final Set h() {
        return DesugarCollections.unmodifiableSet(this.b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), ((int)this.i)});
    }
}

