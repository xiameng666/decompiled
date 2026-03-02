import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

abstract class gfyt extends ggke implements NavigableMap {
    public abstract Iterator a();

    @Override
    public final Map.Entry ceilingEntry(Object object0) {
        return this.tailMap(object0, true).firstEntry();
    }

    @Override
    public final Object ceilingKey(Object object0) {
        return ggkm.g(this.ceilingEntry(object0));
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return new ggjz(this).navigableKeySet();
    }

    @Override
    public final NavigableMap descendingMap() {
        return new ggjz(this);
    }

    @Override
    public final Map.Entry firstEntry() {
        return (Map.Entry)gghd.i(this.b(), null);
    }

    @Override
    public final Object firstKey() {
        Map.Entry map$Entry0 = this.firstEntry();
        if(map$Entry0 != null) {
            return map$Entry0.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Map.Entry floorEntry(Object object0) {
        return this.headMap(object0, true).lastEntry();
    }

    @Override
    public final Object floorKey(Object object0) {
        return ggkm.g(this.floorEntry(object0));
    }

    @Override
    public final SortedMap headMap(Object object0) {
        return this.headMap(object0, false);
    }

    @Override
    public final Map.Entry higherEntry(Object object0) {
        return this.tailMap(object0, false).firstEntry();
    }

    @Override
    public final Object higherKey(Object object0) {
        return ggkm.g(this.higherEntry(object0));
    }

    @Override
    public final Set keySet() {
        return new ggkg(this);
    }

    @Override
    public final Map.Entry lastEntry() {
        return (Map.Entry)gghd.i(this.a(), null);
    }

    @Override
    public final Object lastKey() {
        Map.Entry map$Entry0 = this.lastEntry();
        if(map$Entry0 != null) {
            return map$Entry0.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final Map.Entry lowerEntry(Object object0) {
        return this.headMap(object0, false).lastEntry();
    }

    @Override
    public final Object lowerKey(Object object0) {
        return ggkm.g(this.lowerEntry(object0));
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return new ggkg(this);
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        return (Map.Entry)gghd.j(this.b());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return (Map.Entry)gghd.j(this.a());
    }

    @Override
    public final SortedMap subMap(Object object0, Object object1) {
        return this.subMap(object0, true, object1, false);
    }

    @Override
    public final SortedMap tailMap(Object object0) {
        return this.tailMap(object0, true);
    }
}

