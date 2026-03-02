import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;

final class ggmy extends ggbg {
    private final TimeRange d;
    private static final long serialVersionUID;

    public ggmy(TimeRange ggmr0, ggbv ggbv0) {
        super(ggbv0);
        this.d = ggmr0;
    }

    @Override  // ggfp
    public final gged_interceptors C() {
        return new ggmw(this);
    }

    public final Comparable X() {
        return (Comparable)Objects.requireNonNull(this.d.b.h(this.a));
    }

    public final Comparable Y() {
        return (Comparable)Objects.requireNonNull(this.d.c.g(this.a));
    }

    public static boolean Z(Comparable comparable0, Comparable comparable1) {
        return comparable1 != null && TimeRange.b(comparable0, comparable1) == 0;
    }

    private final ggbg aa(TimeRange ggmr0) {
        TimeRange ggmr1 = this.d;
        return ggmr1.w(ggmr0) ? ggbg.a(ggmr1.k(ggmr0), this.a) : new ggbx(this.a);
    }

    @Override  // ggds
    public final boolean contains(Object object0) {
        if(object0 == null) {
            return false;
        }
        try {
            return this.d.s(((Comparable)object0));
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return ggam.b(this, collection0);
    }

    @Override  // ggbg
    public final ggbg d(Comparable comparable0, boolean z) {
        return this.aa(TimeRange.p(comparable0, gfzd.a(z)));
    }

    @Override  // gggc
    public final Iterator descendingIterator() {
        return this.ol();
    }

    @Override  // ggfp
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof ggmy) || !this.a.equals(((ggmy)object0).a) ? super.equals(object0) : this.X().equals(((ggmy)object0).X()) && this.Y().equals(((ggmy)object0).Y());
    }

    @Override  // gggc
    public final Object first() {
        return this.X();
    }

    @Override  // ggbg
    public final ggbg g(Comparable comparable0, boolean z, Comparable comparable1, boolean z1) {
        return comparable0.compareTo(comparable1) == 0 && !z && !z1 ? new ggbx(this.a) : this.aa(TimeRange.n(comparable0, gfzd.a(z), comparable1, gfzd.a(z1)));
    }

    @Override  // ggfp
    public final int hashCode() {
        return ggog.a(this);
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override  // gggc
    public final Iterator iterator() {
        return this.om();
    }

    @Override  // ggbg
    public final ggbg j(Comparable comparable0, boolean z) {
        return this.aa(TimeRange.i(comparable0, gfzd.a(z)));
    }

    @Override  // gggc
    public final Object last() {
        return this.Y();
    }

    @Override  // ggbg
    public final gggc n(Object object0, boolean z) {
        return this.d(((Comparable)object0), z);
    }

    @Override  // gggc
    public final ggqj ol() {
        return new ggmv(this, this.Y());
    }

    @Override  // gggc
    public final ggqj om() {
        return new ggmu(this, this.X());
    }

    @Override  // ggds
    public final boolean oo() {
        return false;
    }

    @Override  // ggbg
    public final gggc q(Object object0, boolean z, Object object1, boolean z1) {
        return this.g(((Comparable)object0), z, ((Comparable)object1), z1);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    public final int size() {
        Comparable comparable0 = this.X();
        long v = ((long)(((int)(((Integer)this.Y()))))) - ((long)(((int)(((Integer)comparable0)))));
        return v < 0x7FFFFFFFL ? ((int)v) + 1 : 0x7FFFFFFF;
    }

    @Override  // ggbg
    public final gggc t(Object object0, boolean z) {
        return this.j(((Comparable)object0), z);
    }

    @Override  // ggbg
    public final TimeRange u() {
        ggbv ggbv0 = this.a;
        return new TimeRange(this.d.b.d(gfzd.b, ggbv0), this.d.c.e(gfzd.b, ggbv0));
    }

    @Override  // ggbg
    public Object writeReplace() {
        return new ggmx(this.d, this.a);
    }
}

