import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class ryq implements ibvi, Set, rof {
    private final Set a;
    private final rof b;

    public ryq(rof rof0, Set set0, Set set1) {
        ibuq.f(set0, "activities");
        ibuq.f(set1, "tasks");
        ryr[] arr_ryr = new ryr[2];
        ibuq.f(set0, "activities");
        ibuq.f(set1, "tasks");
        arr_ryr[0] = new rtt(rof0, ibpo.ak(new ArrayList(ibpo.q(set0, 10)), new ArrayList(ibpo.q(set1, 10))));
        arr_ryr[1] = new ryn(rof0, set0, set1);
        Set set2 = ibqg.c(arr_ryr);
        super();
        this.a = set2;
        this.b = rof0;
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
        if(!(object0 instanceof ryr)) {
            return false;
        }
        ibuq.f(((ryr)object0), "element");
        return this.a.contains(((ryr)object0));
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        return this.a.containsAll(collection0);
    }

    @Override  // rof
    public final String fa() {
        return ((roe)this.b).a;
    }

    @Override  // rof
    public final roe fi() {
        throw null;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override  // rof
    public final String l() {
        throw null;
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
        return this.a.size();
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

