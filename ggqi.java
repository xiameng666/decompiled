import j..util.Objects;
import java.io.Serializable;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public final class ggqi extends gfyu implements Serializable {
    public final NavigableMap a;
    private transient Set b;
    private transient ggmt c;

    public ggqi(ggqi ggqi0) {
        Objects.requireNonNull(ggqi0);
        this(new ggqb(ggqi0.a, TimeRange.a));
    }

    public ggqi(NavigableMap navigableMap0) {
        this.a = navigableMap0;
    }

    @Override  // gfyu
    public final void a(TimeRange ggmr0) {
        gftb.check(ggmr0);
        if(ggmr0.x()) {
            return;
        }
        ggbl ggbl0 = ggmr0.b;
        ggbl ggbl1 = ggmr0.c;
        NavigableMap navigableMap0 = this.a;
        Map.Entry map$Entry0 = navigableMap0.lowerEntry(ggbl0);
        if(map$Entry0 != null) {
            TimeRange ggmr1 = (TimeRange)map$Entry0.getValue();
            ggbl ggbl2 = ggmr1.c;
            if(ggbl2.a(ggbl0) >= 0) {
                if(ggbl2.a(ggbl1) >= 0) {
                    ggbl1 = ggbl2;
                }
                ggbl0 = ggmr1.b;
            }
        }
        Map.Entry map$Entry1 = navigableMap0.floorEntry(ggbl1);
        if(map$Entry1 != null) {
            ggbl ggbl3 = ((TimeRange)map$Entry1.getValue()).c;
            if(ggbl3.a(ggbl1) >= 0) {
                ggbl1 = ggbl3;
            }
        }
        navigableMap0.subMap(ggbl0, ggbl1).clear();
        this.e(new TimeRange(ggbl0, ggbl1));
    }

    @Override  // gfyu
    public final void b(TimeRange ggmr0) {
        if(ggmr0.x()) {
            return;
        }
        NavigableMap navigableMap0 = this.a;
        ggbl ggbl0 = ggmr0.b;
        Map.Entry map$Entry0 = navigableMap0.lowerEntry(ggbl0);
        if(map$Entry0 != null) {
            TimeRange ggmr1 = (TimeRange)map$Entry0.getValue();
            ggbl ggbl1 = ggmr1.c;
            if(ggbl1.a(ggbl0) >= 0) {
                if(ggmr0.v()) {
                    ggbl ggbl2 = ggmr0.c;
                    if(ggbl1.a(ggbl2) >= 0) {
                        this.e(new TimeRange(ggbl2, ggbl1));
                    }
                }
                this.e(new TimeRange(ggmr1.b, ggbl0));
            }
        }
        ggbl ggbl3 = ggmr0.c;
        Map.Entry map$Entry1 = navigableMap0.floorEntry(ggbl3);
        if(map$Entry1 != null) {
            TimeRange ggmr2 = (TimeRange)map$Entry1.getValue();
            if(ggmr0.v()) {
                ggbl ggbl4 = ggmr2.c;
                if(ggbl4.a(ggbl3) >= 0) {
                    this.e(new TimeRange(ggbl3, ggbl4));
                }
            }
        }
        navigableMap0.subMap(ggbl0, ggbl3).clear();
    }

    public static ggqi c() {
        return new ggqi(new TreeMap());
    }

    public static ggqi d(Iterable iterable0) {
        ggqi ggqi0 = ggqi.c();
        for(Object object0: iterable0) {
            ggqi0.a(((TimeRange)object0));
        }
        return ggqi0;
    }

    private final void e(TimeRange ggmr0) {
        if(ggmr0.x()) {
            this.a.remove(ggmr0.b);
            return;
        }
        this.a.put(ggmr0.b, ggmr0);
    }

    @Override  // ggmt
    public final ggmt f() {
        ggmt ggmt0 = this.c;
        if(ggmt0 == null) {
            ggmt0 = new ggqi(this);
            this.c = ggmt0;
        }
        return ggmt0;
    }

    @Override  // ggmt
    public final Set g() {
        Set set0 = this.b;
        if(set0 == null) {
            Set set1 = new ggpy(this, this.a.values());
            this.b = set1;
            return set1;
        }
        return set0;
    }

    @Override  // ggmt
    public final boolean h(TimeRange ggmr0) {
        gftb.check(ggmr0);
        Map.Entry map$Entry0 = this.a.floorEntry(ggmr0.b);
        return map$Entry0 != null && ((TimeRange)map$Entry0.getValue()).t(ggmr0);
    }
}

