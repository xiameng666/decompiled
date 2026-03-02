import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class bxd extends bzs implements Map, java.util.Map {
    bwx a;
    bwz b;
    bxb c;

    public bxd() {
    }

    public bxd(int v) {
        super(v);
    }

    public bxd(bzs bzs0) {
        super(bzs0);
    }

    public final boolean a(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.containsKey(object0)) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(Collection collection0) {
        int v = this.d_num;
        for(Object object0: collection0) {
            this.remove(object0);
        }
        return v != this.d_num;
    }

    public final boolean c(Collection collection0) {
        int v = this.d_num;
        for(int v1 = v - 1; v1 >= 0; --v1) {
            if(!collection0.contains(this.f(v1))) {
                this.g(v1);
            }
        }
        return v != this.d_num;
    }

    @Override  // j$.util.Map
    public final Object compute(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$compute(this, object0, biFunction0);
    }

    @Override  // j$.util.Map
    public final Object computeIfAbsent(Object object0, Function function0) {
        return Map.-CC.$default$computeIfAbsent(this, object0, function0);
    }

    @Override  // j$.util.Map
    public final Object computeIfPresent(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$computeIfPresent(this, object0, biFunction0);
    }

    @Override
    public final Set entrySet() {
        bwx bwx0 = this.a;
        if(bwx0 == null) {
            bwx0 = new bwx(this);
            this.a = bwx0;
        }
        return bwx0;
    }

    @Override  // j$.util.Map
    public final void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    public final Set keySet() {
        bwz bwz0 = this.b;
        if(bwz0 == null) {
            bwz0 = new bwz(this);
            this.b = bwz0;
        }
        return bwz0;
    }

    @Override  // j$.util.Map
    public final Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override
    public final void putAll(java.util.Map map0) {
        this.j(this.d_num + map0.size());
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override  // j$.util.Map
    public final void replaceAll(BiFunction biFunction0) {
        Map.-CC.$default$replaceAll(this, biFunction0);
    }

    @Override
    public final Collection values() {
        bxb bxb0 = this.c;
        if(bxb0 == null) {
            bxb0 = new bxb(this);
            this.c = bxb0;
        }
        return bxb0;
    }
}

