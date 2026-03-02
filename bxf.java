import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class bxf implements ibvj, ibvo, Collection, Set {
    public int[] a;
    public Object[] b;
    public int c;

    public bxf() {
        this(null);
    }

    public bxf(int v) {
        this.a = caa.a;
        this.b = caa.c;
        if(v > 0) {
            bxg.d(this, v);
        }
    }

    public bxf(bxf bxf0) {
        this(0);
        if(bxf0 != null) {
            this.c(bxf0);
        }
    }

    public bxf(Collection collection0) {
        this(0);
        if(collection0 != null) {
            this.addAll(collection0);
        }
    }

    public bxf(byte[] arr_b) {
        this(0);
    }

    public final int a(Object object0) {
        return object0 == null ? bxg.c(this) : bxg.b(this, object0, object0.hashCode());
    }

    @Override
    public final boolean add(Object object0) {
        int v2;
        int v1;
        int v = this.c;
        if(object0 == null) {
            v1 = bxg.c(this);
            v2 = 0;
        }
        else {
            int v3 = object0.hashCode();
            v2 = v3;
            v1 = bxg.b(this, object0, v3);
        }
        if(v1 >= 0) {
            return false;
        }
        int v4 = 8;
        int[] arr_v = this.a;
        if(v >= arr_v.length) {
            if(v >= 8) {
                v4 = (v >> 1) + v;
            }
            else if(v < 4) {
                v4 = 4;
            }
            Object[] arr_object = this.b;
            bxg.d(this, v4);
            if(v != this.c) {
                throw new ConcurrentModificationException();
            }
            int[] arr_v1 = this.a;
            if(arr_v1.length != 0) {
                ibpg.af(arr_v, arr_v1, 0, arr_v.length, 6);
                ibpg.aq(arr_object, this.b, 0, arr_object.length, 6);
            }
        }
        if(~v1 < v) {
            ibpg.aa(this.a, this.a, -v1, ~v1, v);
            ibpg.ac(this.b, this.b, -v1, ~v1, v);
        }
        int v5 = this.c;
        if(v == v5) {
            int[] arr_v2 = this.a;
            if(~v1 < arr_v2.length) {
                arr_v2[~v1] = v2;
                this.b[~v1] = object0;
                this.c = v5 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        this.d(this.c + collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            v |= this.add(object0);
        }
        return v != 0;
    }

    public final Object b(int v) {
        return this.b[v];
    }

    public final void c(bxf bxf0) {
        ibuq.f(bxf0, "array");
        int v = bxf0.c;
        this.d(this.c + v);
        if(this.c != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.add(bxf0.b(v1));
            }
        }
        else if(v > 0) {
            ibpg.af(bxf0.a, this.a, 0, v, 6);
            ibpg.aq(bxf0.b, this.b, 0, v, 6);
            if(this.c != 0) {
                throw new ConcurrentModificationException();
            }
            this.c = v;
        }
    }

    @Override
    public final void clear() {
        if(this.c != 0) {
            this.a = caa.a;
            this.b = caa.c;
            this.c = 0;
        }
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a(object0) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
        }
        return true;
    }

    public final void d(int v) {
        int v1 = this.c;
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            Object[] arr_object = this.b;
            bxg.d(this, v);
            int v2 = this.c;
            if(v2 > 0) {
                ibpg.af(arr_v, this.a, 0, v2, 6);
                ibpg.aq(arr_object, this.b, 0, this.c, 6);
            }
        }
        if(this.c == v1) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void e(int v) {
        int v1 = this.c;
        Object[] arr_object = this.b;
        Object object0 = arr_object[v];
        if(v1 <= 1) {
            this.clear();
            return;
        }
        int[] arr_v = this.a;
        int v2 = 8;
        if(arr_v.length > 8 && v1 < arr_v.length / 3) {
            if(v1 > 8) {
                v2 = v1 + (v1 >> 1);
            }
            bxg.d(this, v2);
            if(v > 0) {
                ibpg.af(arr_v, this.a, 0, v, 6);
                ibpg.aq(arr_object, this.b, 0, v, 6);
            }
            if(v < v1 - 1) {
                ibpg.aa(arr_v, this.a, v, v + 1, v1);
                ibpg.ac(arr_object, this.b, v, v + 1, v1);
            }
        }
        else {
            if(v < v1 - 1) {
                ibpg.aa(arr_v, arr_v, v, v + 1, v1);
                ibpg.ac(this.b, this.b, v, v + 1, v1);
            }
            this.b[v1 - 1] = null;
        }
        if(v1 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = v1 - 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if((object0 instanceof Set)) {
            if(this.c != ((Set)object0).size()) {
                return false;
            }
            try {
                int v = this.c;
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= v) {
                        return true;
                    }
                    if(!((Set)object0).contains(this.b(v1))) {
                        break;
                    }
                }
                return false;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.a;
        int v = this.c;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    @Override
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override
    public final Iterator iterator() {
        return new bxe(this);
    }

    @Override
    public final boolean remove(Object object0) {
        int v = this.a(object0);
        if(v >= 0) {
            this.e(v);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        int v = 0;
        for(Object object0: collection0) {
            v |= this.remove(object0);
        }
        return v != 0;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        ibuq.f(collection0, "elements");
        int v = this.c - 1;
        boolean z = false;
        while(v >= 0) {
            if(!ibpo.aB(collection0, this.b[v])) {
                this.e(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final Object[] toArray() {
        return ibpg.q(this.b, 0, this.c);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        ibuq.f(arr_object, "array");
        int v = this.c;
        if(arr_object.length < v) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        ibpg.ac(this.b, arr_object, 0, 0, this.c);
        return arr_object;
    }

    @Override
    public final String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.c * 14);
        stringBuilder0.append('{');
        int v = this.c;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.b(v1);
            if(object0 == this) {
                stringBuilder0.append("(this Set)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

