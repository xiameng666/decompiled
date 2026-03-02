import j..util.Objects;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public abstract class ggbg extends gggc {
    final ggbv a;

    public ggbg(ggbv ggbv0) {
        super(ggmi.a);
        this.a = ggbv0;
    }

    public static ggbg a(TimeRange ggmr0, ggbv ggbv0) {
        TimeRange ggmr1;
        gftb.check(ggmr0);
        gftb.check(ggbv0);
        try {
            ggmr1 = ggmr0.u() ? ggmr0 : ggmr0.k(TimeRange.e(((ggbu)ggbv0).d()));
            if(!ggmr0.v()) {
                ggmr1 = ggmr1.k(TimeRange.f(((ggbu)ggbv0).c()));
            }
        }
        catch(NoSuchElementException noSuchElementException0) {
            throw new IllegalArgumentException(noSuchElementException0);
        }
        return !ggmr1.x() && TimeRange.b(((Comparable)Objects.requireNonNull(ggmr0.b.h(ggbv0))), ((Comparable)Objects.requireNonNull(ggmr0.c.g(ggbv0)))) <= 0 ? new ggmy(ggmr1, ggbv0) : new ggbx(ggbv0);
    }

    public final ggbg b(Comparable comparable0) {
        gftb.check(comparable0);
        return this.d(comparable0, false);
    }

    public final ggbg c(Comparable comparable0, boolean z) {
        gftb.check(comparable0);
        return this.d(comparable0, z);
    }

    public abstract ggbg d(Comparable arg1, boolean arg2);

    public final ggbg e(Comparable comparable0, Comparable comparable1) {
        gftb.check(comparable0);
        gftb.check(comparable1);
        gftb.checkTrue(this.b.compare(comparable0, comparable1) <= 0);
        return this.g(comparable0, true, comparable1, false);
    }

    public final ggbg f(Comparable comparable0, boolean z, Comparable comparable1, boolean z1) {
        gftb.check(comparable0);
        gftb.check(comparable1);
        gftb.checkTrue(this.b.compare(comparable0, comparable1) <= 0);
        return this.g(comparable0, z, comparable1, z1);
    }

    public abstract ggbg g(Comparable arg1, boolean arg2, Comparable arg3, boolean arg4);

    public final ggbg h(Comparable comparable0) {
        gftb.check(comparable0);
        return this.j(comparable0, true);
    }

    @Override  // gggc
    public final NavigableSet headSet(Object object0, boolean z) {
        return this.c(((Comparable)object0), z);
    }

    @Override  // gggc
    public final SortedSet headSet(Object object0) {
        return this.b(((Comparable)object0));
    }

    public final ggbg i(Comparable comparable0, boolean z) {
        gftb.check(comparable0);
        return this.j(comparable0, z);
    }

    public abstract ggbg j(Comparable arg1, boolean arg2);

    @Override  // gggc
    public gggc k() {
        return new ggbt(this);
    }

    @Override  // gggc
    public final gggc l(Object object0) {
        return this.b(((Comparable)object0));
    }

    @Override  // gggc
    public final gggc m(Object object0, boolean z) {
        return this.c(((Comparable)object0), z);
    }

    @Override  // gggc
    public gggc n(Object object0, boolean z) {
        throw null;
    }

    @Override  // gggc
    public final gggc o(Object object0, Object object1) {
        return this.e(((Comparable)object0), ((Comparable)object1));
    }

    @Override  // gggc
    public final gggc p(Object object0, boolean z, Object object1, boolean z1) {
        return this.f(((Comparable)object0), z, ((Comparable)object1), z1);
    }

    @Override  // gggc
    public gggc q(Object object0, boolean z, Object object1, boolean z1) {
        throw null;
    }

    @Override  // gggc
    public final gggc r(Object object0) {
        return this.h(((Comparable)object0));
    }

    @Override  // gggc
    public final gggc s(Object object0, boolean z) {
        return this.i(((Comparable)object0), z);
    }

    @Override  // gggc
    public final NavigableSet subSet(Object object0, boolean z, Object object1, boolean z1) {
        return this.f(((Comparable)object0), z, ((Comparable)object1), z1);
    }

    @Override  // gggc
    public final SortedSet subSet(Object object0, Object object1) {
        return this.e(((Comparable)object0), ((Comparable)object1));
    }

    @Override  // gggc
    public gggc t(Object object0, boolean z) {
        throw null;
    }

    @Override  // gggc
    public final NavigableSet tailSet(Object object0, boolean z) {
        return this.i(((Comparable)object0), z);
    }

    @Override  // gggc
    public final SortedSet tailSet(Object object0) {
        return this.h(((Comparable)object0));
    }

    @Override
    public String toString() {
        return this.u().toString();
    }

    public abstract TimeRange u();

    @Override  // gggc
    public Object writeReplace() {
        return super.writeReplace();
    }
}

