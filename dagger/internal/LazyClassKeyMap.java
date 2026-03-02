package dagger.internal;

import ggeo;
import ggnf;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class LazyClassKeyMap implements Map {
    private final Map a;

    public LazyClassKeyMap(Map map0) {
        this.a = map0;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final boolean containsKey(Object object0) {
        if((object0 instanceof Class)) {
            return this.a.containsKey(((Class)object0).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override
    public final boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override
    public final Object get(Object object0) {
        if((object0 instanceof Class)) {
            return this.a.get(((Class)object0).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override
    public final Object put(Object object0, Object object1) {
        Class class0 = (Class)object0;
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final void putAll(Map map0) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final Object remove(Object object0) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final int size() {
        return ((ggnf)this.a).d;
    }

    @Override
    public final Collection values() {
        return ((ggeo)this.a).g();
    }
}

