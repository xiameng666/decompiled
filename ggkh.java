import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

class ggkh extends ggkf implements SortedSet {
    public ggkh(SortedMap sortedMap0) {
        super(sortedMap0);
    }

    public SortedMap b() {
        return (SortedMap)this.d;
    }

    @Override  // ggkf
    public Map c() {
        return this.b();
    }

    @Override
    public final Comparator comparator() {
        return this.b().comparator();
    }

    @Override
    public final Object first() {
        return this.b().firstKey();
    }

    @Override
    public SortedSet headSet(Object object0) {
        return new ggkh(this.b().headMap(object0));
    }

    @Override
    public final Object last() {
        return this.b().lastKey();
    }

    @Override
    public SortedSet subSet(Object object0, Object object1) {
        return new ggkh(this.b().subMap(object0, object1));
    }

    @Override
    public SortedSet tailSet(Object object0) {
        return new ggkh(this.b().tailMap(object0));
    }
}

