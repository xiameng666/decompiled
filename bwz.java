import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class bwz implements Set {
    final bxd a;

    public bwz(bxd bxd0) {
        this.a = bxd0;
        super();
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.a.a(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if((object0 instanceof Set)) {
            Set set0 = (Set)object0;
            try {
                return this.size() == set0.size() ? this.containsAll(set0) : false;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        bxd bxd0 = this.a;
        int v = bxd0.d_num - 1;
        int v1 = 0;
        while(v >= 0) {
            Object object0 = bxd0.f(v);
            v1 += (object0 == null ? 0 : object0.hashCode());
            --v;
        }
        return v1;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new bwy(this.a);
    }

    @Override
    public final boolean remove(Object object0) {
        bxd bxd0 = this.a;
        int v = bxd0.e(object0);
        if(v >= 0) {
            bxd0.g(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        return this.a.b(collection0);
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        return this.a.c(collection0);
    }

    @Override
    public final int size() {
        return this.a.d_num;
    }

    @Override
    public final Object[] toArray() {
        bxd bxd0 = this.a;
        int v = bxd0.d_num;
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = bxd0.f(v1);
        }
        return arr_object;
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        int v = this.size();
        if(arr_object.length < v) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.a.f(v1);
        }
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }
}

