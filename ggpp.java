import j..util.Objects;
import java.util.Iterator;

final class ggpp extends ggke {
    final Iterable a;
    final ggpx b;

    public ggpp(ggpx ggpx0, Iterable iterable0) {
        Objects.requireNonNull(ggpx0);
        this.b = ggpx0;
        super();
        this.a = iterable0;
    }

    @Override  // ggke
    public final Iterator b() {
        return this.a.iterator();
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public final Object get(Object object0) {
        if((object0 instanceof TimeRange)) {
            ggpq ggpq0 = (ggpq)this.b.b.get(((TimeRange)object0).b);
            return ggpq0 == null || !((TimeRange)ggpq0.getKey()).equals(((TimeRange)object0)) ? null : ggpq0.getValue();
        }
        return null;
    }

    @Override
    public final int size() {
        return this.b.b.size();
    }
}

