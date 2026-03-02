import j..util.Map;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public final class ggfz extends ggeo implements Map, NavigableMap {
    public static final Comparator a;
    public static final ggfz c;
    public final transient ggnk d;
    public final transient gged_interceptors e;
    private final transient ggfz f;
    private static final long serialVersionUID;

    static {
        ggfz.a = ggmi.a;
        ggfz.c = new ggfz(gggc.W(ggmi.a), ggna.a);
    }

    public ggfz(ggnk ggnk0, gged_interceptors gged0) {
        this(ggnk0, gged0, null);
    }

    public ggfz(ggnk ggnk0, gged_interceptors gged0, ggfz ggfz0) {
        this.d = ggnk0;
        this.e = gged0;
        this.f = ggfz0;
    }

    public static ggfz A(Comparator comparator0, boolean z, Iterable iterable0) {
        Map.Entry[] arr_map$Entry = (Map.Entry[])gggq.B(iterable0, ggfz.b);
        if(arr_map$Entry.length != 0) {
            int v = 1;
            if(arr_map$Entry.length != 1) {
                Object[] arr_object = new Object[arr_map$Entry.length];
                Object[] arr_object1 = new Object[arr_map$Entry.length];
                if(z) {
                    for(int v1 = 0; v1 < arr_map$Entry.length; ++v1) {
                        Map.Entry map$Entry0 = (Map.Entry)Objects.requireNonNull(arr_map$Entry[v1]);
                        Object object0 = map$Entry0.getKey();
                        Object object1 = map$Entry0.getValue();
                        ggag.a(object0, object1);
                        arr_object[v1] = object0;
                        arr_object1[v1] = object1;
                    }
                    return new ggfz(new ggnk(gged_interceptors.f(arr_object), comparator0), gged_interceptors.f(arr_object1));
                }
                ggfu ggfu0 = new ggfu(comparator0);
                Arrays.sort(arr_map$Entry, 0, arr_map$Entry.length, ggfu0);
                Map.Entry map$Entry1 = (Map.Entry)Objects.requireNonNull(arr_map$Entry[0]);
                Object object2 = map$Entry1.getKey();
                arr_object[0] = object2;
                Object object3 = map$Entry1.getValue();
                arr_object1[0] = object3;
                ggag.a(arr_object[0], object3);
                while(v < arr_map$Entry.length) {
                    Map.Entry map$Entry2 = (Map.Entry)Objects.requireNonNull(arr_map$Entry[v - 1]);
                    Map.Entry map$Entry3 = (Map.Entry)Objects.requireNonNull(arr_map$Entry[v]);
                    Object object4 = map$Entry3.getKey();
                    Object object5 = map$Entry3.getValue();
                    ggag.a(object4, object5);
                    arr_object[v] = object4;
                    arr_object1[v] = object5;
                    if(comparator0.compare(object2, object4) == 0) {
                        throw new IllegalArgumentException(a.Q(map$Entry3, map$Entry2, "Multiple entries with same key: ", " and "));
                    }
                    ++v;
                    object2 = object4;
                    continue;
                }
                return new ggfz(new ggnk(gged_interceptors.f(arr_object), comparator0), gged_interceptors.f(arr_object1));
            }
            Map.Entry map$Entry4 = (Map.Entry)Objects.requireNonNull(arr_map$Entry[0]);
            return ggfz.C(comparator0, map$Entry4.getKey(), map$Entry4.getValue());
        }
        return ggfz.z(comparator0);
    }

    public final ggfz B(Object object0, boolean z) {
        gftb.check(object0);
        return this.F(0, this.d.e(object0, z));
    }

    public static ggfz C(Comparator comparator0, Object object0, Object object1) {
        return new ggfz(new ggnk(gged_interceptors.l(object0), comparator0), gged_interceptors.l(object1));
    }

    public final ggfz D(Object object0, boolean z, Object object1, boolean z1) {
        gftb.check(object0);
        gftb.check(object1);
        gftb.m(this.comparator().compare(object0, object1) <= 0, "expected fromKey <= toKey but %s > %s", object0, object1);
        return this.B(object1, z1).E(object0, z);
    }

    public final ggfz E(Object object0, boolean z) {
        gftb.check(object0);
        return this.F(this.d.f(object0, z), this.size());
    }

    private final ggfz F(int v, int v1) {
        if(v == 0) {
            if(v1 != this.size()) {
                return 0 == v1 ? ggfz.z(this.comparator()) : new ggfz(this.d.g(0, v1), this.e.b(0, v1));
            }
            return this;
        }
        return v == v1 ? ggfz.z(this.comparator()) : new ggfz(this.d.g(v, v1), this.e.b(v, v1));
    }

    public static ggfz b(java.util.Map map0) {
        return ggfz.e(map0, ggfz.a);
    }

    @Override  // ggeo
    public final boolean c() {
        return this.d.oo() || this.e.oo();
    }

    @Override
    public final Map.Entry ceilingEntry(Object object0) {
        return this.E(object0, true).firstEntry();
    }

    @Override
    public final Object ceilingKey(Object object0) {
        return ggkm.g(this.ceilingEntry(object0));
    }

    @Override
    public final Comparator comparator() {
        return this.d.b;
    }

    @Override  // ggeo
    public final ggfp d() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.d.ok();
    }

    @Override
    public final NavigableMap descendingMap() {
        return this.y();
    }

    public static ggfz e(java.util.Map map0, Comparator comparator0) {
        boolean z = false;
        if((map0 instanceof SortedMap)) {
            Comparator comparator1 = ((SortedMap)map0).comparator();
            if(comparator1 != null) {
                z = comparator0.equals(comparator1);
            }
            else if(comparator0 == ggfz.a) {
                return !(map0 instanceof ggfz) || ((ggfz)map0).c() ? ggfz.A(comparator0, true, map0.entrySet()) : ((ggfz)map0);
            }
        }
        return !z || !(map0 instanceof ggfz) || ((ggfz)map0).c() ? ggfz.A(comparator0, z, map0.entrySet()) : ((ggfz)map0);
    }

    @Override  // ggeo
    public final Set entrySet() {
        return this.v();
    }

    @Override  // ggeo
    public final ggds f() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final Map.Entry firstEntry() {
        return this.isEmpty() ? null : ((Map.Entry)this.v().v().get(0));
    }

    @Override
    public final Object firstKey() {
        return this.d.first();
    }

    @Override
    public final Map.Entry floorEntry(Object object0) {
        return this.B(object0, true).lastEntry();
    }

    @Override
    public final Object floorKey(Object object0) {
        return ggkm.g(this.floorEntry(object0));
    }

    @Override  // ggeo
    public final ggds g() {
        return this.e;
    }

    @Override  // ggeo
    public final Object get(Object object0) {
        ggnk ggnk0 = this.d;
        if(object0 != null) {
            try {
                int v = Collections.binarySearch(ggnk0.d, object0, ggnk0.b);
                if(v >= 0) {
                    return v == -1 ? null : this.e.get(v);
                }
            }
            catch(ClassCastException unused_ex) {
            }
            return null;
        }
        return null;
    }

    @Override
    public final NavigableMap headMap(Object object0, boolean z) {
        return this.B(object0, z);
    }

    @Override
    public final SortedMap headMap(Object object0) {
        return this.B(object0, false);
    }

    @Override
    public final Map.Entry higherEntry(Object object0) {
        return this.E(object0, false).firstEntry();
    }

    @Override
    public final Object higherKey(Object object0) {
        return ggkm.g(this.higherEntry(object0));
    }

    @Override  // ggeo
    public final Set keySet() {
        return this.d;
    }

    @Override
    public final Map.Entry lastEntry() {
        return this.isEmpty() ? null : ((Map.Entry)this.v().v().get(this.size() - 1));
    }

    @Override
    public final Object lastKey() {
        return this.d.last();
    }

    @Override
    public final Map.Entry lowerEntry(Object object0) {
        return this.B(object0, false).lastEntry();
    }

    @Override
    public final Object lowerKey(Object object0) {
        return ggkm.g(this.lowerEntry(object0));
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return this.d;
    }

    @Override  // ggeo
    public final ggfp ou() {
        return this.isEmpty() ? ggnj.a : new ggfw(this);
    }

    @Override
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    public final int size() {
        return this.e.size();
    }

    @Override
    public final NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
        return this.D(object0, z, object1, z1);
    }

    @Override
    public final SortedMap subMap(Object object0, Object object1) {
        return this.D(object0, true, object1, false);
    }

    @Override
    public final NavigableMap tailMap(Object object0, boolean z) {
        return this.E(object0, z);
    }

    @Override
    public final SortedMap tailMap(Object object0) {
        return this.E(object0, true);
    }

    @Override  // ggeo
    public final Collection values() {
        return this.e;
    }

    @Override  // ggeo
    public final ggfp w() {
        return this.d;
    }

    @Override  // ggeo
    public Object writeReplace() {
        return new ggfy(this);
    }

    public final ggfz y() {
        ggfz ggfz0 = this.f;
        if(ggfz0 == null) {
            return this.isEmpty() ? ggfz.z(ggmo.g(this.comparator()).b()) : new ggfz(((ggnk)this.d.ok()), this.e.ot(), this);
        }
        return ggfz0;
    }

    static ggfz z(Comparator comparator0) {
        return ggmi.a.equals(comparator0) ? ggfz.c : new ggfz(gggc.W(comparator0), ggna.a);
    }
}

