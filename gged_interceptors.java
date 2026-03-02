import j..util.List.-CC;
import j..util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public abstract class gged_interceptors extends ggds implements List, java.util.List, RandomAccess {
    private static final ggqk a = null;
    public static final int d = 0;
    private static final long serialVersionUID = 0xFFFFFFFFCAFEBABEL;

    static {
        gged_interceptors.a = new ggdz(ggna.a, 0);
    }

    @SafeVarargs
    public static gged_interceptors B(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object[] arr_object) {
        Object[] arr_object1 = new Object[arr_object.length + 12];
        arr_object1[0] = object0;
        arr_object1[1] = object1;
        arr_object1[2] = object2;
        arr_object1[3] = object3;
        arr_object1[4] = object4;
        arr_object1[5] = object5;
        arr_object1[6] = object6;
        arr_object1[7] = object7;
        arr_object1[8] = object8;
        arr_object1[9] = object9;
        arr_object1[10] = object10;
        arr_object1[11] = object11;
        System.arraycopy(arr_object, 0, arr_object1, 12, arr_object.length);
        return gged_interceptors.G(arr_object1);
    }

    public static gged_interceptors C(Iterable iterable0) {
        Comparable[] arr_comparable = (Comparable[])gggq.B(iterable0, new Comparable[0]);
        ggml.f(arr_comparable);
        Arrays.sort(arr_comparable);
        return gged_interceptors.f(arr_comparable);
    }

    public static gged_interceptors D(Comparator comparator0, Iterable iterable0) {
        gftb.check(comparator0);
        Object[] arr_object = gggq.z(iterable0);
        ggml.f(arr_object);
        Arrays.sort(arr_object, comparator0);
        return gged_interceptors.f(arr_object);
    }

    public final ggqk E() {
        return this.F(0);
    }

    public final ggqk F(int v) {
        gftb.D(v, this.size());
        return this.isEmpty() ? gged_interceptors.a : new ggdz(this, v);
    }

    private static gged_interceptors G(Object[] arr_object) {
        ggml.f(arr_object);
        return gged_interceptors.f(arr_object);
    }

    @Override
    @Deprecated
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    public gged_interceptors b(int v, int v1) {
        gftb.p(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? ggna.a : new ggec(this, v, v2);
    }

    @Override  // ggds
    public boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    public static ggdy e(int v) {
        ggag.c(v, "expectedSize");
        return new ggdy(v);
    }

    @Override
    public final boolean equals(Object object0) {
        return ggia.i(this, object0);
    }

    static gged_interceptors f(Object[] arr_object) {
        return gged_interceptors.g(arr_object, arr_object.length);
    }

    static gged_interceptors g(Object[] arr_object, int v) {
        return v == 0 ? ggna.a : new ggna(arr_object, v);
    }

    public static gged_interceptors h(Iterable iterable0) {
        gftb.check(iterable0);
        return (iterable0 instanceof Collection) ? gged_interceptors.i(((Collection)iterable0)) : gged_interceptors.j(iterable0.iterator());
    }

    @Override
    public final int hashCode() {
        int v = this.size();
        int v2 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 * 0x1F + this.get(v1).hashCode();
        }
        return v2;
    }

    public static gged_interceptors i(Collection collection0) {
        if((collection0 instanceof ggds)) {
            gged_interceptors gged0 = ((ggds)collection0).v();
            return gged0.oo() ? gged_interceptors.f(gged0.toArray()) : gged0;
        }
        return gged_interceptors.G(collection0.toArray());
    }

    @Override
    public int indexOf(Object object0) {
        if(object0 == null) {
            return -1;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(object0.equals(this.get(v1))) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // ggds
    public final Iterator iterator() {
        return this.E();
    }

    public static gged_interceptors j(Iterator iterator0) {
        if(!iterator0.hasNext()) {
            return ggna.a;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return gged_interceptors.l(object0);
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.i(object0);
        ggdy0.l(iterator0);
        return ggdy0.h();
    }

    public static gged_interceptors k(Object[] arr_object) {
        return arr_object.length == 0 ? ggna.a : gged_interceptors.G(((Object[])arr_object.clone()));
    }

    public static gged_interceptors l(Object object0) {
        return gged_interceptors.G(new Object[]{object0});
    }

    @Override
    public int lastIndexOf(Object object0) {
        if(object0 == null) {
            return -1;
        }
        for(int v = this.size() - 1; v >= 0; --v) {
            if(object0.equals(this.get(v))) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return this.E();
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.F(v);
    }

    public static gged_interceptors m(Object object0, Object object1) {
        return gged_interceptors.G(new Object[]{object0, object1});
    }

    public static gged_interceptors n(Object object0, Object object1, Object object2) {
        return gged_interceptors.G(new Object[]{object0, object1, object2});
    }

    public static gged_interceptors o(Object object0, Object object1, Object object2, Object object3) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3});
    }

    @Override  // ggds
    public final ggqj om() {
        return this.E();
    }

    public gged_interceptors ot() {
        return this.size() <= 1 ? this : new ggea(this);
    }

    public static gged_interceptors p(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3, object4});
    }

    public static gged_interceptors q(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3, object4, object5});
    }

    public static gged_interceptors r(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3, object4, object5, object6});
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    @Deprecated
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator0) {
        List.-CC.$default$replaceAll(this, unaryOperator0);
    }

    public static gged_interceptors s(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7});
    }

    @Override
    @Deprecated
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.List
    public final void sort(Comparator comparator0) {
        List.-CC.$default$sort(this, comparator0);
    }

    @Override
    public java.util.List subList(int v, int v1) {
        return this.b(v, v1);
    }

    public static gged_interceptors t(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8});
    }

    public static gged_interceptors u(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9});
    }

    @Override  // ggds
    @Deprecated
    public final gged_interceptors v() {
        return this;
    }

    public static gged_interceptors w(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return gged_interceptors.G(new Object[]{object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10});
    }

    @Override  // ggds
    public Object writeReplace() {
        return new ggeb(this.toArray());
    }

    @Override  // ggds
    public int x(Object[] arr_object, int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v + v2] = this.get(v2);
        }
        return v + v1;
    }
}

