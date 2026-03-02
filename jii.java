import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator;
import j..util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class jii implements ibvi, Collection, java.util.Collection {
    public static final jii a;
    public final List b;
    private final int c;

    static {
        jii.a = new jii(ibps.a);
    }

    public jii(List list0) {
        this.b = list0;
        this.c = list0.size();
    }

    public final jig a() {
        return (jig)this.b.get(0);
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return (object0 instanceof jig) ? this.b.contains(((jig)object0)) : false;
    }

    @Override
    public final boolean containsAll(java.util.Collection collection0) {
        return this.b.containsAll(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jii) ? ibuq.m(this.b, ((jii)object0).b) : false;
    }

    @Override  // j$.util.Collection
    public final void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.b.iterator();
    }

    @Override  // j$.util.Collection
    public final Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override  // j$.util.Collection
    public final Spliterator spliterator() {
        return Collection.-CC.$default$spliterator(this);
    }

    @Override  // j$.util.Collection
    public final Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public final Object[] toArray() {
        return ibul.a(this);
    }

    @Override  // j$.util.Collection
    public final Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return ibul.b(this, arr_object);
    }

    @Override
    public final String toString() {
        return "LocaleList(localeList=" + this.b + ')';
    }
}

