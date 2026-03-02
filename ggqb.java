import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;

final class ggqb extends gfyt {
    public final TimeRange a;
    private final NavigableMap b;
    private final NavigableMap c;

    public ggqb(NavigableMap navigableMap0, TimeRange ggmr0) {
        this.b = navigableMap0;
        this.c = new ggqe(navigableMap0);
        this.a = ggmr0;
    }

    @Override  // gfyt
    public final Iterator a() {
        TimeRange ggmr0 = this.a;
        ggbl ggbl0 = ggmr0.v() ? ((ggbl)ggmr0.r()) : ggbh.a;
        gghb gghb0 = gghd.r(this.c.headMap(ggbl0, ggmr0.v() && ggmr0.d() == gfzd.b).descendingMap().values().iterator());
        if(gghb0.hasNext()) {
            if(((TimeRange)gghb0.a()).c == ggbh.a) {
                return new ggqa(this, ((ggbl)MoreObjects.firstNonNull(((TimeRange)gghb0.next()).b, ggbh.a)), gghb0);
            }
            ggbl ggbl1 = ((TimeRange)gghb0.a()).c;
            return new ggqa(this, ((ggbl)MoreObjects.firstNonNull(((ggbl)this.b.higherKey(ggbl1)), ggbh.a)), gghb0);
        }
        ggbj ggbj0 = ggbj.a;
        if(ggmr0.s(ggbj0)) {
            NavigableMap navigableMap0 = this.b;
            if(!navigableMap0.containsKey(ggbj0)) {
                return new ggqa(this, ((ggbl)MoreObjects.firstNonNull(((ggbl)navigableMap0.higherKey(ggbj0)), ggbh.a)), gghb0);
            }
        }
        return gggw.a;
    }

    @Override  // ggke
    public final Iterator b() {
        Collection collection0;
        TimeRange ggmr0 = this.a;
        if(ggmr0.u()) {
            ggbl ggbl0 = (ggbl)ggmr0.q();
            boolean z = ggmr0.c() == gfzd.b;
            collection0 = this.c.tailMap(ggbl0, z).values();
        }
        else {
            collection0 = this.c.values();
        }
        gghb gghb0 = gghd.r(collection0.iterator());
        ggbl ggbl1 = ggbj.a;
        if(!ggmr0.s(ggbl1) || gghb0.hasNext() && ((TimeRange)gghb0.a()).b == ggbl1) {
            return gghb0.hasNext() ? new ggpz(this, ((TimeRange)gghb0.next()).c, gghb0) : gggw.a;
        }
        return new ggpz(this, ggbl1, gghb0);
    }

    public final TimeRange c(Object object0) {
        if((object0 instanceof ggbl)) {
            try {
                Map.Entry map$Entry0 = this.d(((ggbl)object0), true).firstEntry();
                return map$Entry0 == null || !((ggbl)map$Entry0.getKey()).equals(((ggbl)object0)) ? null : ((TimeRange)map$Entry0.getValue());
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return null;
    }

    @Override
    public final Comparator comparator() {
        return ggmi.a;
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.c(object0) != null;
    }

    public final NavigableMap d(ggbl ggbl0, boolean z) {
        return this.e(TimeRange.i(ggbl0, gfzd.a(z)));
    }

    private final NavigableMap e(TimeRange ggmr0) {
        TimeRange ggmr1 = this.a;
        if(!ggmr1.w(ggmr0)) {
            return ggfz.c;
        }
        TimeRange ggmr2 = ggmr0.k(ggmr1);
        return new ggqb(this.b, ggmr2);
    }

    @Override
    public final Object get(Object object0) {
        return this.c(object0);
    }

    @Override
    public final NavigableMap headMap(Object object0, boolean z) {
        return this.e(TimeRange.p(((ggbl)object0), gfzd.a(z)));
    }

    @Override
    public final int size() {
        return gghd.c(this.b());
    }

    @Override
    public final NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
        return this.e(TimeRange.n(((ggbl)object0), gfzd.a(z), ((ggbl)object1), gfzd.a(z1)));
    }

    @Override
    public final NavigableMap tailMap(Object object0, boolean z) {
        return this.d(((ggbl)object0), z);
    }
}

