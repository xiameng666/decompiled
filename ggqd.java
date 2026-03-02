import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;

final class ggqd extends gfxn {
    final ggqe a;
    final gghb b;

    public ggqd(ggqe ggqe0, gghb gghb0) {
        this.b = gghb0;
        Objects.requireNonNull(ggqe0);
        this.a = ggqe0;
        super();
    }

    @Override  // gfxn
    protected final Object a() {
        gghb gghb0 = this.b;
        if(!gghb0.hasNext()) {
            this.c();
            return null;
        }
        TimeRange ggmr0 = (TimeRange)gghb0.next();
        ggbl ggbl0 = ggmr0.c;
        if(this.a.a.b.k(ggbl0)) {
            return new AbstractMap.SimpleImmutableEntry(ggbl0, ggmr0);
        }
        this.c();
        return null;
    }
}

