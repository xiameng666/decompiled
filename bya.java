import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class bya implements ibvi, Set {
    public final bzk a;

    public bya(bzk bzk0) {
        this.a = bzk0;
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a.c(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        if(collection0.isEmpty()) {
            return true;
        }
        for(Object object0: collection0) {
            if(!this.a.c(object0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.e();
    }

    @Override
    public final Iterator iterator() {
        return ibxv.a(new bxz(this, null));
    }

    @Override
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.a.e;
    }

    @Override
    public final Object[] toArray() {
        return ibul.a(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        ibuq.f(arr_object, "array");
        return ibul.b(this, arr_object);
    }
}

