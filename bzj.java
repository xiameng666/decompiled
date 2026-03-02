import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class bzj implements ibvi, Set {
    public final bzg b;

    public bzj(bzg bzg0) {
        this.b = bzg0;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return this.b.a(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.b.a(object0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : ibuq.m(this.b, ((bzj)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.b.b();
    }

    @Override
    public Iterator iterator() {
        return ibxv.a(new bzi(this, null));
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.b.g;
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

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

