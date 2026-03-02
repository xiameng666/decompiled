import java.util.Iterator;
import java.util.NavigableSet;

final class ggbt extends gggc {
    private final gggc a;

    public ggbt(gggc gggc0) {
        super(ggmo.g(gggc0.b).b());
        this.a = gggc0;
    }

    @Override  // gggc
    public final Object ceiling(Object object0) {
        return this.a.floor(object0);
    }

    @Override  // ggds
    public final boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override  // gggc
    public final Iterator descendingIterator() {
        return this.ol();
    }

    @Override  // gggc
    public final NavigableSet descendingSet() {
        return this.a;
    }

    @Override  // gggc
    public final Object floor(Object object0) {
        return this.a.ceiling(object0);
    }

    @Override  // gggc
    public final Object higher(Object object0) {
        return this.a.lower(object0);
    }

    @Override  // gggc
    public final Iterator iterator() {
        return this.om();
    }

    @Override  // gggc
    public final gggc k() {
        throw new AssertionError("should never be called");
    }

    @Override  // gggc
    public final Object lower(Object object0) {
        return this.a.higher(object0);
    }

    @Override  // gggc
    public final gggc n(Object object0, boolean z) {
        return this.a.s(object0, z).ok();
    }

    @Override  // gggc
    public final gggc ok() {
        return this.a;
    }

    @Override  // gggc
    public final ggqj ol() {
        return this.a.om();
    }

    @Override  // gggc
    public final ggqj om() {
        return this.a.ol();
    }

    @Override  // ggds
    public final boolean oo() {
        return this.a.oo();
    }

    @Override  // gggc
    public final gggc q(Object object0, boolean z, Object object1, boolean z1) {
        return this.a.p(object1, z1, object0, z).ok();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override  // gggc
    public final gggc t(Object object0, boolean z) {
        return this.a.m(object0, z).ok();
    }

    @Override  // gggc
    public Object writeReplace() {
        return super.writeReplace();
    }
}

