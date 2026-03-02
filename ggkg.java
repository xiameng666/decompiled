import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

final class ggkg extends ggkh implements NavigableSet {
    public ggkg(NavigableMap navigableMap0) {
        super(navigableMap0);
    }

    final NavigableMap a() {
        return (NavigableMap)this.d;
    }

    @Override  // ggkh
    public final SortedMap b() {
        return this.a();
    }

    @Override  // ggkh
    public final Map c() {
        return this.a();
    }

    @Override
    public final Object ceiling(Object object0) {
        return this.a().ceilingKey(object0);
    }

    @Override
    public final Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return this.a().descendingKeySet();
    }

    @Override
    public final Object floor(Object object0) {
        return this.a().floorKey(object0);
    }

    @Override
    public final NavigableSet headSet(Object object0, boolean z) {
        return this.a().headMap(object0, z).navigableKeySet();
    }

    @Override  // ggkh
    public final SortedSet headSet(Object object0) {
        return this.headSet(object0, false);
    }

    @Override
    public final Object higher(Object object0) {
        return this.a().higherKey(object0);
    }

    @Override
    public final Object lower(Object object0) {
        return this.a().lowerKey(object0);
    }

    @Override
    public final Object pollFirst() {
        return ggkm.g(this.a().pollFirstEntry());
    }

    @Override
    public final Object pollLast() {
        return ggkm.g(this.a().pollLastEntry());
    }

    @Override
    public final NavigableSet subSet(Object object0, boolean z, Object object1, boolean z1) {
        return this.a().subMap(object0, z, object1, z1).navigableKeySet();
    }

    @Override  // ggkh
    public final SortedSet subSet(Object object0, Object object1) {
        return this.subSet(object0, true, object1, false);
    }

    @Override
    public final NavigableSet tailSet(Object object0, boolean z) {
        return this.a().tailMap(object0, z).navigableKeySet();
    }

    @Override  // ggkh
    public final SortedSet tailSet(Object object0) {
        return this.tailSet(object0, true);
    }
}

