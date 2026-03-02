import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class ggbx extends ggbg {
    public ggbx(ggbv ggbv0) {
        super(ggbv0);
    }

    @Override  // ggds
    public final boolean contains(Object object0) {
        return false;
    }

    @Override  // ggbg
    public final ggbg d(Comparable comparable0, boolean z) {
        return this;
    }

    @Override  // gggc
    public final Iterator descendingIterator() {
        return gggw.a;
    }

    @Override  // ggfp
    public final boolean equals(Object object0) {
        return (object0 instanceof Set) ? ((Set)object0).isEmpty() : false;
    }

    @Override  // gggc
    public final Object first() {
        throw new NoSuchElementException();
    }

    @Override  // ggbg
    public final ggbg g(Comparable comparable0, boolean z, Comparable comparable1, boolean z1) {
        return this;
    }

    @Override  // ggfp
    public final int hashCode() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override  // gggc
    public final Iterator iterator() {
        return gggw.a;
    }

    @Override  // ggbg
    public final ggbg j(Comparable comparable0, boolean z) {
        return this;
    }

    @Override  // ggbg
    public final gggc k() {
        return gggc.W(ggno.a);
    }

    @Override  // gggc
    public final Object last() {
        throw new NoSuchElementException();
    }

    @Override  // ggbg
    public final gggc n(Object object0, boolean z) {
        Comparable comparable0 = (Comparable)object0;
        return this;
    }

    @Override  // gggc
    public final ggqj ol() {
        return gggw.a;
    }

    @Override  // gggc
    public final ggqj om() {
        return gggw.a;
    }

    @Override  // ggds
    public final boolean oo() {
        return false;
    }

    @Override  // ggbg
    public final gggc q(Object object0, boolean z, Object object1, boolean z1) {
        Comparable comparable0 = (Comparable)object0;
        Comparable comparable1 = (Comparable)object1;
        return this;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    public final int size() {
        return 0;
    }

    @Override  // ggbg
    public final gggc t(Object object0, boolean z) {
        Comparable comparable0 = (Comparable)object0;
        return this;
    }

    @Override  // ggbg
    public final String toString() {
        return "[]";
    }

    @Override  // ggbg
    public final TimeRange u() {
        throw new NoSuchElementException();
    }

    @Override  // ggfp
    public final gged_interceptors v() {
        return ggna.a;
    }

    @Override  // ggfp
    public final boolean w() {
        return true;
    }

    @Override  // ggbg
    public Object writeReplace() {
        return new ggbw(this.a);
    }
}

