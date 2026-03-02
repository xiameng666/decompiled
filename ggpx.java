import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class ggpx implements ggms {
    public static final ggms a;
    public final NavigableMap b;

    static {
        ggpx.a = new ggpo();
    }

    public ggpx() {
        this.b = new TreeMap();
    }

    @Override  // ggms
    public final ggms a(TimeRange ggmr0) {
        return ggmr0.equals(TimeRange.a) ? this : new ggpw(this, ggmr0);
    }

    @Override  // ggms
    public final Map b() {
        return new ggpp(this, this.b.values());
    }

    @Override  // ggms
    public final void c(TimeRange ggmr0, Object object0) {
        if(!ggmr0.x()) {
            gftb.check(object0);
            this.e(ggmr0);
            ggpq ggpq0 = new ggpq(ggmr0, object0);
            this.b.put(ggmr0.b, ggpq0);
        }
    }

    @Override  // ggms
    public final void d(TimeRange ggmr0, Object object0) {
        NavigableMap navigableMap0 = this.b;
        if(navigableMap0.isEmpty()) {
            this.c(ggmr0, object0);
            return;
        }
        this.c(ggpx.f(ggpx.f(ggmr0, object0, navigableMap0.lowerEntry(ggmr0.b)), object0, navigableMap0.floorEntry(ggmr0.c)), object0);
    }

    @Override  // ggms
    public final void e(TimeRange ggmr0) {
        if(ggmr0.x()) {
            return;
        }
        NavigableMap navigableMap0 = this.b;
        ggbl ggbl0 = ggmr0.b;
        Map.Entry map$Entry0 = navigableMap0.lowerEntry(ggbl0);
        if(map$Entry0 != null) {
            ggpq ggpq0 = (ggpq)map$Entry0.getValue();
            if(ggpq0.b().a(ggbl0) > 0) {
                ggbl ggbl1 = ggpq0.b();
                ggbl ggbl2 = ggmr0.c;
                if(ggbl1.a(ggbl2) > 0) {
                    this.g(ggbl2, ggpq0.b(), ((ggpq)map$Entry0.getValue()).getValue());
                }
                this.g(ggpq0.a(), ggbl0, ((ggpq)map$Entry0.getValue()).getValue());
            }
        }
        ggbl ggbl3 = ggmr0.c;
        Map.Entry map$Entry1 = navigableMap0.lowerEntry(ggbl3);
        if(map$Entry1 != null) {
            ggpq ggpq1 = (ggpq)map$Entry1.getValue();
            if(ggpq1.b().a(ggbl3) > 0) {
                this.g(ggbl3, ggpq1.b(), ((ggpq)map$Entry1.getValue()).getValue());
            }
        }
        navigableMap0.subMap(ggbl0, ggbl3).clear();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggms) ? this.b().equals(((ggms)object0).b()) : false;
    }

    private static TimeRange f(TimeRange ggmr0, Object object0, Map.Entry map$Entry0) {
        return map$Entry0 == null || !((TimeRange)((ggpq)map$Entry0.getValue()).getKey()).w(ggmr0) || !((ggpq)map$Entry0.getValue()).getValue().equals(object0) ? ggmr0 : ggmr0.o(((TimeRange)((ggpq)map$Entry0.getValue()).getKey()));
    }

    private final void g(ggbl ggbl0, ggbl ggbl1, Object object0) {
        ggpq ggpq0 = new ggpq(ggbl0, ggbl1, object0);
        this.b.put(ggbl0, ggpq0);
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override
    public final String toString() {
        return this.b.values().toString();
    }
}

