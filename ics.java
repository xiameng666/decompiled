import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator;
import j..util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class ics implements ibvi, Collection, java.util.Collection {
    public final bzg a;

    public ics() {
        this(null);
    }

    public ics(byte[] arr_b) {
        bzg bzg0 = new bzg(6);
        super();
        this.a = bzg0;
    }

    public final boolean a(Object object0) {
        return this.a.f(object0);
    }

    @Override
    public final boolean add(Object object0) {
        return this.a(object0);
    }

    @Override
    public final boolean addAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        this.a.d();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a.a(object0);
    }

    @Override
    public final boolean containsAll(java.util.Collection collection0) {
        for(Object object0: collection0) {
            if(!this.a.a(object0)) {
                return false;
            }
        }
        return true;
    }

    @Override  // j$.util.Collection
    public final void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.b();
    }

    @Override
    public final Iterator iterator() {
        return new byt(new byu(this.a));
    }

    @Override  // j$.util.Collection
    public final Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public final boolean remove(Object object0) {
        return this.a.g(object0);
    }

    @Override
    public final boolean removeAll(java.util.Collection collection0) {
        return this.a.g(collection0);
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(java.util.Collection collection0) {
        return this.a.h(collection0);
    }

    @Override
    public final int size() {
        return this.a.g;
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
}

