import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class byq implements ibvl, List {
    private final bzd a;

    public byq(bzd bzd0) {
        this.a = bzd0;
    }

    @Override
    public final void add(int v, Object object0) {
        bzd bzd0 = this.a;
        if(v < 0 || v > bzd0.b) {
            bzd0.n(v);
        }
        int v1 = bzd0.b + 1;
        Object[] arr_object = bzd0.a;
        if(arr_object.length < v1) {
            bzd0.m(v1, arr_object);
        }
        Object[] arr_object1 = bzd0.a;
        int v2 = bzd0.b;
        if(v != v2) {
            ibpg.ac(arr_object1, arr_object1, v + 1, v, v2);
        }
        arr_object1[v] = object0;
        ++bzd0.b;
    }

    @Override
    public final boolean add(Object object0) {
        this.a.p(object0);
        return true;
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzd bzd0 = this.a;
        if(v < 0 || v > bzd0.b) {
            bzd0.n(v);
        }
        int v1 = 0;
        if(collection0.isEmpty()) {
            return false;
        }
        int v2 = bzd0.b + collection0.size();
        Object[] arr_object = bzd0.a;
        if(arr_object.length < v2) {
            bzd0.m(v2, arr_object);
        }
        Object[] arr_object1 = bzd0.a;
        if(v != bzd0.b) {
            ibpg.ac(arr_object1, arr_object1, collection0.size() + v, v, bzd0.b);
        }
        for(Object object0: collection0) {
            if(v1 < 0) {
                ibpo.m();
            }
            arr_object1[v1 + v] = object0;
            ++v1;
        }
        bzd0.b += collection0.size();
        return true;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzd bzd0 = this.a;
        int v = bzd0.b;
        ibuq.f(collection0, "elements");
        for(Object object0: collection0) {
            bzd0.p(object0);
        }
        return v != bzd0.b;
    }

    @Override
    public final void clear() {
        this.a.k();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a.e(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.a.e(object0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        bze.a(this, v);
        return this.a.c(v);
    }

    @Override
    public final int indexOf(Object object0) {
        return this.a.a(object0);
    }

    @Override
    public final boolean isEmpty() {
        return this.a.f();
    }

    @Override
    public final Iterator iterator() {
        return new byp(this, 0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        bzd bzd0 = this.a;
        if(object0 == null) {
            Object[] arr_object = bzd0.a;
            for(int v = bzd0.b - 1; v >= 0; --v) {
                if(arr_object[v] == null) {
                    return v;
                }
            }
            return -1;
        }
        Object[] arr_object1 = bzd0.a;
        int v1 = bzd0.b - 1;
        while(v1 >= 0) {
            if(!object0.equals(arr_object1[v1])) {
                --v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new byp(this, 0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new byp(this, v);
    }

    @Override
    public final Object remove(int v) {
        bze.a(this, v);
        return this.a.h(v);
    }

    @Override
    public final boolean remove(Object object0) {
        return this.a.o(object0);
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzd bzd0 = this.a;
        int v = bzd0.b;
        ibuq.f(collection0, "elements");
        for(Object object0: collection0) {
            bzd0.o(object0);
        }
        return v != bzd0.b;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        ibuq.f(collection0, "elements");
        bzd bzd0 = this.a;
        int v = bzd0.b;
        int v1 = v - 1;
        Object[] arr_object = bzd0.a;
        while(v1 >= 0) {
            if(!collection0.contains(arr_object[v1])) {
                bzd0.h(v1);
            }
            --v1;
        }
        return v != bzd0.b;
    }

    @Override
    public final Object set(int v, Object object0) {
        bze.a(this, v);
        return this.a.i(v, object0);
    }

    @Override
    public final int size() {
        return this.a.b;
    }

    @Override
    public final List subList(int v, int v1) {
        bze.b(this, v, v1);
        return new byr(this, v, v1);
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

