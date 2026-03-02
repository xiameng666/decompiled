import java.util.AbstractMap.SimpleImmutableEntry;

final class ggpq extends AbstractMap.SimpleImmutableEntry {
    public ggpq(ggbl ggbl0, ggbl ggbl1, Object object0) {
        super(new TimeRange(ggbl0, ggbl1), object0);
    }

    public ggpq(TimeRange ggmr0, Object object0) {
        super(ggmr0, object0);
    }

    final ggbl a() {
        return ((TimeRange)this.getKey()).b;
    }

    final ggbl b() {
        return ((TimeRange)this.getKey()).c;
    }
}

