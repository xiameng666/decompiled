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

public final class ifb implements ibvi, List, java.util.List {
    public int a;
    public final bzd b;
    public final byb c;

    public ifb() {
        this.b = new bzd(16);
        this.c = new byb(16);
        this.a = -1;
    }

    public final int a() {
        return this.b.b;
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

    public final long b() {
        long v = ifc.b(Infinityf, false);
        int v1 = this.a + 1;
        int v2 = ibpo.d(this);
        if(v1 <= v2) {
            while(true) {
                byb byb0 = this.c;
                if(v1 < 0 || v1 >= byb0.b) {
                    cad.c("Index must be between 0 and size");
                }
                long v3 = byb0.a[v1];
                if(ieu.b(v3, v) < 0) {
                    v = v3;
                }
                if(ieu.a(v) < 0.0f && ieu.d(v) || v1 == v2) {
                    break;
                }
                ++v1;
            }
        }
        return v;
    }

    public final hfb c(int v) {
        Object object0 = this.b.c(v);
        ibuq.d(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (hfb)object0;
    }

    @Override
    public final void clear() {
        this.a = -1;
        this.b.k();
        this.c.b = 0;
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

    public final void d(int v, int v1) {
        if(v < v1) {
            this.b.l(v, v1);
            byb byb0 = this.c;
            if(v < 0 || (v > byb0.b || v1 < 0 || v1 > byb0.b)) {
                cad.c("Index must be between 0 and size");
            }
            if(v1 < v) {
                cad.a("The end index must be < start index");
            }
            if(v1 != v) {
                int v2 = byb0.b;
                if(v1 < v2) {
                    ibpg.ab(byb0.a, byb0.a, v, v1, v2);
                }
                byb0.b -= v1 - v;
            }
        }
    }

    public final boolean e(float f, boolean z) {
        return this.a == ibpo.d(this) ? true : ieu.b(this.b(), ifc.b(f, z)) > 0;
    }

    @Override  // j$.util.Collection
    public final void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    @Override
    public final Object get(int v) {
        return this.c(v);
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof hfb)) {
            return -1;
        }
        int v = ibpo.d(this);
        if(v >= 0) {
            int v1 = 0;
            while(!ibuq.m(this.b.c(v1), ((hfb)object0))) {
                if(v1 != v) {
                    ++v1;
                    continue;
                }
                return -1;
            }
            return v1;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override
    public final Iterator iterator() {
        return new iez(this, 0, 7);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        if(!(object0 instanceof hfb)) {
            return -1;
        }
        for(int v = ibpo.d(this); v >= 0; --v) {
            if(ibuq.m(this.b.c(v), ((hfb)object0))) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new iez(this, 0, 7);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new iez(this, v, 6);
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
        return new ifa(this, v, v1);
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

