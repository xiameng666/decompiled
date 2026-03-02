import j..util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

public abstract class gggc extends ggfp implements ggoj, SortedSet, NavigableSet {
    final transient Comparator b;
    transient gggc c;
    private static final long serialVersionUID = 0xDECAFL;

    public gggc(Comparator comparator0) {
        this.b = comparator0;
    }

    final int Q(Object object0, Object object1) {
        return this.b.compare(object0, object1);
    }

    public static gggc R(Comparator comparator0, int v, Object[] arr_object) {
        if(v == 0) {
            return gggc.W(comparator0);
        }
        ggml.g(arr_object, v);
        Arrays.sort(arr_object, 0, v, comparator0);
        int v2 = 1;
        for(int v1 = 1; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(comparator0.compare(object0, arr_object[v2 - 1]) != 0) {
                arr_object[v2] = object0;
                ++v2;
            }
        }
        Arrays.fill(arr_object, v2, v, null);
        if(v2 < arr_object.length >> 1) {
            arr_object = Arrays.copyOf(arr_object, v2);
        }
        return new ggnk(gged_interceptors.g(arr_object, v2), comparator0);
    }

    public static gggc S(Collection collection0) {
        return gggc.T(ggmi.a, collection0);
    }

    public static gggc T(Comparator comparator0, Iterable iterable0) {
        if(ggok.a(comparator0, iterable0) && (iterable0 instanceof gggc) && !((gggc)iterable0).oo()) {
            return (gggc)iterable0;
        }
        Object[] arr_object = gggq.z(iterable0);
        return gggc.R(comparator0, arr_object.length, arr_object);
    }

    public static gggc U(Comparable comparable0) {
        return new ggnk(gged_interceptors.l(comparable0), ggmi.a);
    }

    public static gggc V(Comparable comparable0, Comparable comparable1) {
        return gggc.R(ggmi.a, 2, new Comparable[]{comparable0, comparable1});
    }

    static ggnk W(Comparator comparator0) {
        return ggmi.a.equals(comparator0) ? ggnk.a : new ggnk(ggna.a, comparator0);
    }

    @Deprecated
    public final void addFirst(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object ceiling(Object object0) {
        return gggq.o(this.s(object0, true), null);
    }

    @Override  // ggoj
    public final Comparator comparator() {
        return this.b;
    }

    @Override
    public Iterator descendingIterator() {
        return this.ol();
    }

    @Override
    public NavigableSet descendingSet() {
        return this.ok();
    }

    @Override
    public Object first() {
        return this.om().next();
    }

    @Override
    public Object floor(Object object0) {
        return gghd.i(this.m(object0, true).ol(), null);
    }

    public final Object getFirst() {
        return this.first();
    }

    public final Object getLast() {
        return this.last();
    }

    @Override
    public NavigableSet headSet(Object object0, boolean z) {
        return this.m(object0, z);
    }

    @Override
    public java.util.SortedSet headSet(Object object0) {
        return this.l(object0);
    }

    @Override
    public Object higher(Object object0) {
        return gggq.o(this.s(object0, false), null);
    }

    @Override  // ggfp
    public Iterator iterator() {
        return this.om();
    }

    public abstract gggc k();

    public gggc l(Object object0) {
        return this.m(object0, false);
    }

    @Override
    public Object last() {
        return this.ol().next();
    }

    @Override
    public Object lower(Object object0) {
        return gghd.i(this.m(object0, false).ol(), null);
    }

    public gggc m(Object object0, boolean z) {
        gftb.check(object0);
        return this.n(object0, z);
    }

    public abstract gggc n(Object arg1, boolean arg2);

    public gggc o(Object object0, Object object1) {
        return this.p(object0, true, object1, false);
    }

    public gggc ok() {
        gggc gggc0 = this.c;
        if(gggc0 == null) {
            gggc0 = this.k();
            this.c = gggc0;
            gggc0.c = this;
        }
        return gggc0;
    }

    public abstract ggqj ol();

    @Override  // ggfp
    public abstract ggqj om();

    public gggc p(Object object0, boolean z, Object object1, boolean z1) {
        gftb.check(object0);
        gftb.check(object1);
        gftb.checkTrue(this.b.compare(object0, object1) <= 0);
        return this.q(object0, z, object1, z1);
    }

    @Override
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract gggc q(Object arg1, boolean arg2, Object arg3, boolean arg4);

    public gggc r(Object object0) {
        return this.s(object0, true);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public gggc s(Object object0, boolean z) {
        gftb.check(object0);
        return this.t(object0, z);
    }

    @Override
    public NavigableSet subSet(Object object0, boolean z, Object object1, boolean z1) {
        return this.p(object0, z, object1, z1);
    }

    @Override
    public java.util.SortedSet subSet(Object object0, Object object1) {
        return this.o(object0, object1);
    }

    public abstract gggc t(Object arg1, boolean arg2);

    @Override
    public NavigableSet tailSet(Object object0, boolean z) {
        return this.s(object0, z);
    }

    @Override
    public java.util.SortedSet tailSet(Object object0) {
        return this.r(object0);
    }

    @Override  // ggfp
    public Object writeReplace() {
        Object[] arr_object = this.toArray();
        return new gggb(this.b, arr_object);
    }
}

