import j..util.Map.-CC;
import j..util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class bym implements ibvi, Map, java.util.Map {
    private final bzk a;
    private bxk b;
    private bya c;
    private bzz d;

    public bym(bzk bzk0) {
        this.a = bzk0;
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
    public final boolean containsKey(Object object0) {
        return this.a.c(object0);
    }

    @Override
    public final boolean containsValue(Object object0) {
        return this.a.d(object0);
    }

    @Override
    public final Set entrySet() {
        Set set0 = this.b;
        if(set0 != null) {
            return set0;
        }
        bxk bxk0 = new bxk(this.a);
        this.b = bxk0;
        return bxk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : ibuq.m(this.a, ((bym)object0).a);
    }

    @Override  // j$.util.Map
    public final void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    public final Object get(Object object0) {
        return this.a.a(object0);
    }

    @Override  // j$.util.Map
    public final Object getOrDefault(Object object0, Object object1) {
        return Map.-CC.$default$getOrDefault(this, object0, object1);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.e();
    }

    @Override
    public final Set keySet() {
        Set set0 = this.c;
        if(set0 != null) {
            return set0;
        }
        bya bya0 = new bya(this.a);
        this.c = bya0;
        return bya0;
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
        return this.a.e;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final Collection values() {
        Collection collection0 = this.d;
        if(collection0 != null) {
            return collection0;
        }
        bzz bzz0 = new bzz(this.a);
        this.d = bzz0;
        return bzz0;
    }
}

