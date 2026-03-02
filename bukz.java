import j..util.Map.-CC;
import j..util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class bukz extends LinkedHashMap implements Map {
    public bukz(int v) {
        super(v);
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
    public final boolean containsKey(Object object0) {
        return (object0 instanceof bukx) ? super.containsKey(((bukx)object0)) : false;
    }

    @Override
    public final boolean containsValue(Object object0) {
        return (object0 instanceof hivl) ? super.containsValue(((hivl)object0)) : false;
    }

    @Override  // j$.util.Map
    public final void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    public final Object get(Object object0) {
        return !(object0 instanceof bukx) ? null : ((hivl)super.get(((bukx)object0)));
    }

    @Override  // j$.util.Map
    public final Object getOrDefault(Object object0, Object object1) {
        return !(object0 instanceof bukx) ? object1 : ((hivl)Map.-CC.$default$getOrDefault(this, ((bukx)object0), ((hivl)object1)));
    }

    @Override  // j$.util.Map
    public final Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override  // j$.util.Map
    public final Object putIfAbsent(Object object0, Object object1) {
        return Map.-CC.$default$putIfAbsent(this, object0, object1);
    }

    @Override
    public final Object remove(Object object0) {
        return !(object0 instanceof bukx) ? null : ((hivl)super.remove(((bukx)object0)));
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        return !(object0 instanceof bukx) || !(object1 instanceof hivl) ? false : Map.-CC.$default$remove(this, ((bukx)object0), ((hivl)object1));
    }

    @Override
    protected final boolean removeEldestEntry(Map.Entry map$Entry0) {
        ibuq.f(map$Entry0, "eldest");
        return super.size() > ((int)htuh.b());
    }

    @Override  // j$.util.Map
    public final Object replace(Object object0, Object object1) {
        return Map.-CC.$default$replace(this, object0, object1);
    }

    @Override  // j$.util.Map
    public final boolean replace(Object object0, Object object1, Object object2) {
        return Map.-CC.$default$replace(this, object0, object1, object2);
    }

    @Override  // j$.util.Map
    public final void replaceAll(BiFunction biFunction0) {
        Map.-CC.$default$replaceAll(this, biFunction0);
    }
}

