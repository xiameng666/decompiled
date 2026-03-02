import j..util.Map.-CC;
import j..util.Map;
import j..util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class ggeo implements Map, Serializable, java.util.Map {
    private transient ggfp a;
    static final Map.Entry[] b = null;
    private transient ggfp c;
    private transient ggds d;
    private static final long serialVersionUID = 0xDECAFL;

    static {
        ggeo.b = new Map.Entry[0];
    }

    public abstract boolean c();

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
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
    public boolean containsKey(Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public final boolean containsValue(Object object0) {
        return this.g().contains(object0);
    }

    public abstract ggfp d();

    @Override
    public Set entrySet() {
        return this.v();
    }

    @Override
    public boolean equals(Object object0) {
        return ggkm.o(this, object0);
    }

    public abstract ggds f();

    @Override  // j$.util.Map
    public final void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    public ggds g() {
        ggds ggds0 = this.d;
        if(ggds0 == null) {
            ggds0 = this.f();
            this.d = ggds0;
        }
        return ggds0;
    }

    @Override
    public abstract Object get(Object arg1);

    @Override  // j$.util.Map
    public final Object getOrDefault(Object object0, Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? object1 : object2;
    }

    @Override
    public final int hashCode() {
        return ggog.a(this.v());
    }

    public static ggek i(int v) {
        ggag.c(v, "expectedSize");
        return new ggek(v);
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    public static ggeo j(Iterable iterable0) {
        ggek ggek0 = new ggek(((iterable0 instanceof Collection) ? ((Collection)iterable0).size() : 4));
        ggek0.l(iterable0);
        return ggek0.b();
    }

    public static ggeo k(java.util.Map map0) {
        return !(map0 instanceof ggeo) || (map0 instanceof SortedMap) || ((ggeo)map0).c() ? ggeo.j(map0.entrySet()) : ((ggeo)map0);
    }

    @Override
    public Set keySet() {
        return this.w();
    }

    public static ggeo l(Object object0, Object object1) {
        ggag.a(object0, object1);
        return ggnf.b(1, new Object[]{object0, object1});
    }

    public static ggeo m(Object object0, Object object1, Object object2, Object object3) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        return ggnf.b(2, new Object[]{object0, object1, object2, object3});
    }

    @Override  // j$.util.Map
    public final Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    public static ggeo n(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        ggag.a(object4, object5);
        return ggnf.b(3, new Object[]{object0, object1, object2, object3, object4, object5});
    }

    public static ggeo o(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        ggag.a(object4, object5);
        ggag.a(object6, object7);
        return ggnf.b(4, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7});
    }

    public ggqj oq() {
        return new ggei(this, this.v().om());
    }

    public abstract ggfp ou();

    public static ggeo p(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        ggag.a(object4, object5);
        ggag.a(object6, object7);
        ggag.a(object8, object9);
        return ggnf.b(5, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9});
    }

    @Override
    @Deprecated
    public final Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(java.util.Map map0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final Object putIfAbsent(Object object0, Object object1) {
        return Map.-CC.$default$putIfAbsent(this, object0, object1);
    }

    public static ggeo q(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        ggag.a(object4, object5);
        ggag.a(object6, object7);
        ggag.a(object8, object9);
        ggag.a(object10, object11);
        return ggnf.b(6, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11});
    }

    public static ggeo r(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        ggag.a(object4, object5);
        ggag.a(object6, object7);
        ggag.a(object8, object9);
        ggag.a(object10, object11);
        ggag.a(object12, object13);
        return ggnf.b(7, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13});
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    @Deprecated
    public final Object remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        return Map.-CC.$default$remove(this, object0, object1);
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

    public static ggeo s(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        ggag.a(object4, object5);
        ggag.a(object6, object7);
        ggag.a(object8, object9);
        ggag.a(object10, object11);
        ggag.a(object12, object13);
        ggag.a(object14, object15);
        return ggnf.b(8, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15});
    }

    public static ggeo t(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        ggag.a(object0, object1);
        ggag.a(object2, object3);
        ggag.a(object4, object5);
        ggag.a(object6, object7);
        ggag.a(object8, object9);
        ggag.a(object10, object11);
        ggag.a(object12, object13);
        ggag.a(object14, object15);
        ggag.a(object16, object17);
        ggag.a(object18, object19);
        return ggnf.b(10, new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19});
    }

    @Override
    public final String toString() {
        return ggkm.j(this);
    }

    @SafeVarargs
    public static ggeo u(Map.Entry[] arr_map$Entry) {
        return ggeo.j(Arrays.asList(arr_map$Entry));
    }

    public final ggfp v() {
        ggfp ggfp0 = this.a;
        if(ggfp0 == null) {
            ggfp0 = this.ou();
            this.a = ggfp0;
        }
        return ggfp0;
    }

    @Override
    public Collection values() {
        return this.g();
    }

    public ggfp w() {
        ggfp ggfp0 = this.c;
        if(ggfp0 == null) {
            ggfp0 = this.d();
            this.c = ggfp0;
        }
        return ggfp0;
    }

    public Object writeReplace() {
        return new ggen(this);
    }

    public static Collector x() {
        return ggaf.b(new ggeg(), new ggeh());
    }
}

