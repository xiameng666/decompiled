import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;

final class ggqg extends gfxn {
    final Iterator a;
    final ggqh b;

    public ggqg(ggqh ggqh0, Iterator iterator0) {
        this.a = iterator0;
        Objects.requireNonNull(ggqh0);
        this.b = ggqh0;
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
        ggqh ggqh0 = this.b;
        TimeRange ggmr0 = ggqh0.b;
        if(ggmr0.b.a(((TimeRange)object0).c) >= 0) {
            this.c();
            return null;
        }
        TimeRange ggmr1 = ((TimeRange)object0).k(ggmr0);
        ggbl ggbl0 = ggmr1.b;
        if(ggqh0.a.s(ggbl0)) {
            return new AbstractMap.SimpleImmutableEntry(ggbl0, ggmr1);
        }
        this.c();
        return null;
    }
}

