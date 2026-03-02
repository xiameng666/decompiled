import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;

final class ggqc extends gfxn {
    final Iterator a;
    final ggqe b;

    public ggqc(ggqe ggqe0, Iterator iterator0) {
        this.a = iterator0;
        Objects.requireNonNull(ggqe0);
        this.b = ggqe0;
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
        ggbl ggbl0 = ((TimeRange)object0).c;
        if(this.b.a.c.k(ggbl0)) {
            this.c();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(ggbl0, ((TimeRange)object0));
    }
}

