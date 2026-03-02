import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;

public final class ggqh extends gfyt {
    public final TimeRange a;
    public final TimeRange b;
    private final NavigableMap c;
    private final NavigableMap d;

    public ggqh(TimeRange ggmr0, TimeRange ggmr1, NavigableMap navigableMap0) {
        gftb.check(ggmr0);
        this.a = ggmr0;
        gftb.check(ggmr1);
        this.b = ggmr1;
        gftb.check(navigableMap0);
        this.c = navigableMap0;
        this.d = new ggqe(navigableMap0);
    }

    @Override  // gfyt
    public final Iterator a() {
        TimeRange ggmr0 = this.b;
        if(ggmr0.x()) {
            return gggw.a;
        }
        ggbk ggbk0 = new ggbk(ggmr0.c);
        ggbl ggbl0 = (ggbl)ggmi.a.m(this.a.c, ggbk0);
        ggbl ggbl1 = (ggbl)ggbl0.f();
        return ggbl0.c() == gfzd.b ? new ggqg(this, this.c.headMap(ggbl1, true).descendingMap().values().iterator()) : new ggqg(this, this.c.headMap(ggbl1, false).descendingMap().values().iterator());
    }

    @Override  // ggke
    public final Iterator b() {
        Iterator iterator0;
        TimeRange ggmr0 = this.b;
        if(ggmr0.x()) {
            return gggw.a;
        }
        TimeRange ggmr1 = this.a;
        ggbl ggbl0 = ggmr1.c;
        ggbl ggbl1 = ggmr0.b;
        if(ggbl0.k(ggbl1)) {
            return gggw.a;
        }
        ggbl ggbl2 = ggmr1.b;
        boolean z = false;
        if(ggbl2.k(ggbl1)) {
            iterator0 = this.d.tailMap(ggbl1, false).values().iterator();
        }
        else {
            NavigableMap navigableMap0 = this.c;
            ggbl ggbl3 = (ggbl)ggbl2.f();
            if(ggmr1.c() == gfzd.b) {
                z = true;
            }
            iterator0 = navigableMap0.tailMap(ggbl3, z).values().iterator();
        }
        ggbk ggbk0 = new ggbk(ggmr0.c);
        return new ggqf(this, iterator0, ((ggbl)ggmi.a.m(ggbl0, ggbk0)));
    }

    public final TimeRange c(Object object0) {
        if((object0 instanceof ggbl)) {
            try {
                if(this.a.s(((ggbl)object0))) {
                    TimeRange ggmr0 = this.b;
                    ggbl ggbl0 = ggmr0.b;
                    if(((ggbl)object0).a(ggbl0) >= 0 && ((ggbl)object0).a(ggmr0.c) < 0) {
                        if(((ggbl)object0).equals(ggbl0)) {
                            Map.Entry map$Entry0 = this.c.floorEntry(((ggbl)object0));
                            Object object1 = map$Entry0 == null ? null : map$Entry0.getValue();
                            return ((TimeRange)object1) == null || ((TimeRange)object1).c.a(ggbl0) <= 0 ? null : ((TimeRange)object1).k(ggmr0);
                        }
                        TimeRange ggmr1 = (TimeRange)this.c.get(((ggbl)object0));
                        return ggmr1 == null ? null : ggmr1.k(ggmr0);
                    }
                }
                return null;
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
        return !ggmr0.w(ggmr1) ? ggfz.c : new ggqh(ggmr1.k(ggmr0), this.b, this.c);
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
    public final int size() {
        return gghd.c(this.b());
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

