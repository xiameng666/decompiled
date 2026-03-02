import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator;
import j..util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

final class bzz implements ibvi, Collection, java.util.Collection {
    public final bzk a;

    public bzz(bzk bzk0) {
        this.a = bzk0;
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
        return this.a.d(object0);
    }

    @Override
    public final boolean containsAll(java.util.Collection collection0) {
        ibuq.f(collection0, "elements");
        if(collection0.isEmpty()) {
            return true;
        }
        for(Object object0: collection0) {
            if(!this.a.d(object0)) {
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
        return this.a.e();
    }

    @Override
    public final Iterator iterator() {
        return ibxv.a(new bzy(this, null));
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
        return this.a.e;
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
        ibuq.f(arr_object, "array");
        return ibul.b(this, arr_object);
    }
}

