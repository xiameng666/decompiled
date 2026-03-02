import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class iboy implements ibvi, Map, java.util.Map {
    private final Map.Entry a(Object object0) {
        for(Object object1: this.f()) {
            if(ibuq.m(((Map.Entry)object1).getKey(), object0)) {
                return (Map.Entry)object1;
            }
        }
        return null;
    }

    public int b() {
        throw null;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final Object compute(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final Object computeIfAbsent(Object object0, Function function0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final Object computeIfPresent(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.a(object0) != null;
    }

    @Override
    public boolean containsValue(Object object0) {
        Set set0 = this.f();
        if(set0.isEmpty()) {
            return false;
        }
        for(Object object1: set0) {
            if(ibuq.m(((Map.Entry)object1).getValue(), object0)) {
                return true;
            }
        }
        return false;
    }

    public Collection e() {
        throw null;
    }

    @Override
    public final Set entrySet() {
        return this.f();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof java.util.Map)) {
            if(this.b() != ((java.util.Map)object0).size()) {
                return false;
            }
            Set set0 = ((java.util.Map)object0).entrySet();
            if((set0 instanceof Collection) && set0.isEmpty()) {
                return true;
            }
            for(Object object1: set0) {
                if(((Map.Entry)object1) == null) {
                    return false;
                }
                Object object2 = ((Map.Entry)object1).getKey();
                Object object3 = ((Map.Entry)object1).getValue();
                Object object4 = this.get(object2);
                if(!ibuq.m(object3, object4)) {
                    return false;
                }
                if(object4 == null && !this.containsKey(object2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract Set f();

    @Override  // j$.util.Map
    public final void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    public Set g() {
        throw null;
    }

    @Override
    public Object get(Object object0) {
        Map.Entry map$Entry0 = this.a(object0);
        return map$Entry0 == null ? null : map$Entry0.getValue();
    }

    @Override  // j$.util.Map
    public Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    @Override
    public final int hashCode() {
        return this.f().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.b() == 0;
    }

    public final String j(Object object0) {
        return object0 == this ? "(this Map)" : String.valueOf(object0);
    }

    @Override
    public final Set keySet() {
        return this.g();
    }

    @Override  // j$.util.Map
    public final Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void putAll(java.util.Map map0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final Object putIfAbsent(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final Object replace(Object object0, Object object1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final boolean replace(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Map
    public final void replaceAll(BiFunction biFunction0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.b();
    }

    @Override
    public final String toString() {
        return ibpo.aK(this.f(), ", ", "{", "}", new ibox(this), 24);
    }

    @Override
    public final Collection values() {
        return this.e();
    }
}

