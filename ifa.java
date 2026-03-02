import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.List.-CC;
import j..util.List;
import j..util.Spliterator;
import j..util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

final class ifa implements ibvi, List, java.util.List {
    final ifb a;
    private final int b;
    private final int c;

    public ifa(ifb ifb0, int v, int v1) {
        this.a = ifb0;
        super();
        this.b = v;
        this.c = v1;
    }

    public final int a() {
        return this.c - this.b;
    }

    @Override
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object object0) {
        return (object0 instanceof hfb) ? this.indexOf(((hfb)object0)) != -1 : false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(((hfb)object0))) {
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
    public final Object get(int v) {
        Object object0 = this.a.b.c(v + this.b);
        ibuq.d(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (hfb)object0;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof hfb)) {
            return -1;
        }
        int v = this.b;
        int v1 = this.c;
        if(v <= v1) {
            for(int v2 = v; true; ++v2) {
                if(ibuq.m(this.a.b.c(v2), ((hfb)object0))) {
                    return v2 - v;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.a() == 0;
    }

    @Override
    public final Iterator iterator() {
        return new iez(this.a, this.b, this.b, this.c);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(!(object0 instanceof hfb)) {
            return -1;
        }
        int v = this.c;
        int v1 = this.b;
        if(v1 <= v) {
            while(true) {
                if(ibuq.m(this.a.b.c(v), ((hfb)object0))) {
                    return v - v1;
                }
                if(v == v1) {
                    break;
                }
                --v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new iez(this.a, this.b, this.b, this.c);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new iez(this.a, v + this.b, this.b, this.c);
    }

    @Override  // j$.util.Collection
    public final Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public final Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        return Collection.-CC.$default$removeIf(this, predicate0);
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.a();
    }

    @Override  // j$.util.List
    public final void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override  // j$.util.List
    public final Spliterator spliterator() {
        return List.-CC.$default$spliterator(this);
    }

    @Override  // j$.util.Collection
    public final Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public final java.util.List subList(int v, int v1) {
        return new ifa(this.a, v + this.b, this.b + v1);
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

