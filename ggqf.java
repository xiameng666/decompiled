import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;

final class ggqf extends gfxn {
    final Iterator a;
    final ggbl b;
    final ggqh c;

    public ggqf(ggqh ggqh0, Iterator iterator0, ggbl ggbl0) {
        this.a = iterator0;
        this.b = ggbl0;
        Objects.requireNonNull(ggqh0);
        this.c = ggqh0;
        super();
    }

    @Override  // gfxn
    protected final Object a() {
        Iterator iterator0 = this.a;
        if(!iterator0.hasNext()) {
            this.c();
            return null;
        }
        Object object0 = iterator0.next();
        if(this.b.k(((TimeRange)object0).b)) {
            this.c();
            return null;
        }
        TimeRange ggmr0 = ((TimeRange)object0).k(this.c.b);
        return new AbstractMap.SimpleImmutableEntry(ggmr0.b, ggmr0);
    }
}

