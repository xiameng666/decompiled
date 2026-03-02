import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

final class bxb implements Collection {
    final bxd a;

    public bxb(bxd bxd0) {
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
        return this.a.d(object0) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new bxc(this.a);
    }

    @Override
    public final boolean remove(Object object0) {
        bxd bxd0 = this.a;
        int v = bxd0.d(object0);
        if(v >= 0) {
            bxd0.g(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        bxd bxd0 = this.a;
        int v = bxd0.d_num;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(collection0.contains(bxd0.i(v1))) {
                bxd0.g(v1);
                --v;
                --v1;
                z = true;
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        bxd bxd0 = this.a;
        int v = bxd0.d_num;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!collection0.contains(bxd0.i(v1))) {
                bxd0.g(v1);
                --v;
                --v1;
                z = true;
            }
        }
        return z;
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
            arr_object[v1] = bxd0.i(v1);
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
            arr_object[v1] = this.a.i(v1);
        }
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }
}

