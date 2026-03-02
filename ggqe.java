import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;

final class ggqe extends gfyt {
    public final TimeRange a;
    private final NavigableMap b;

    public ggqe(NavigableMap navigableMap0) {
        this.b = navigableMap0;
        this.a = TimeRange.a;
    }

    private ggqe(NavigableMap navigableMap0, TimeRange ggmr0) {
        this.b = navigableMap0;
        this.a = ggmr0;
    }

    @Override  // gfyt
    public final Iterator a() {
        Collection collection0;
        TimeRange ggmr0 = this.a;
        if(ggmr0.v()) {
            ggbl ggbl0 = (ggbl)ggmr0.r();
            collection0 = this.b.headMap(ggbl0, false).descendingMap().values();
        }
        else {
            collection0 = this.b.descendingMap().values();
        }
        gghb gghb0 = gghd.r(collection0.iterator());
        if(gghb0.hasNext()) {
            ggbl ggbl1 = ((TimeRange)gghb0.a()).c;
            if(ggmr0.c.k(ggbl1)) {
                gghb0.next();
            }
        }
        return new ggqd(this, gghb0);
    }

    @Override  // ggke
    public final Iterator b() {
        TimeRange ggmr0 = this.a;
        if(!ggmr0.u()) {
            return new ggqc(this, this.b.values().iterator());
        }
        NavigableMap navigableMap0 = this.b;
        Map.Entry map$Entry0 = navigableMap0.lowerEntry(((ggbl)ggmr0.q()));
        if(map$Entry0 == null) {
            return new ggqc(this, navigableMap0.values().iterator());
        }
        ggbl ggbl0 = ((TimeRange)map$Entry0.getValue()).c;
        return ggmr0.b.k(ggbl0) ? new ggqc(this, navigableMap0.tailMap(((ggbl)map$Entry0.getKey()), true).values().iterator()) : new ggqc(this, navigableMap0.tailMap(((ggbl)ggmr0.q()), true).values().iterator());
    }

    public final TimeRange c(Object object0) {
        if((object0 instanceof ggbl)) {
            try {
                if(!this.a.s(((ggbl)object0))) {
                    return null;
                }
                Map.Entry map$Entry0 = this.b.lowerEntry(((ggbl)object0));
                return map$Entry0 == null || !((TimeRange)map$Entry0.getValue()).c.equals(((ggbl)object0)) ? null : ((TimeRange)map$Entry0.getValue());
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

    private final NavigableMap d(TimeRange ggmr0) {
        TimeRange ggmr1 = this.a;
        if(ggmr0.w(ggmr1)) {
            TimeRange ggmr2 = ggmr0.k(ggmr1);
            return new ggqe(this.b, ggmr2);
        }
        return ggfz.c;
    }

    @Override
    public final Object get(Object object0) {
        return this.c(object0);
    }

    @Override
    public final NavigableMap headMap(Object object0, boolean z) {
        return this.d(TimeRange.p(((ggbl)object0), gfzd.a(z)));
    }

    @Override
    public final boolean isEmpty() {
        return this.a.equals(TimeRange.a) ? this.b.isEmpty() : !this.b().hasNext();
    }

    @Override
    public final int size() {
        return this.a.equals(TimeRange.a) ? this.b.size() : gghd.c(this.b());
    }

    @Override
    public final NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
        return this.d(TimeRange.n(((ggbl)object0), gfzd.a(z), ((ggbl)object1), gfzd.a(z1)));
    }

    @Override
    public final NavigableMap tailMap(Object object0, boolean z) {
        return this.d(TimeRange.i(((ggbl)object0), gfzd.a(z)));
    }
}

